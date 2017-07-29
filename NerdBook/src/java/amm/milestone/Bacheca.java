/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone;

import amm.milestone.classiJava.PostFactory;
import amm.milestone.classiJava.Post;
import amm.milestone.classiJava.Gruppo;
import amm.milestone.classiJava.GruppoFactory;
import amm.milestone.classiJava.Utente;
import amm.milestone.classiJava.UtenteFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Salvatore
 */
public class Bacheca extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
        HttpSession session = request.getSession();
        
        
        if (session.getAttribute("loggedIn") == null ){
            
            session.setAttribute("loggedIn", false);
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
            
        }else {
            
            int loggedUserID =  (int) session.getAttribute("loggedUserID");
            
            Utente utente = UtenteFactory.getInstance().getUtenteById(loggedUserID);
            
            if(loggedUserID != utente.getId()){
                
                session.setAttribute("loggedIn", false);
                request.getRequestDispatcher("login.jsp").forward(request, response);
                return;
            }
            
            session.setAttribute("utente", utente);
            session.setAttribute("gruppi", GruppoFactory.getInstance().getListaGruppiPartecipanti(utente)); //gruppi
            session.setAttribute("utenti", UtenteFactory.getInstance().getListaUtenti());
            session.setAttribute("posts", PostFactory.getInstance().getPostList(utente));
            request.getRequestDispatcher("Bacheca.jsp").forward(request, response);
            
            return;
        }
        
        
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
