package Proyecto;

import java.util.Objects;


/**
 *
 * @author Erick
 */
public class Usuario {
    private String nombre;
    private String correoElectronico;
    private String apellido;
    private String rol;
    private String user;
    private String password;

    public Usuario(String nombre, String correoElectronico, String apellido, String rol, String user, String password) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.apellido = apellido;
        this.rol = rol;
        this.user = user;
        this.password = password;
    }
    
    






    


    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", apellido=" + apellido + ", rol=" + rol + ", user=" + user + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.rol, other.rol);
    }

    



    
}
