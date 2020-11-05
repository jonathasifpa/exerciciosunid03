<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<form action="ControleBlog">
		<label>Qual seu nome? 
            <input type="text" name="nome">
            (Só é preciso informar uma vez)
        </label>
        <br>
        <br>
        <label>Mensagem:</label>
        <br>
		<textarea rows="3" cols="40" value="" name="mensagem" required></textarea>
		<br> <input type="submit" value="ENVIAR" />
	</form>
	<% 
      	String erro = request.getParameter("erro");
      	if(erro != null)
      		out.println("A mensagem não pode estar em branco!");
     %>

	<jsp:include page="mensagens.jsp" flush="true" />
</body>
</html>