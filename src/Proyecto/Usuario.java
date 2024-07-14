package Proyecto;

import java.util.Objects;


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
    






    public Usuario(String nombre, String apellido, String correoElectronico, String user, String password, String rol) {
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

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", password=" + password + ", correoElectronico=" + correoElectronico + ", apellido=" + apellido + ", rol=" + rol + ", user=" + user + '}';
    }
     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return user.equals(usuario.user) && password.equals(usuario.password);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.password);
        hash = 37 * hash + Objects.hashCode(this.user);
        return hash;
    }
    
}
