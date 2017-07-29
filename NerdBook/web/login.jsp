<%-- 
    Document   : login
    Created on : 17-mag-2017, 17.29.23
    Author     : Salvatore
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        
        <c:set var="page" value="Login" scope="request"/>
        
        <div id="titoloLogin">
              <h1>NerdBook</h1>
        </div>
        
        <form id="ScatolaGrandeinfo" action="Login" method="post">
            
            <div>
                <c:if test="${invalidData == true}">
                    <p><c:out value = "Dati non corretti"/></p>
                </c:if>

                <div id="scatolaEmail">
                    <p>Inserire nome utente</p>
                    <input name="utente" type="text" value="" id='email'/>
                </div>
                
                <div id="scatolaPassword">
                    <p>Inserire la vostra password</p>
                    <input name="password" type="password" value="" id='password'/>
                </div>
                               
            </div>

            <div id="scatolaPulasnti">
                 <input name="reset" type='reset' value='RESETTTTTTT'/>
                 <input name="ok" type='submit' value='OOOOOOK'/>
            </div>

        </form>
        
    </body>
</html>
