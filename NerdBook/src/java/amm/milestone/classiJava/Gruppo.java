/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone.classiJava;

import java.util.ArrayList;

/**
 *
 * @author Salvatore
 */
public class Gruppo {
    
    private int id;
    private Utente creatore = new Utente();
    private String nome;
    private String descrizione;
    
    private ArrayList<Integer> listaUtente;
    
    private ArrayList<Post> listaPost;
    
    public Gruppo(){
        id = 0;
        nome = "";
        creatore = null;
        descrizione = "";
        listaUtente = new ArrayList<>();
        listaPost = new ArrayList<>();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Utente getCreatore(){
        return creatore;
    }
    
    public void setCreatore(Utente creatore){
        this.creatore = creatore;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescrizione(){
        return descrizione;
    }
    
    public void setDescrizione(String descrizione){
        this.descrizione = descrizione;
    }
    
    public ArrayList getListaUtente(){
        return listaUtente;
    }
    
    public void addUtente(int utente){
        
        this.listaUtente.add(utente);
        
    }
    
    public ArrayList getListaPost(){
        return listaPost;
    }
    
    public void addPost(Post post){
        this.listaPost.add(post);
    }
    
    
    
}
