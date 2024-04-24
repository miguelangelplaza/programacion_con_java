<%-- index.jsp --%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="daw1.Gato" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gatos con clase</title>
</head>

<body>
<h2>Gatos con clase</h2>
<hr> 
<% 
Gato gato = new Gato("Garfield", "descarga.jpg");
Gato gato2 = new Gato("Tom", "gatocomuneuropeo.jpeg");
Gato gato3 = new Gato("Silvestre", "images.jpg");

///Llamo a los 3 metodos
out.print(gato);
out.print(gato2);
out.print(gato3);

out.print(gato.maulla());
out.print(gato2.come("atun"));

%>
</body>
</html>
