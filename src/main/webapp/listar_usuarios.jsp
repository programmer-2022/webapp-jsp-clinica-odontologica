<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="./components/head.jsp" %>
<%@include file="./components/body-superior.jsp" %>

<h3>Consulta de Usuarios</h3>
<hr class="sidebar-divider">

<!-- DataTales Example -->
<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Usuario</th>
                        <th>Rol</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Usuario</th>
                        <th>Rol</th>
                        <th>Acciones</th>
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
                                <!--Botones eliminar - editar-->
                                <td class="d-flex">
                                    <div class="mr-1">    
                                        <form name="eliminar" action="SvEliminarUsuarios" method="POST">
                                            <button type="submit" class="btn btn-danger">
                                                <i class="fas fa-trash-alt"></i> Eliminar
                                            </button>
                                            <input type="hidden" name="id_usuario" value="<%=usuario.getIdUsuario()%>" >
                                        </form>
                                    </div>
                                    <div>    
                                        <form name="editar" action="SvEditarUsuarios" method="GET">
                                            <button type="submit" class="btn btn-primary">
                                                <i class="fas fa-pencil-alt"></i> Editar
                                            </button>
                                            <input type="hidden" name="id_usuario" value="<%=usuario.getIdUsuario()%>" >
                                        </form>
                                    </div>
                                </td>
                            </tr>
                        <% } %>
                </tbody>
            </table>
        </div>
    </div>
</div>

<%@include file="./components/body-inferior.jsp" %>