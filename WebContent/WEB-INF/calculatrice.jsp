<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculatrice</title>
</head>
    <body >
        <h1>Saisissez l'opération que vous souhaitez réalisée !</h1>
        <article class="mapage">
			<form method="post" action="">
			  <div class="bloc">
			      <input type="number" id="nombreUn" name="nombreUn"/>
			  </div>
			  <div class="bloc">
			      <select name="operation" id="operation" name="operation">
			         <option value="addition">Addition</option>
			         <option value="soustraction">Soustraction</option>
			         <option value="multiplication">Multiplication</option>
			         <option value="division">Division</option>
			      </select>
			  </div>
			  <div class="bloc">
			      <input type="number" id="nombreDeux" name="nombreDeux"/>
			  </div>
			  <div class="bloc">
			      <input type="submit" value="Envoyer" />
			  </div>  
			</form> 
        </article> 
        <article>
        	Votre résultat est de : 
        		<%
        			String attribut = (String) request.getAttribute("resultat");
            		out.println( attribut ); 
            	%>
        </article>	
    </body>
</html>