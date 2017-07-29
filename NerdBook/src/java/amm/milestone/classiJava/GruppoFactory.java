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
public class GruppoFactory {
    
    private static GruppoFactory singleton;
    private String connectionString;

    public static GruppoFactory getInstance() {
        if (singleton == null) {
           singleton = new GruppoFactory();
        }      
        return singleton;
    }

    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
	return this.connectionString;
    }
    
    private ArrayList<Gruppo> listaGruppo = new ArrayList<Gruppo>();
    
    
    public GruppoFactory(){
        
        UtenteFactory utenteFactory = UtenteFactory.getInstance();
        PostFactory postFactory = PostFactory.getInstance();
        
        
        Gruppo gruppo1 = new Gruppo();
        gruppo1.setId(0);
        gruppo1.setNome("COD");
        gruppo1.setDescrizione("gruppo dei giocatori di COD");
        gruppo1.setCreatore(utenteFactory.getUtenteById(0));
        gruppo1.addUtente(0);
        gruppo1.addUtente(2);
        gruppo1.addPost(postFactory.getPostById(0));
        gruppo1.addPost(postFactory.getPostById(1));
        
        Gruppo gruppo2 = new Gruppo();
        gruppo2.setId(1);
        gruppo2.setNome("lavoro");
        gruppo2.setDescrizione("gruppo dei lavoratori in informatica");
        gruppo2.setCreatore(utenteFactory.getUtenteById(1));
        gruppo2.addUtente(1);
        gruppo2.addUtente(2);
        gruppo2.addUtente(0);
        gruppo2.addPost(postFactory.getPostById(2));
        gruppo2.addPost(postFactory.getPostById(3));
        
        Gruppo gruppo3 = new Gruppo();
        gruppo3.setId(2);
        gruppo3.setNome("casa");
        gruppo3.setDescrizione("FAMIGLIAAAAAAA");
        gruppo3.setCreatore(utenteFactory.getUtenteById(2));
        gruppo3.addUtente(1);
        gruppo3.addUtente(0);
        gruppo3.addUtente(2);
        gruppo3.addPost(postFactory.getPostById(4));
        gruppo3.addPost(postFactory.getPostById(5));
        
        listaGruppo.add(gruppo1);
        listaGruppo.add(gruppo2);
        listaGruppo.add(gruppo3);

    }
    
    
    
    public Gruppo getPostById(int id) {
        
        for (Gruppo gruppo : this.listaGruppo) {
            
            if (gruppo.getId() == id) {
                return gruppo;
            }
        }
        return null;
    }
    /*
    funzione che permette di avere la lista dei gruppi a cui un utente partecipa
    in ingresso prende l'utente partecipante a dei gruppi ,
    nella lista dei gruppi di tutto il social si va cercare a quali gruppi l'utente appartiene
    */
    public ArrayList getListaGruppiPartecipanti(Utente utente) {

        ArrayList<Gruppo> listagruppi = new ArrayList<>();
        
        ArrayList<Integer> gruppo1 = new ArrayList<>();//array di interi come appoggio nella selezione della lista utenti
        
        for (Gruppo gruppo : this.listaGruppo) {
            
            gruppo1.addAll(gruppo.getListaUtente());
            
            for (Integer uttGrup : gruppo1 ){
                
                if (uttGrup == utente.getId()){

                    listagruppi.add(gruppo);
                    
                }
            }    
            gruppo1.clear();//gruppo1 viene cancellato ad ogni ciclo
        } 
        
        return listagruppi;
    }
    
    public ArrayList getPostListByCreatore(Utente utente){
        
        ArrayList<Gruppo> listagruppi = new ArrayList<Gruppo>();
        
        for (Gruppo gruppo : this.listaGruppo) {
            
            if (gruppo.getCreatore().equals(utente)) {
                
                listagruppi.add(gruppo);
            }
        }
        
        return listagruppi;        
        
    
    }
    
    
    public boolean esiste(Gruppo gruppo1){
        
        for(Gruppo gruppo :this.listaGruppo){
            if(gruppo.getNome() == gruppo1.getNome() && gruppo.getCreatore().equals(gruppo1.getCreatore())){
                return true;
            }
        }
        
        return false;
    
    }
    
    
}
