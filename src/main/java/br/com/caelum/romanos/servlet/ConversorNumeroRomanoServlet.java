package br.com.caelum.romanos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.romanos.conversor.ConversorNumeroRomano;

@WebServlet("/converte")
public class ConversorNumeroRomanoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer numero = Integer.parseInt(req.getParameter("numero"));
        
        ConversorNumeroRomano conversor = new ConversorNumeroRomano();

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<p id='romano'>" + conversor.converte(numero) + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
