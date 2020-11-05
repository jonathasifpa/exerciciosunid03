package servletsExerc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletControle")
public class ServletControle extends HttpServlet{	 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		if(!nome.isEmpty()) {
			request.getSession().setAttribute("USUARIO", new Usuario(nome));
			request.getRequestDispatcher("bemvindo.jsp").forward(request, response);
		}
		else {
			response.sendRedirect(request.getContextPath() + "/form-nome.jsp?erro=Nome Inexistente");
		}	
	}
}
