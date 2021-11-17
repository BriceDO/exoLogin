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
import models.Formation;
import services.FormationService;

/**
 * Servlet implementation class FormationListe
 */
@WebServlet("/formation_liste")
public class FormationListe extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// liste vide qui contiendra la mes formations
	private List<Formation> formations = new ArrayList<Formation>();
	// Variable qui contiendra plus tard une formation
	private FormationService formationService = FormationService.getInstance();

    public FormationListe() {
    	// Récupère la liste de mes formations grâce à FormationServices et sa méthode getFormations()
    	this.formations = formationService.getFormations();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("formations", formations);
		request.getRequestDispatcher("/WEB-INF/formation_liste.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
