/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Erick
 */
public class Revisor extends Usuario {
    private  String especialidad;
    private int numArchivoRevisado;


    public Revisor(String especialidad, int numArchivoRevisado, String nombre, String apellido, String correoElectronico, String user, String password) {
        super(nombre, apellido, correoElectronico, "R",user,password);
        this.especialidad = especialidad;
        this.numArchivoRevisado = numArchivoRevisado;

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumArchivoRevisado() {
        return numArchivoRevisado;
    }

    public void setNumArchivoRevisado(int numArchivoRevisado) {
        this.numArchivoRevisado = numArchivoRevisado;
    }


    
    
}
