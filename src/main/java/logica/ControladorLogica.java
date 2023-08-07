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
    
    public Usuario obtenerUsuarioxId(int id) {
        return controladoraPersistencia.obtenerUsuarioxId(id);
    }
    
    public void eliminarUsuario(int id) {
        controladoraPersistencia.eliminarUsuario(id);
    }
    
    public void editarUsuario(Usuario usuario) {
        controladoraPersistencia.editarUsuario(usuario);
    }
}
