<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib  uri="http://displaytag.sf.net"  prefix="display"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Mensagens postadas</h3>
	<display:table name="${BEAN_LISTA}" uid="objmsg" defaultsort="2"
		defaultorder="descending">
		<display:column property="usuario" />
		<display:column property="mensagem" style="width: 50%;"/>

		<display:column property="dataMensagem" title="Data"
			format="{0,date,dd-MM-yyyy}" />

		<display:column property="horaMensagem" title="Hora"
			format="{0,date,HH:mm}" />

		<display:column>
			<a href="ControleExcluiMensagem?id=${objmsg.id}">Excluir</a>
		</display:column>
	</display:table>
</body>
</html>