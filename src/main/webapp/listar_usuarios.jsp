<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./components/head.jsp" %>
<%@include file="./components/body-superior.jsp" %>

<h3>Consulta de Usuarios</h3>
<hr class="sidebar-divider">

<!-- DataTales Example -->
<div class="card shadow mb-4">
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Usuario</th>
                        <th>Rol</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Usuario</th>
                        <th>Rol</th>
                    </tr>
                </tfoot>
                <%
                    List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");                
                %>
                <tbody>
                        <% for(Usuario usuario : listaUsuarios) { %>
                            <tr>
                                <td><%= usuario.getIdUsuario()%></td>
                                <td><%= usuario.getNombre() %></td>
                                <td><%= usuario.getRol() %></td>
                            </tr>
                        <% } %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<%@include file="./components/body-inferior.jsp" %>