package amm.milestone.classiJava;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * @author Salvatore
 */
public class Utente {
    
    private int id;
    private String nome,cognome,password,urlImmaggine,descrizione,email;  
    private Calendar compleanno = new GregorianCalendar();
    
    public Utente() {
        id = 0;
        nome = "";
        cognome="";
        compleanno.set(2017, 05, 5);
        descrizione="";
        email = "";
        password = "";
        urlImmaggine = "";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
     /**
     * @return the nome
     */
    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public Calendar getCompleanno() {
        return compleanno;
    }

    public void setCompleanno(Calendar compleanno) {
        this.compleanno = compleanno;
    }
    
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUrlImmaggine() {
        return urlImmaggine;
    }

    public void setUrlImmaggine(String urlImmaggine) {
        this.urlImmaggine = urlImmaggine;
    }
    
    @Override
    public boolean equals(Object altroUternte) {
        if (altroUternte instanceof Utente)
            if (this.getId() == ((Utente)altroUternte).getId()) return true;
        return false;
    }
    
}
