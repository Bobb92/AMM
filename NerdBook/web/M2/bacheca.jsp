<%-- 
    Document   : bacheca
    Created on : 16-mag-2017, 18.48.29
    Author     : Salvatore
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="barraLatterale.jsp" %>
<%@include file="barraTittolo.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>NerdBook</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="autore" content="Bobbore P.">
        <meta name="keywords" content="Nerdbook, social, nerd">
        <meta name="description" content="Progetto AMM--pagina dove l'utente posta foto,link,etc">
        <link rel="stylesheet" href="style.css" type="text/css" >
    </head>
    
    <body id="body">

        <div id="bacheca">
            
            <c:forEach var="post" items="${posts}">
                
                    <div id='post1'>
                        <img src="${utente.urlImmaggine}" alt="FOTOPROFILO" id="fotoProfilo">
                        <c:if test="${post.tipoPost == 'TEXT'}">
                            <p>${post.contenuto}</p>
                        </c:if>
                        <c:if test="${post.tipoPost == 'IMAGE'}">
                            <img alt="Post con foto" src="${post.allegato}">
                        </c:if>
                    </div>
             
            </c:forEach>
            
        </div>
       
    </body>
        
</html>
