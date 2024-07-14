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
    
    






    public Usuario(String nombre, String apellido, String correoElectronico, String rol) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.apellido = apellido;
        this.rol = rol;
 
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

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", apellido=" + apellido + ", rol=" + rol + '}';
    }



    
}
