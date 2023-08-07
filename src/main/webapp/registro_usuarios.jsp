<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./components/head.jsp" %>
<%@include file="./components/body-superior.jsp" %>

<h3>Registro de Usuarios</h3>
<hr class="sidebar-divider">

<form class="user" action="SvUsuarios" method="POST">
    <!-- Nombre Usuario --> 
    <div class="form-group">
        <input type="text" class="form-control form-control-user" name="nombre"
               placeholder="Nombre Usuario" autocomplete="off">
    </div>
    <!-- Contrasena --> 
    <div class="form-group">
        <input type="password" class="form-control form-control-user" name="contrasena"
               placeholder="Contrasena">
    </div>
    <!-- Confirmar Contrasena --> 
    <div class="form-group">
        <input type="password" class="form-control form-control-user" name="confirmarcontrasena"
               placeholder="Confirmar Contrasena">
    </div>

    <!-- Rol -->      
    <div class="form-group row">
        <div class="col-sm-2 mb-3 mb-sm-0">
            <label for="rol">Seleccione Rol</label>
        </div>
        <div class="col-sm-6">
            <select id="rol" name="rol" class="form-control">
                <option value="" selected disabled hidden>- Seleccione Rol -</option>
                <option value="operador">Operador</option>
                <option value="administrador">Administrador</option>                        
            </select>
        </div>
    </div>

    <!-- Boton Guardar -->      
    <div class="container w-25 mt-5">
        <button type="submit" class="btn btn-primary btn-user btn-block">
            Guardar
        </button>
    </div>

</form>

<%@include file="./components/body-inferior.jsp" %>
