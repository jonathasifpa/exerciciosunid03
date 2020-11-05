package servletsExerc;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ControleBlog")
public class ControleBlog extends HttpServlet {
	protected void service (HttpServletRequest request, HttpServletResponse response) throws
	ServletException, IOException {
		this.logar(request);
		Usuario usuario = (Usuario) request.getSession().getAttribute("USUARIO");
		String msg = request.getParameter("mensagem");
		if(!msg.isEmpty()) {
			BlogMensagem blogMensagem = new BlogMensagem();
			blogMensagem.setMensagem(msg);
			blogMensagem.setDataMensagem(new Date());
			blogMensagem.setHoraMensagem(LocalTime.now());
			blogMensagem.setId(new Random().nextInt());
			blogMensagem.setUsuario(usuario.getNome());
			List<BlogMensagem> listaMsg = (ArrayList<BlogMensagem>) request.getSession().getAttribute("BEAN_LISTA");
			if (listaMsg==null)
				listaMsg = new ArrayList<BlogMensagem>();
			listaMsg.add(blogMensagem);
			request.getSession().setAttribute("BEAN_LISTA", listaMsg);
			request.getRequestDispatcher("blog.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("blog.jsp?erro=Mensagem em branco").forward(request, response);
		}
	}
	
	private void logar(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		if(!nome.isEmpty()) {
			request.getSession().setAttribute("USUARIO", new Usuario(nome));
		}
	}
}
