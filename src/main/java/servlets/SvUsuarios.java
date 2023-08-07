package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.ControladorLogica;
import logica.Usuario;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    
    ControladorLogica ctrlLogica = new ControladorLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {      
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios = ctrlLogica.obtenerUsuarios();
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaUsuarios", listaUsuarios);
        
        response.sendRedirect("listar_usuarios.jsp");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String nombre = request.getParameter("nombre");
        String contrasena = request.getParameter("contrasena");
        String rol = request.getParameter("rol");
        
        ctrlLogica.crearUsuario(nombre, contrasena, rol);
        response.sendRedirect("index.jsp");
    }      

}

