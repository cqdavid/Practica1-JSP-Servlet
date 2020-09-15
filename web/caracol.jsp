<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Matriz Caracol n x n</h1>
        <form action="ServletCaracol" method="post">
            <label>Ingrese la dimencion "N" de la matriz  </label>
            <br><br>
            <input type="text" name="nsima">
            <br><br>
            <input type="submit" value="Generar">
            <br><br>
        </form>
        <a href="index.jsp">Volver</a>
    </body>
</html>