package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCambioMonedas", urlPatterns = {"/ServletCambioMonedas"})
public class ServletCambioMonedas extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String tipo = request.getParameter("tipo");
        String dinero = request.getParameter("dinero");
        response.setContentType("text/html;charset=UTF-8");
       
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cambio</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Cambio de Moneda</h1>");
            float tipos = Integer.parseInt(tipo);
            float dineros = Integer.parseInt(dinero);
            float cambio;
            
            if (tipos == 1){
            cambio = (float) (dineros / 6.96);
            out.println("Bolivianos: " + dineros + "<br><br>");
            out.println("");
            out.println("<strong>En Dolares es :</strong> es:"+ cambio + "<br><br>");
            
            }
            else {
                if (tipos == 2){
                        cambio = (float) (dineros * 6.90);
                        out.println("Dolares: " + dineros + "<br>");
                        out.println("");
                        out.println("<strong>En Bolivianos es :</strong>"+ cambio + "<br>");
                }
                else{
                    out.println("No se realizo ningun movimiento");
                }
            }    
           
            out.println("</body>");
            out.println("</html>");
        }
    
    }

}