package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.*;

/**
 * Servlet implementation class Calculatrice
 */
@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreUn = request.getParameter("nombreUn");
		String nombreDeux = request.getParameter("nombreDeux");
		String operation = request.getParameter("operation");
		String resultat = null;
		
		Calcul calcul = new Calcul(nombreUn,nombreDeux);
		
		switch (operation) {
		case "addition":
			resultat = calcul.addition(nombreUn, nombreDeux);
			operation = "+";
			break;
		case "soustraction":
			resultat = calcul.soustraction(nombreUn, nombreDeux);
			operation = "-";
			break;
		case "multiplication":
			resultat = calcul.multiplication(nombreUn, nombreDeux);
			operation = "*";
			break;
		case "division":
			resultat = calcul.division(nombreUn, nombreDeux);
			operation = "/";
			break;
		}
		request.setAttribute("nombreUn", nombreUn);
		request.setAttribute("nombreDeux", nombreDeux);
		request.setAttribute("operation", operation);
		request.setAttribute("resultat", resultat);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);	
	}

}
