package logica;

import java.util.List;
import persistencia.ControladorPersistencia;

public class ControladorLogica {
    
    ControladorPersistencia controladoraPersistencia = new ControladorPersistencia();
    
    public void crearUsuario(String nombre, String contrasena, String rol) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setClave(contrasena);
        usuario.setRol(rol);
        controladoraPersistencia.crearUsuario(usuario);
    }
    
    public List<Usuario> obtenerUsuarios() {
        return controladoraPersistencia.obtenerUsuarios();
    }
}
