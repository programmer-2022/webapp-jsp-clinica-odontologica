package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {

    HorarioJpaController horarioControllerJPA;
    OdontologoJpaController odontologoControllerJPA;
    PacienteJpaController pacienteControllerJPA;
    PersonaJpaController personaControllerJPA;
    ResponsableJpaController responsableControllerJPA;
    SecretarioJpaController secretarioControllerJPA;
    TurnoJpaController turnoControllerJPA;
    UsuarioJpaController usuarioControllerJPA;

    public ControladorPersistencia() {
        horarioControllerJPA = new HorarioJpaController();
        odontologoControllerJPA = new OdontologoJpaController();
        pacienteControllerJPA = new PacienteJpaController();
        personaControllerJPA = new PersonaJpaController();
        responsableControllerJPA = new ResponsableJpaController();
        secretarioControllerJPA = new SecretarioJpaController();
        turnoControllerJPA = new TurnoJpaController();
        usuarioControllerJPA = new UsuarioJpaController();
    }

    public void crearUsuario(Usuario usuario) {
        usuarioControllerJPA.create(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioControllerJPA.findUsuarioEntities();
    }

    public Usuario obtenerUsuarioxId(int id) {
        return usuarioControllerJPA.findUsuario(id);
    }

    public void eliminarUsuario(int id) {
        try {
            usuarioControllerJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarUsuario(Usuario usuario) {
        try {
            usuarioControllerJPA.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
