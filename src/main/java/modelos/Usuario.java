package modelos;

public class Usuario {
    
    private int idUsuario;
    private String nombre;
    private String clave;
    private String rol;

    public Usuario() {  }
    
    public Usuario(int idUsuario, String nombre, String clave, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
        
}
