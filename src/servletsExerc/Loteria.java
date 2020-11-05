package servletsExerc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Loteria")
public class Loteria extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random gerador = new Random();
		int quantidadeJogos = Integer.parseInt(req.getParameter("quantidadeJogos"));
		PrintWriter writter = resp.getWriter();
		int contador = 0;
		while(contador < quantidadeJogos) {
			writter.println(1 + gerador.nextInt(60));
		}
	}
}
