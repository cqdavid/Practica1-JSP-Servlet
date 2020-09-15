<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1> CALCULADORA </h1>
        <p>Ingrese los datos</p>
        <br><br>
         <form action="ServletCalculadora" method="post">
            <table>
                <tr>
                    <td><label>1er numero</label></td>
                    <td><input type="text" name="uno"></td>
                   
                </tr>
                <tr>
                    <td><label>Operacion </label></td> 
                    <td>
                    <select name="tipo">
                    <option value="1"> + </option>
                    <option value="2"> - </option>
                    <option value="3"> * </option>
                    <option value="4"> / </option>
                    </select>
                    </td>
                </tr>
              
                <tr>
                    <td><label>2do numero</label></td>
                    <td><input type="text" name="dos"></td>
                   
                </tr>
                <td></td>       
                <td><input type="submit" value="Enviar" ></td>
                </tr>
            
            </table> 
            
        </form>
        <a href="index.jsp">Volver</a>
    </body>
</html>
