package servletsExerc;

import java.io.IOException;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControleExcluiMensagem")
public class ControleExcluiMensagem extends HttpServlet{
	protected void service (HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<BlogMensagem> mensagens = (ArrayList<BlogMensagem>) request.getSession().getAttribute("BEAN_LISTA");
		mensagens = mensagens.stream()
		  .filter(e -> e.getId() != id)
		  .collect(Collectors.toList());
		request.getSession().setAttribute("BEAN_LISTA", mensagens);
		request.getRequestDispatcher("blog.jsp").forward(request, response);
	} 

}
