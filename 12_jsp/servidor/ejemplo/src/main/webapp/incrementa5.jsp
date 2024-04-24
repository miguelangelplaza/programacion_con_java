<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  <body>
    <h1>Incrementa 5</h1>
    El numero introducido mas cinco es
    <%
      double resultado; 
      resultado = Double.parseDouble(request.getParameter("numeroIntro")) + 5;
      out.print(resultado);
    %>
  </body>
</html>