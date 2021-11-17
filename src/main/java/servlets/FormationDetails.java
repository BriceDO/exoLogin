package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Formation;
import services.FormationService;

/**
 * Servlet implementation class FormationDetails
 */
@WebServlet("/formation_details")
public class FormationDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Récupère l'instance de mon service FormationService
	private FormationService formService = FormationService.getInstance();
	// Variable qui contiendra une formation
	private Formation form; 
	
    public FormationDetails() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// récupère la formation passé en paramètre de l'URL grâce à son titre
		// grâce à getFormationByName
		form = this.formService.getFormationByTitre(request.getParameter("titre"));
		
		// Si pas de formation, redirection vers la liste des formations
		if (form == null ) {
			response.sendRedirect("/ExoLogin/formation_liste");
			return; 
		}
		
		request.setAttribute("formations", form);
		
		request.getRequestDispatcher("/WEB-INF/formation_details.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
