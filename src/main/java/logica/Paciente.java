package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Paciente  extends Persona implements Serializable {
    
    private boolean tieneOS;
    
    private String tipoSangre;
    
    @OneToOne
    private Responsable responsable;
    
    @OneToMany
    private List<Turno> listaTurnos;

    public Paciente() { }

    public Paciente(boolean tieneOS, String tipoSangre, Responsable responsable, List<Turno> listaTurnos, int id, String dni, String nombre, String apellido, String direccion, Date fechaNacimiento) {
        super(id, dni, nombre, apellido, direccion, fechaNacimiento);
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
