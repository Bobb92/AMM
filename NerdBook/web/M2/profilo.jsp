<%-- 
    Document   : profilo
    Created on : 17-mag-2017, 16.57.57
    Author     : Salvatore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="barraLatterale.jsp" %>
<%@include file="barraTittolo.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="autore" content="Bobbore P.">
        <meta name="keywords" content="Nerdbook, social, nerd">
        <meta name="description" content="Progetto AMM--pagine dove inseriamo tutti i dati di un utente"> 
        <link rel="stylesheet" href="style.css" type="text/css" >
    </head>
    <body id="body">
        
        <div id="scatolaDati">
            
            <form id="datiProfilo" action="pagincacaso" method="post">
                
                <div id='nomeprof'>
                    <label for='nome'>Nome</label>
                    <input name="nome" type="text" value="NOME" id='nome'/>
                </div>
                
                
                <div id='cognomeprof'>
                    <label for='cognome'>Cogome</label>
                    <input name="cognome" type="text" value="COGNOME" id='cognome' />
                </div>
                
                
                <div id='datanascitaprof'>
                    <label for='datanascita'>Data di nascita</label>
                    <input name="data" type="date" id='datanascita'/>
                </div>
                
                
                <div id='fotoprof'>
                    <label for='foto'>Scegli la foto Profilo</label>
                    <input name="foto" type="file" accept="image/*" id='foto'/>
                </div>
                
                
                <div id="email">
                    <label for='Email'>Email</label>
                    <input id='Email' name="email" type="email" value="inserisci al tua email"/>
                </div>
                
                <div id='passwordprof'>
                    <label for='password'> password</label>
                    <input id='password' name="password" type="password" value="inserire la password"/>
                </div>
                
                
                <div id='confermapasswordprof'>
                    <label for='confermapassword'> conferma password</label>
                    <input id='confermapassword' name="confermapassword" type="password" value="inserire la password"/>
                </div>
                
                <div id='descrizioneprof'>
                    <p>una breve descrizione di te</p>
                    <textarea id='descrizione' name="testo" rows="5" cols="50" maxlength="1000">Inserisci una breve descrizione di te</textarea>
                </div>
                
                <div id="scatolaPulasnti">
                    <input name="reset" type='reset' value='RESETTTTTTT'/>
                    <input name="ok" type='submit' value='OOOOOOK'/>
                </div>
                
            </form>
        </div>
        
    </body>
</html>
