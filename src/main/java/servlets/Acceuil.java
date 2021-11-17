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
 * Servlet implementation class Acceuil
 */
@WebServlet("/acceuil")
public class Acceuil extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Acceuil() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		HttpSession session = request.getSession();

		User utilisateur = (User) session.getAttribute("USER");

		request.setAttribute("user", utilisateur);

		request.getRequestDispatcher("/WEB-INF/acceuil.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
