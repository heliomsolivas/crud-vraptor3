<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<h1>Usuário selecionado</h1>
Nome do usuário selecionado: ${user.nome}
<h1>Alterar dados</h1>
<form method="post"  action="<c:url value="/users" />" name="alterForm">
<label for="user.nome">Nome do usuário:</label>
<input type="text" name="user.nome" value="${user.nome}"/>
<input type="text" name="user.id" value="${user.id}"/>
<input type="hidden" name="_method" value="put"/>
<input type="submit" value="Alterar">
</form>


</body>
</html>