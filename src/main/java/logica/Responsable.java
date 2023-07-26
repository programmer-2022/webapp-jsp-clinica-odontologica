package modelos;

import java.util.Date;

public class Responsable extends Persona {

    private String tipoResponsabilidad;
    
    public Responsable() {   }

    public Responsable(String tipoResponsabilidad, String dni, String nombre, String apellido, String direccion, Date fechaNacimiento) {
        super(dni, nombre, apellido, direccion, fechaNacimiento);
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
       
}
