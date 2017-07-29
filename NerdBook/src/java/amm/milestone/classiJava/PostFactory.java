/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.milestone.classiJava;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Salvatore
 */
public class PostFactory {
    
    private static PostFactory singleton;
    
    private String connectionString;

    public static PostFactory getInstance() {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
    }
    
    public void setConnectionString(String s){
	this.connectionString = s;
    }
    
    public String getConnectionString(){
	return this.connectionString;
    }    
    
    
    private ArrayList<Post> listaPost = new ArrayList<>();
    
    
    private PostFactory(){
        
        UtenteFactory utenteFactory = UtenteFactory.getInstance();
        
        
        Post post1 = new Post();
        post1.setId(0);
        post1.setUtente(utenteFactory.getUtenteById(0));
        post1.stecontenuto("Buongiorno Buongiorno mi chiamo francesco!!!");
        post1.setAllegato("");
        post1.setpostType(Post.Tipo.TEXT);
        
        Post post2 = new Post();
        post2.setId(1);
        post2.setUtente(utenteFactory.getUtenteById(0));
        post2.stecontenuto("Scusa Scusa Scusa, non capisco che stai dicendo");
        post2.setAllegato("IMG/cane-sordo.jpg");
        post2.setpostType(Post.Tipo.IMAGE);
        
        Post post3 = new Post();
        post3.setId(2);
        post3.setUtente(utenteFactory.getUtenteById(1));
        post3.stecontenuto("che barba che noia che barba, ste erbe sono tutte uguali");
        post3.setAllegato("");
        post3.setpostType(Post.Tipo.TEXT);
        
        Post post4 = new Post();
        post4.setId(3);
        post4.setUtente(utenteFactory.getUtenteById(1));
        post4.stecontenuto("Dobbiamo stare vicini vicini <3");
        post4.setAllegato("https://www.google.it/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwiR-uD-k_TTAhVlG5oKHd1BDWQQjRwIBw&url=http%3A%2F%2Fwww.tuttozampe.com%2Flettiera-coniglio%2F30601%2F&psig=AFQjCNFPUqs3s2JcUuqLZGggegzF8d_zGA&ust=1495015227045074");
        post4.setpostType(Post.Tipo.IMAGE);
        
        Post post5 = new Post();
        post5.setId(4);
        post5.setUtente(utenteFactory.getUtenteById(2));
        post5.stecontenuto("che palle questi umani non capiscono che a me piace rotolarmi nel fango ed essere sempre sporco!!!!");
        post5.setAllegato("");
        post5.setpostType(Post.Tipo.TEXT);
        
        Post post6 = new Post();
        post6.setId(5);
        post6.setUtente(utenteFactory.getUtenteById(2));
        post6.stecontenuto("Oh mia bella maialonaaaaa, vieni qui che ti faccio cantareeeee!!!");
        post6.setAllegato("https://www.google.it/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=0ahUKEwi13JLslPTTAhXiJ5oKHUO1DCQQjRwIBw&url=https%3A%2F%2Fit.dreamstime.com%2Ffotografia-stock-dentelli-la-scrofa-image25295040&psig=AFQjCNEKvjS8a4E8vjjwTw-1mX5iWbeBWQ&ust=1495015479461984");
        post6.setpostType(Post.Tipo.IMAGE);
    
        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        listaPost.add(post4);
        listaPost.add(post5);
        listaPost.add(post6);
    
    
    
    }
    
    
    public Post getPostById(int id) {
        
        for (Post post : this.listaPost) {
            
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }

    public List getPostList(Utente utt) {

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) {
            
            if (post.getUtente()==utt.getId()) {
                
                listaPost.add(post);
            }
        }
        
        return listaPost;
    }
    
    
}
