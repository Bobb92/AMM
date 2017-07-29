
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="autore" content="Bobbore P.">
        <meta name="keywords" content="Nerdbook, social, nerd">
        <meta name="description" content="Progetto AMM--pagina dove l'utente può effettuare l'accesso al suo profilo">
        <link rel="stylesheet" href="style.css" type="text/css" >
    </head>
    
    <body id="bodylogin">
        
        <c:set var="title" value="Login" scope="request"/>
            
        <div id="titoloLogin">
              <h1>NerdBook</h1>
        </div>
        
        <c:if test="${invalidData == true}">
            <p>Dati non corretti</p>
        </c:if>
            
        <form id="ScatolaGrandeinfo" action="login.html" method="post">
            
            <div>
                

                <div id="scatolaEmail">
                    <p>Inserire la vostra e-mail</p>
                    <input name="utente" type="text" value="" id='email'/>
                </div>
                
                <div id="scatolaPassword">
                    <p>Inserire la vostra password</p>
                    <input name="password" type="password" value="" id='password'/>
                </div>
                               
            </div>

            <div id="scatolaPulasnti">
                 <input  type='reset' value='RESETTTTTTT'/>
                 <button type="submit">OOOOK</button>
            </div>

        </form>
        
    </body>
</html>
