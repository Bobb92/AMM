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
public class UtenteFactory {
    
    private static UtenteFactory singleton;
    
    private String connectionString;

    public static UtenteFactory getInstance() {
        if (singleton == null) {
            singleton = new UtenteFactory();
        }
        return singleton;
    }
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
	return this.connectionString;
    }
    
    private ArrayList<Utente> listaIUtenti = new ArrayList<>();
    
    
    private UtenteFactory() {
        //Creazione utenti

        Utente utente1 = new Utente();
        utente1.setId(0);
        utente1.setNome("Cane");
        utente1.setCognome("mordo");
        utente1.setEmail("Canecane@gmail.com");
        utente1.setPassword("123");
        utente1.setUrlImmaggine("IMG/cane.jpg");
        utente1.setDescrizione("bau bau");
        
        Utente utente2 = new Utente();
        utente2.setId(1);
        utente2.setNome("Coniglietto");
        utente2.setCognome("carino");
        utente2.setEmail("Coniconiglietto@gmail.com");
        utente2.setPassword("123");
        utente2.setUrlImmaggine("IMG/coniglietto.jpg");
        utente2.setDescrizione("gni gni");
        
        Utente utente3 = new Utente();
        utente3.setId(2);
        utente3.setNome("Maialino");
        utente3.setCognome("puzzo");
        utente3.setEmail("maialino@gmail.com");
        utente3.setPassword("123");
        utente3.setUrlImmaggine("IMG/maialino.jpg");
        utente3.setDescrizione("crow corw");
        
        Utente utente4 = new Utente();
        utente4.setId(3);
        utente4.setNome("Merda");
        utente4.setEmail("Merda@gmail.com");
        utente4.setPassword("123");
        utente4.setUrlImmaggine("");


        listaIUtenti.add(utente1);
        listaIUtenti.add(utente2);
        listaIUtenti.add(utente3);
        listaIUtenti.add(utente4);
    }
    
    public Utente getUtenteById(int id) {
        for (Utente uente : this.listaIUtenti) {
            if (uente.getId() == id) {
                return uente;
            }
        }
        return null;
    }
    
    public int getIdByUserAndPassword(String user, String password){
        for(Utente utente : this.listaIUtenti){
            if(utente.getNome().equals(user) && utente.getPassword().equals(password)){
                return utente.getId();
            }
        }
        return -1;
    }
    
    public ArrayList<Utente> getListaUtenti(){
        return this.listaIUtenti;
    }
    
    
}
