package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladorLogica;
import logica.Usuario;

@WebServlet(name = "SvEditarUsuarios", urlPatterns = {"/SvEditarUsuarios"})
public class SvEditarUsuarios extends HttpServlet {

    ControladorLogica ctrlLogica = new ControladorLogica();
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            int id = Integer.parseInt(request.getParameter("id_usuario"));
            Usuario usuario = ctrlLogica.obtenerUsuarioxId(id);
            
            HttpSession sesion = request.getSession();
            sesion.setAttribute("usuario", usuario);
            
            response.sendRedirect("editar_usuario.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String rol = request.getParameter("rol");
        
        Usuario usuario = (Usuario) request.getSession().getAttribute("usuario");
        usuario.setNombre(nombre);
        usuario.setClave(contrasena);
        usuario.setRol(rol);
        
        ctrlLogica.editarUsuario(usuario);
        response.sendRedirect("SvUsuarios");
    }  
}
