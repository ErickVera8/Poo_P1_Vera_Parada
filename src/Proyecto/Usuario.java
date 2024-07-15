package Proyecto;

import java.util.Objects;


/**
 *
 * @author Erick
 */
public class Usuario {
    protected String nombre;
    protected String correoElectronico;
    protected String apellido;
    protected RolUsuario rol;
    protected String user;
    protected String password;

    public Usuario(String nombre, String correoElectronico, String apellido, RolUsuario rol, String user, String password) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.apellido = apellido;
        this.rol = rol;
        this.user = user;
        this.password = password;
    }

    public Usuario(String nombre, String correoElectronico, String apellido, String user, String password) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.apellido = apellido;
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


    public RolUsuario getRol() {
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

    

    



    
}
