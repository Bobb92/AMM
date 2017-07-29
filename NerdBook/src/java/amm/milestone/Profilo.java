/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone;

import amm.milestone.classiJava.Utente;
import amm.milestone.classiJava.UtenteFactory;
import amm.milestone.classiJava.Gruppo;
import amm.milestone.classiJava.GruppoFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Salvatore
 */

public class Profilo extends HttpServlet {

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
        
        HttpSession session = request.getSession(false);
        
        
        if (session.getAttribute("loggedIn") == null){
            
            request.setAttribute("loggedIn", false);
            request.getRequestDispatcher("login.jsp").forward(request, response);
            
        }
        
        int loggedUserID =  (int) session.getAttribute("loggedUserID");
        
        Utente utente = UtenteFactory.getInstance().getUtenteById(loggedUserID);
        
        if (utente != null){     
            
            if(request.getAttribute("nome") != null && request.getAttribute("cognome")!=null && request.getAttribute("data")!=null &&
               request.getAttribute("foto")!= null && request.getAttribute("Email")!= null && request.getAttribute("password")!=null){

               request.setAttribute("datiInviati", true);

               request.setAttribute("nomeInviato", request.getAttribute("nome"));
               request.setAttribute("cognomeInviato", request.getAttribute("cognome"));
               request.setAttribute("dataInviato", request.getAttribute("data"));
               request.setAttribute("fotoInviato", request.getAttribute("foto"));
               request.setAttribute("EmailInviato", request.getAttribute("Email"));
               request.setAttribute("passwordInviato", request.getAttribute("password"));
               
               utente.setNome((String) request.getAttribute("nome"));
               utente.setCognome((String) request.getAttribute("cognome"));
               utente.setCompleanno((Calendar) request.getAttribute("data"));
               utente.setUrlImmaggine((String) request.getAttribute("foto"));
               utente.setEmail((String) request.getAttribute("Email"));
               utente.setPassword((String) request.getAttribute("password"));
               

               request.getRequestDispatcher("profilo.jsp").forward(request, response);
               return;
            }
            
            request.getRequestDispatcher("profilo.jsp").forward(request, response);
            return;
             
        }else{
            
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }  
        

        request.getRequestDispatcher("profilo.jsp").forward(request, response);
        
        
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
