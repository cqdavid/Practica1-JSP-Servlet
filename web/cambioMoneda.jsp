<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cambio de Moneda</h1>
        
        <p>Que operacion desea realizar...??</p>
        <p><b>1.- Cambio de Bolivianos a Dolares</b></p>
        <p><b>2.- Cambio de Dolares a Bolivianos</b></p>
        <br><br>
        <form action="ServletCambioMonedas" method="post">
            <table>  
                <tr>
                    <td><label>Elija una opcion</label></td> 
                    <td>
                    <select name="tipo">
                    <option> 1 </option>
                    <option> 2 </option>
                    </select>
                    </td>
                </tr>
              
                <tr>
                    <td><label>Monto de dinero a ser cambiado</label></td>
                    <td><input type="text" name="dinero"></td>
                   
                </tr>
                <td></td>       
                <td><input type="submit" value="Enviar" ></td>
                </tr>
            
            </table> 
            
        </form>
        <a href="index.jsp">Volver</a>
    </body>
</html>
