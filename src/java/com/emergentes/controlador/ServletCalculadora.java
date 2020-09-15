package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCalculadora", urlPatterns = {"/ServletCalculadora"})
public class ServletCalculadora extends HttpServlet {
    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uno = request.getParameter("uno");
        String tipo = request.getParameter("tipo");
        String dos = request.getParameter("dos");
        response.setContentType("text/html;charset=UTF-8");
       
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Calculadora</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>Operaciones Aritmeticas</h1>");
            Enumeration e = request.getHeaderNames();
            float unos = Integer.parseInt(uno);
            float tipos = Integer.parseInt(tipo);
            float doss = Integer.parseInt(dos);
            float operacion;
            
            if (tipos == 1){
            operacion = (float) (unos + doss);
            out.println("La Suma es : " + operacion + "<br>");          
            }
            else {
                if (tipos == 2){
                        operacion = (float) (unos - doss);
                        out.println("La Resta es : " + operacion + "<br>");
                }
                else {
                if (tipos == 3){
                        operacion = (float) (unos * doss);
                        out.println("La Multiplicacion es : " + operacion + "<br>");
                }
                else {
                if (tipos == 4){
                        operacion = (float) (unos / doss);
                        out.println("La Division es : " + operacion + "<br>");
                }
                else{
                    out.println("Error En las operaciones");
                }
            }    
           
            out.println("</body>");
            out.println("</html>");
        }
             
        }
    }
        
        
    }

}
