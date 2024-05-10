<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Paso de cadena</title>
</head>
<body>
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
</body>
</html>
