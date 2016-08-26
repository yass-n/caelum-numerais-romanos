package br.com.caelum.romanos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.romanos.conversor.ConversorDecimalRomano;

@WebServlet("/converte")
public class RomanoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer numero = Integer.parseInt(req.getParameter("numero"));
        
        ConversorDecimalRomano conversor = new ConversorDecimalRomano();

        PrintWriter out = resp.getWriter();
        // escreve o texto
        out.println("<html>");
        out.println("<body>");
        out.println("<p id='romano'>" + conversor.converte(numero) + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
