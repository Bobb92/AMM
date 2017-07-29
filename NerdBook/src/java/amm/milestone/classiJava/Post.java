/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone.classiJava;

/**
 *
 * @author Salvatore
 */
public class Post {
    
    public enum Tipo { TEXT, IMAGE };
    
    private int id;
    private int utente;
    private String contenuto;
    private String allegato;
    private Tipo postType;
    
    public Post() {
        id = 0;
        utente = 0;
        contenuto = "";
        allegato="";
        postType = Tipo.TEXT ;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getUtente(){
        return utente;
    }
    
    public void setUtente(Utente utente){
        this.utente = utente.getId();
    }
    
    public String getcontenuto(){
        return contenuto;
    }
    
    public void stecontenuto(String contenuto){
        this.contenuto = contenuto;
    }
    
    public Tipo getpostType(){
        return postType;
    }
    
    public void setpostType(Tipo tipoPost){
        this.postType = tipoPost;
    }
    
    public String getAllegato(){
        return allegato;
    }
    
    public void setAllegato(String allegato){
        this.allegato = allegato;
    }


}
