package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladorPersistencia {

    HorarioJpaController horarioJpaControllerJPA;
    OdontologoJpaController odontologoJpaControllerJPA;
    PacienteJpaController pacienteJpaControllerJPA;
    PersonaJpaController personaJpaControllerJPA;
    ResponsableJpaController responsableJpaControllerJPA;
    SecretarioJpaController secretarioJpaControllerJPA;
    TurnoJpaController turnoJpaControllerJPA;
    UsuarioJpaController usuarioJpaControllerJPA;

    public ControladorPersistencia() {
        horarioJpaControllerJPA = new HorarioJpaController();
        odontologoJpaControllerJPA = new OdontologoJpaController();
        pacienteJpaControllerJPA = new PacienteJpaController();
        personaJpaControllerJPA = new PersonaJpaController();
        responsableJpaControllerJPA = new ResponsableJpaController();
        secretarioJpaControllerJPA = new SecretarioJpaController();
        turnoJpaControllerJPA = new TurnoJpaController();
        usuarioJpaControllerJPA = new UsuarioJpaController();
    }

    public void crearUsuario(Usuario usuario) {
        usuarioJpaControllerJPA.create(usuario);
    }

    public List<Usuario> obtenerUsuarios() {
        return usuarioJpaControllerJPA.findUsuarioEntities();
    }

}
