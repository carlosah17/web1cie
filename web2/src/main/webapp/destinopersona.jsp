<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String nombre= request.getParameter("nombre");
String apellidos= request.getParameter("apellidos");
String fecha= request.getParameter("fecha");
out.println(nombre);
out.println(apellidos);
out.println(fecha);


%>
</body>
</html>