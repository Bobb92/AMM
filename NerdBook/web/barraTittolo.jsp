<%-- 
    Document   : barraTittolo
    Created on : 17-mag-2017, 17.11.29
    Author     : Salvatore
--%>

    
     <div id="barratitolo">
         
            <div id="titolo">
                <h1>NerdBook</h1>
            </div>
        
            <div id="menuNavigazione">
                <nav>
                    <c:if test="${page=='bacheca'}" class="active"</c:if><a href="Bacheca">Bacheca</a>
                    <c:if test="${page=='Profilo'}" class="active"</c:if><a href="Profilo">Profilo</a>
                </nav>
            </div>
            
            <div id="utente">
               <c:if test="${not empty param.utente}">
                    
                    <p>${utente.nome}</p>
                    <a href="Login?logout=1" id="pulsantelogout">logout</a>
                    
                </c:if>
            </div>
                
        </div>
