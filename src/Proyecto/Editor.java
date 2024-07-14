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


    public Editor(String Journal, String nombre, String apellido, String correoElectronico, String user, String password) {
        super(nombre,apellido,correoElectronico,"E",user,password);
        this.Journal = Journal;

    }

    public String getJournal() {
        return Journal;
    }

    public void setJournal(String Journal) {
        this.Journal = Journal;
    }
    

    

   
    
    


    
    
    
}
