package br.com.java.email;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailServlet")
public class EmailServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, 
					HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String msg = "";
		try {
				Email e = new Email();
				e.setDe(request.getParameter("txtDe"));
				e.setPara(request.getParameter("txtPara"));
				e.setSenha(request.getParameter("txtSenha"));
				e.setTitulo(request.getParameter("txtTitulo"));
				e.setCorpo(request.getParameter("txtCorpo"));
				
				EnviaEmail envio = new EnviaEmail();
				envio.enviar(e);
			
				msg = "<h1>Mensagem enviada com Sucesso !</h1>";
		} catch (Exception e) {
			e.printStackTrace();
			msg = "<h1>Erro no envio da mensagem! </h1> \\n";
			msg += e.getMessage();
		} finally {
			request.setAttribute("msg", msg);
			request.getRequestDispatcher("aviso.jsp").forward(request, response);;
		}
	}
}