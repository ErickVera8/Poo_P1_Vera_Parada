/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Erick
 */
public class Editor extends Usuario{
    private String Journal;

    public Editor(String Journal, String nombre, String password, String correoElectronico, String apellido, String rol, String user) {
        super(nombre, password, correoElectronico, apellido, "e", user);
        this.Journal = Journal;
    }
    
    


    
    
    
}
