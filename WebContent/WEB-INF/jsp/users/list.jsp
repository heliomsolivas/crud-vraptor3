<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Lista de usuários cadastrados</h1>
<table>
<thead>
<tr>
<th>Id</th>
<th>Nome</th>
</tr>
</thead>
<tbody>
<c:forEach items="${userList}" var="user">
<tr>
<td><a href="<c:url value="/users/${user.id}"/>"></a></td>
<td>${user.nome}</td>
<td>${user.numeroRg}</td>
<td>${user.numeroCpf}</td>
<td>${user.estado}</td>
<td>${user.email}</td>
<td><a href="<c:url value="/users/${user.id}"/>">Editar</a></td>
<td><a href="<c:url value="/users/delete/${user.id}"/>">Excluir</a></td>
</tr>
</c:forEach>
</tbody>
</table>

<c:if test="${not empty mensagem }">

<h3>Mensagem: <span style="color:red;">${mensagem}</span></h3>

</c:if>

<h1>Cadastro de Usuários</h1>
<form action="<c:url value="/users"/>" name="registerForm" method="POST">
<fieldset>
<legend>Novo Usuário</legend>
<label for="user.nome">Nome</label>
<input type="text" name="user.nome">
<label for="user.nome">RG</label>
<input type="text" name="user.numeroRg">
<label for="user.nome">CPF</label>
<input type="text" name="user.numeroCpf">
<label for="user.nome">Estado</label>
<input type="text" name="user.estado">
<label for="user.nome">E-mail</label>
<input type="text" name="user.email">
<input type="submit" value="Cadastrar">
</fieldset>


</form>
</body>
</html>