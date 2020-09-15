package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletEdad", urlPatterns = {"/ServletEdad"})
public class ServletEdad extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
       String Dato = request.getParameter("Dato");     
        try{
            /* TODO el contenido con el formato de un archivo HTML */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Edad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Año de nacimiento introducido desde la URL</h1>");
            
            float datos = Integer.parseInt(Dato);
            float edad;
            
            if(datos > 0) {
                edad = 2020-datos;
                out.println("Usted tiene : <strong>" + (edad) + "</strong>");
                out.println("  años ");                
            } else {
                out.println("Poner año de nacimiemto en la URL");
            }
            out.println("</body>");
            out.println("</html>");
        }finally {
           out.close();
       }
    }
}
