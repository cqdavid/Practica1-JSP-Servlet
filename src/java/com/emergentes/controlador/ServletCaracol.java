package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCaracol", urlPatterns = {"/ServletCaracol"})
public class ServletCaracol extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String nsima = request.getParameter("nsima");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Generacion de Matriz Caracol</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Generar Matriz n x n (caracol)</h1>");
            int n = Integer.parseInt(nsima);
            /*se define la matriz*/
            String[][] matriz_caracol = new String[n][n];
            int a = 0, b = n - 1, valor = 1;
            /*en los FOR se va recorriendo espacio por espacio
            llenando los valores dependiendo de la "n" que se determine
            en el formulario anterior*/
            for (int j = 0; j < matriz_caracol.length; j++) {

                for (int i = a; i <= b; i++) {
                    matriz_caracol[a][i] = valor++ + "  ";
                }
                for (int i = a + 1; i <= b; i++) {
                    matriz_caracol[i][b] = valor++ + " ";
                }
                for (int i = b - 1; i >= a; i--) {
                    matriz_caracol[b][i] = valor++ + " ";
                }
                for (int i = b - 1; i >= a + 1; i--) {
                    matriz_caracol[i][a] = valor++ + " ";
                }
                a++;
                b--;
            }
            //muestra la matriz definida y llenada
            for (int f = 0; f < matriz_caracol.length; f++) {
                for (int i = 0; i < matriz_caracol[f].length; i++) {
                    out.print("[" + matriz_caracol[f][i] + "]" + " \t");

                }
                out.print("<br>");
            }

            out.println("</body>");
            out.println("</html>");
        }    
    }
}
