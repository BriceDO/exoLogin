package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Eleve;

import services.FormationService;


/**
 * Servlet implementation class ListeEleves
 */
@WebServlet("/eleve_liste")
public class EleveListe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// liste vide qui contiendra la mes eleves
	private List<Eleve> eleves = new ArrayList<Eleve>();
	// Variable qui contiendra plus tard un eleve
	private FormationService eleveService = FormationService.getInstance();
    public EleveListe() {
		// Récupère la liste de mes formations grâce à FormationServices et sa méthode getFormations()
    	this.eleves = eleveService.getEleves();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	request.setAttribute("eleves", eleves);
    	request.getRequestDispatcher("/WEB-INF/eleve_liste.jsp").forward(request, response);
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
