package logica;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona {

    private String tipoResponsabilidad;
    
    public Responsable() {   }

    public Responsable(String tipoResponsabilidad, int id, String dni, String nombre, String apellido, String direccion, Date fechaNacimiento) {
        super(id, dni, nombre, apellido, direccion, fechaNacimiento);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
       
}
