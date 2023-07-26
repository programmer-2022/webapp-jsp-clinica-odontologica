package logica;

import persistencia.ControladorPersistencia;

public class ControladorLogica {
    
    ControladorPersistencia controladoraPersistencia = new ControladorPersistencia();
    
    public void crearUsuario(int id, String nombre, String clave, String rol) {
        Usuario usu = new Usuario(id, nombre, clave, rol);
        controladoraPersistencia.crearUsuario(usu);
    }
}
