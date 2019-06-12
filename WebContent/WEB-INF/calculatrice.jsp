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
        <article>
        	 <%
        	 	String resultat = (String) request.getAttribute("resultat");
        	 	String nombreUn = (String) request.getAttribute("nombreUn");
        	 	String nombreDeux = (String) request.getAttribute("nombreDeux");
        	 	String operation = (String) request.getAttribute("operation");
        	 	if (resultat != null){
        	 		out.println("votre calcul de " + nombreUn + " " + operation + " " + nombreDeux + " = " + resultat);
        	 	}
        	 %>
        </article>	    
        <article class="mapage">
			<form method="post" action="">
		      <input type="number" id="nombreUn" name="nombreUn"/>
		      <select name="operation" id="operation" name="operation">
		         <option value="addition">Addition</option>
		         <option value="soustraction">Soustraction</option>
		         <option value="multiplication">Multiplication</option>
		         <option value="division">Division</option>
		      </select>
		      <input type="number" id="nombreDeux" name="nombreDeux"/>
		      <input type="submit" value="Envoyer" />
			</form> 
        </article> 
    </body>
</html>