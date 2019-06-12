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
		
		switch (operation) {
		case "addition":
			Addition addition = new Addition(nombreUn,nombreDeux);
			resultat = addition.operation(nombreUn, nombreDeux);
			break;
		case "soustraction":
			Soustraction soustraction = new Soustraction(nombreUn,nombreDeux);
			resultat = soustraction.operation(nombreUn, nombreDeux);
			break;
		case "multiplication":
			Multiplication multiplication = new Multiplication(nombreUn,nombreDeux);
			resultat = multiplication.operation(nombreUn, nombreDeux);
			break;
		case "division":
			Division division = new Division(nombreUn,nombreDeux);
			resultat = division.operation(nombreUn, nombreDeux);
			break;
		}
		request.setAttribute("resultat", resultat);
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);	
	}

}
