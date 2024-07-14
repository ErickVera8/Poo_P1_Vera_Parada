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
    private String user;
    private String password;

    public Editor(String Journal, String nombre, String apellido, String correoElectronico, String user, String password) {
        super(nombre,apellido,correoElectronico,"E");
        this.Journal = Journal;
        this.user=user;
        this.password=password;
    }

    @Override
    public String toString() {
        return "Editor{" + "Journal=" + Journal + ", user=" + user + ", password=" + password + '}';
    }

   
    
    


    
    
    
}
