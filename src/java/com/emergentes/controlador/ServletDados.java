package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletDados", urlPatterns = {"/ServletDados"})
public class ServletDados extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* se define un boton para poder realizar el tiro
            de los dados*/
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Solución 3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lanzamiento de dados</h1>");
            out.println("<form action=\"\" method=\"get\">");
            out.print("<label>Lanzamiento de dados = </label>");
            /*cada que presiona el boton LANZAR ejecuta el proceso doGet el cual actualiza
            los valores de los dados*/
            out.println("<input type=\"submit\" value=\"Lanzar\" onclick=\"doGet\">");
            out.println("<br><br>");
            /*definicion de los dados*/
            int dado1, dado2;
            dado1 = (int) (Math.random() * 6) + 1;
            /*Muestra el valor del dado 1*/
            out.println("<strong>DADO 1: </strong>" + "[" + dado1 + "]");
            out.println("<br><br>");
            dado2 = (int) (Math.random() * 6) + 1;
            /*Muestra el valor del dado 2*/
            out.println("<strong>DADO 2: </strong>" + "[" + dado2 + "]");
            out.println("<br><br>");
            /*aqui se realiza la suma de los dados*/
            int sum = dado1 + dado2;
            /*muestra la suma de los dados*/
            out.println("<strong>SUMA DE DADOS: </strong>" + sum);
            out.println("<br><br>");
            /*dentro de if se declara que la variable "sum" sea 7 u 11*/
            if (sum == 7 || sum == 11) {
                out.println("<strong>GANASTE!!!</strong>");
            } else {
                /*cuando el valor es distinto de 7 u 11 es cuando muestra el mensaje*/
                out.println("<strong>PERDISTE, VUELVE A INTENTARLO</strong>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    
    }
}
