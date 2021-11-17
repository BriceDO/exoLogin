package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Eleve;
import models.Formation;
import services.FormationService;

/**
 * Servlet implementation class EleveDetails
 */
@WebServlet("/eleve_details")
public class EleveDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Récupère l'instance de mon service FormationService (mais qui contient la création de mes eleves)
	private FormationService eleveService = FormationService.getInstance();
	// Variable qui contiendra un eleve
	private Eleve el; 
	
    public EleveDetails() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// récupère l'eleve passé en paramètre de l'URL grâce à son nom
		// grâce à getEleveByNom
		el = this.eleveService.getEleveByNom(request.getParameter("nom"));
		
		// Si pas d'eleve, redirection vers la liste des eleves
		if (el == null ) {
			response.sendRedirect("/ExoLogin/eleve_liste");
			return; 
		}
		
		request.setAttribute("eleves", el);
		request.getRequestDispatcher("/WEB-INF/eleve_details.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
