package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Auth
 */
@WebFilter("/acceuil")
public class Auth implements Filter {


    public Auth() {
        
    }

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
		String name = request.getParameter(name);
		
		
		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
