<%-- index.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modules.Baraja"%>
<%@page import="modules.Carta"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Barajar Cartas</title>
    <meta charset="UTF-8" />
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Jaro:opsz@6..72&display=swap" rel="stylesheet">
    <style> 
      body {
        display: flex;
        justify-content: center;
        align-items: center;
        margin-top:70px;
        background-image: url('./assets/img/textura.jpg'); 
        background-size: cover; 
        background-position: center; 
        background-repeat: no-repeat;
      }
      

      #centrar {
        text-align: center;
      }
      

      h1 {
        font-family: 'Jaro', sans-serif; 
        font-size: 50px;
        color: #333;
        margin-bottom: 20px;
      }

      img {
        width: 20%;
        margin:20px;
      }

      button {
        padding: 10px 20px;
        font-family: 'Jaro', sans-serif;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
      }

      button:hover {
        background-color: #45a049;
      }
    </style>
  </head>
  <body>
    <div id="centrar">
      <h1>Cartas</h1>

      <% 
        Baraja barajaEsp = new Baraja();
        int i = 0;
        barajaEsp.inicializaBaraja();
        barajaEsp.barajar();
        do { 
          Carta carta = barajaEsp.sacarCarta();
          Carta comprobacion;
          do {
            comprobacion = barajaEsp.sacarCarta();
            if(carta.equals(comprobacion)){
              barajaEsp.barajar();
            }
          } while (carta.equals(comprobacion));
          out.println(comprobacion);
          i++;
        } while (i < 4); 
      %>

      <form action="index.jsp" method="get">
        <button type="submit">Baraja!</button>
      </form>
    </div>
  </body>
</html>