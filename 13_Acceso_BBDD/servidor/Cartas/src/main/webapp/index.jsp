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
    <link href="./assets/css/styles.css" rel="stylesheet">

</head>
<body>

<div id="background-container">
    <div id="centrar">
        <h1>Tu Juego Favorito</h1>

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
            <button type="submit">¡Barajar!</button>
        </form>
    </div>
</div>
</body>
</html>