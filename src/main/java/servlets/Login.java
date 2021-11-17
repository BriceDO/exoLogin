package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.User;


/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Login() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User utilisateur = new User("brice", "mdp");
		
		HttpSession session = request.getSession();
		session.setAttribute("USER", utilisateur);
		
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String mdp = request.getParameter("mdp");
		
		// Vérification authentification
		if(name.equals("brice") && mdp.equals("mdp")) {
			response.sendRedirect(request.getContextPath() + "/acceuil");
		} else {
			response.sendRedirect(request.getContextPath() + "/login");
		}
		
		//doGet(request, response);
	}

}
