package Proyecto;


/**
 *
 * @author Erick
 */
public class Usuario {
    private String nombre;
    private String password;
    private String correoElectronico;
    private String apellido;
    private String rol;
    private String user;
    






    public Usuario(String nombre, String password, String correoElectronico, String apellido, String rol, String user) {
        this.nombre = nombre;
        this.password = password;
        this.correoElectronico = correoElectronico;
        this.apellido = apellido;
        this.rol = rol;
        this.user = user;
    }

    public Usuario(String password, String user) {
        this.password = password;
        this.user = user;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico=correoElectronico;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
        public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
        public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }
}
