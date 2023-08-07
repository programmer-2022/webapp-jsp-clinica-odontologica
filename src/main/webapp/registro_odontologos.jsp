<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./components/head.jsp" %>
<%@include file="./components/body-superior.jsp" %>

<h3>Registro</h3>
<hr class="sidebar-divider">

<form class="user">
    <%@include file="./components/form-datos-personales.jsp" %>
    <div class="container w-25 mt-5">
        <a href="login.html" class="btn btn-primary btn-user btn-block">
            Guardar
        </a>
    </div>  
</form>

<%@include file="./components/body-inferior.jsp" %>



