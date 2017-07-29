<%-- 
    Document   : barraLatterale
    Created on : 17-mag-2017, 17.04.33
    Author     : Salvatore
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <div id="barralaterale">
            
           <div id="amici">
               <h2 id="titleamici">Amici</h2>
               <ul>
                   <li> Sub esperto </li>
                   <li> Animale coccoloso </li> 
                   <li> Porco Maiale </li>
               </ul>
           </div> 
           <div id="gruppi">
               <h2 id="titlegruppi">Guppi</h2>
               
               <ul>
                   <c:forEach item="${listaGruppi}" var="gruppo" >  
                       <li>${gruppo.nome}</li>   
                   </c:forEach>   
               </ul>
           </div>  
        </div>
                   
</html>
