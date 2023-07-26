package modelos;

import java.util.Date;

public class Responsable extends Persona {

    private int idResponsable;
    private String tipoResponsabilidad;
    
    public Responsable() {   }

    public Responsable(int idResponsable, String tipoResponsabilidad, String dni, String nombre, String apellido, String direccion, Date fechaNacimiento) {
        super(dni, nombre, apellido, direccion, fechaNacimiento);
        this.idResponsable = idResponsable;
        this.tipoResponsabilidad = tipoResponsabilidad;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getTipoResponsabilidad() {
        return tipoResponsabilidad;
    }

    public void setTipoResponsabilidad(String tipoResponsabilidad) {
        this.tipoResponsabilidad = tipoResponsabilidad;
    }
       
}
