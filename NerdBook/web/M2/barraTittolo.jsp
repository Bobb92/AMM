<%-- 
    Document   : barraTittolo
    Created on : 17-mag-2017, 17.11.29
    Author     : Salvatore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
     <div id="barratitolo">
            <div id="titolo">
                <h1>NerdBook</h1>
            </div>
        
            <div id="menuNavigazione">
                <nav>
                    <a href="profilo.html" id="pulsanteDescrizione"> Profilo </a>
                    <a href="bacheca.html" id="pulsanteprofilo"> Bacheca </a> 
                </nav>
            </div>
            
            <div id="utente">
                <c:if test=${empty param.username}>
                    
                    <p>${utente.nome}</p>
                    <a href="login?logout=1" id="pulsantelogout">logout</a>
                    
                </c:if>  
            </div>
                
        </div>
</html>
