<%-- 
    Document   : barraLatterale
    Created on : 17-mag-2017, 17.04.33
    Author     : Salvatore
--%>


        <div id="barralaterale">
            
           <div id="amici">
               <h2 id="titleamici">Amici</h2>
               <ul>
                   <c:forEach var="amici" item="${utenti}">
                       <li>${amici.nome}</li>
                   </c:forEach>
               </ul>
           </div> 
            
           <div id="gruppi">
               <h2 id="titlegruppi">Gruppi</h2>              
               <ul>
                   <c:forEach var="gruppo" item="${gruppi}">
                       <li>${gruppo.nome}</li>   
                   </c:forEach>
               </ul>
           </div>  
                   
        </div>
                   
