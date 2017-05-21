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

    public static GruppoFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppoFactory();
        }
        return singleton;
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
        gruppo1.addUtente(utenteFactory.getUtenteById(0));
        gruppo1.addUtente(utenteFactory.getUtenteById(2));
        gruppo1.addPost(postFactory.getPostById(0));
        gruppo1.addPost(postFactory.getPostById(1));
        
        Gruppo gruppo2 = new Gruppo();
        gruppo2.setId(1);
        gruppo2.setNome("lavoro");
        gruppo2.setDescrizione("gruppo dei lavoratori in informatica");
        gruppo2.setCreatore(utenteFactory.getUtenteById(1));
        gruppo2.addUtente(utenteFactory.getUtenteById(1));
        gruppo2.addUtente(utenteFactory.getUtenteById(0));
        gruppo2.addUtente(utenteFactory.getUtenteById(2));
        gruppo2.addPost(postFactory.getPostById(2));
        gruppo2.addPost(postFactory.getPostById(3));
        
        Gruppo gruppo3 = new Gruppo();
        gruppo3.setId(1);
        gruppo3.setNome("casa");
        gruppo3.setDescrizione("FAMIGLIAAAAAAA");
        gruppo3.setCreatore(utenteFactory.getUtenteById(2));
        gruppo3.addUtente(utenteFactory.getUtenteById(1));
        gruppo3.addUtente(utenteFactory.getUtenteById(0));
        gruppo3.addUtente(utenteFactory.getUtenteById(2));
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

    public ArrayList getPostListByCreatore(Utente utt) {

        ArrayList<Gruppo> listagruppi = new ArrayList<Gruppo>();

        for (Gruppo gruppo : this.listaGruppo) {
            
            if (gruppo.getCreatore().equals(utt)) {
                
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
