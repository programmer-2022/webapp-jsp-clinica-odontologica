package modelos;

import java.util.Date;
import java.util.List;

public class Paciente  extends Persona {
    
    private boolean tieneOS;
    private String tipoSangre;
    private Responsable responsable;
    private List<Turno> listaTurnos;

    public Paciente() { }

    public Paciente(boolean tieneOS, String tipoSangre, Responsable responsable, List<Turno> listaTurnos, String dni, String nombre, String apellido, String direccion, Date fechaNacimiento) {
        super(dni, nombre, apellido, direccion, fechaNacimiento);
        this.tieneOS = tieneOS;
        this.tipoSangre = tipoSangre;
        this.responsable = responsable;
        this.listaTurnos = listaTurnos;
    }

    public boolean isTieneOS() {
        return tieneOS;
    }

    public void setTieneOS(boolean tieneOS) {
        this.tieneOS = tieneOS;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }
        
}
