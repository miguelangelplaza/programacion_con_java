<%-- index.jsp --%>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="daw1.Media4" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEDIA NOTAS</title>
</head>

<body>
<h2>Media notas</h2>
<hr> 

<%
out.println("Las notas del alumno son: ");
// out.print(nota1);
// out.print(nota2);
// out.print(nota3);

Media4 media = new Media4();
double media = media.calcularMedia();
out.println("La media de las notas es: " + media);
String.format("%.2f", media);
%>

</body>
</html>