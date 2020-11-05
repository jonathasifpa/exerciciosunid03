<!DOCTYPE html>
<html>
    <body>
        <h1>Bem-vindo!</h1>
        <form action="ServletControle">
            <label>Entre com seu nome:
                <input type="text" name="nome">
            </label>
            <button type="submit">Entrar</button>
        </form>
        <% 
        	String nome = request.getParameter("erro");
        	if(nome != null)
        		out.println("Um nome precisa ser informado!");
        %>
    </body>
</html>