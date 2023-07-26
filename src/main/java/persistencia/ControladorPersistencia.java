package persistencia;

import logica.Usuario;

public class ControladorPersistencia {
    
    HorarioJpaController horarioJpaControllerJPA = new HorarioJpaController();
    OdontologoJpaController odontologoJpaControllerJPA = new OdontologoJpaController();
    PacienteJpaController pacienteJpaControllerJPA = new PacienteJpaController();
    PersonaJpaController personaJpaControllerJPA = new PersonaJpaController();
    ResponsableJpaController responsableJpaControllerJPA = new ResponsableJpaController();
    SecretarioJpaController secretarioJpaControllerJPA = new SecretarioJpaController();
    TurnoJpaController turnoJpaControllerJPA = new TurnoJpaController();
    UsuarioJpaController usuarioJpaControllerJPA = new UsuarioJpaController();

    public ControladorPersistencia() {   }
    
     public void crearUsuario(Usuario usuario) {
         usuarioJpaControllerJPA.create(usuario);
    }
    
}
