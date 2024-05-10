<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modules.Fruta"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Paso de cadena</title>
</head>
<body>
    
    <% if (request.getParameterMap().isEmpty()) {
        
        
        //Establecemos la conexion con a base de datos 
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/frutas", "root", "");
        
        //Creamos la consulta
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM frutas ;");

        //Leo todos los registros almacenados en resultados 
        while(resultado.next(true)){
            out.println("resultado.getString("nombre"));
        }

        //Cierro la conexion
        conexion.close();

    %>
    

    <h1>Pasando una cadena de caracteres</h1>
    <form method="post" action="fruta.jsp">
        <label>Seleccione una fruta:</label>
        <select name="fruta">
            <option value="kiwi">Kiwi</option>
            <option value="mango">Mango</option>
            <option value="melon">Melón</option>
            <option value="platano">Plátano</option>
            <option value="sandia">Sandía</option>
        </select>
        <button>Enviar</button>
        
    </form>
    <%
    } else {
        Fruta fruta = new Fruta(request.getParameter("fruta"));
    %>
    <h4> Me gusta mucho comer<%= fruta.getNombre()%></h4>
    <%
        fruta
    %>
    <%
    }
    %>


</body>
</html>
