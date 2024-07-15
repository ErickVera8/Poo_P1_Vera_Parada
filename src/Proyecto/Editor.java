/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Editor extends Usuario{
    private String Journal;
    private EstadoArticulo estadoArticulo;
     


    public Editor(String Journal, String nombre, String apellido, String correoElectronico, String user, String password) {
        super(nombre,apellido,correoElectronico,RolUsuario.Editor,user,password);
        this.Journal = Journal;

    }

    public String getJournal() {
        return Journal;
    }

    public EstadoArticulo getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(EstadoArticulo estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }

    public void setJournal(String Journal) {
        this.Journal = Journal;
    }
    public void decidirSobreArticulo(String codigoIngresado){
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese nombre del Journal: ");
    String nombreJournal = sc.nextLine();
    setJournal(nombreJournal);


    for(Revision revision : Editorial.revisiones){
      if(revision.getArticulo().getCodigoArti().equals(codigoIngresado)){
        System.out.println("Estos son los comentarios ingresados por los revisores");
        System.out.println(revision.getComentarios());
        setRevision(revision); // LE ASIGNAMOS LA REVISION AL EDITOR
        setEstadoArticulo(EstadoArticulo.En_Revision); //EL ESTADO ARTICULO ESTA EN REVISION
        System.out.println("------------------------------------ ");
        tomarDecision(revision,sc); // LLAMAMOS AL METODO PARA QUE EL EDITOR TOME LA DECISION
      }else{
        System.out.println("Codigo no encontrado...");
      }
    }
   }
    public static void escribirArchivo(String nombreArchivo, Object objeto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write(objeto.toString() + "\n");
            if(objeto instanceof Autor){
                System.out.println(" escrito en el archivo" + nombreArchivo);
            }else if(objeto instanceof Revisor){
                System.out.println(" escrito en el archivo" + nombreArchivo);
            }else if(objeto instanceof Articulo){
                System.out.println(" escrito en el archivo" + nombreArchivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
            }
        }

   public void tomarDecision(Revision revision,Scanner sc){
    System.out.println("Editor: " + getNombre() + " " + getApellido());
    System.out.println("Ingrese su decisión para el artículo: " + revision.getArticulo().getTitulo());
    System.out.println("1. ACEPTAR");
    System.out.println("2. RECHAZAR");
    int decision = sc.nextInt();
    sc.nextLine();
    switch (decision) {
      case 1:
        setEstadoArticulo(EstadoArticulo.Publicado);
        Editor.escribirArchivo("revisiones.txt", toString()); //ESCRITURA DEL EDITOR
        //NOTIFICAR AL AUTOR LA DECISION DEL ARTICULO - LLAMAR AL METODO NOTIFICAR AUTOR
        break;
      case 2:
        setEstadoArticulo(EstadoArticulo.Rechazado);
        Editor.escribirArchivo("revisiones.txt", toString()); //ESCRITURA DEL EDITOR
        //NOTIFICAR AL AUTOR LA DECISION DEL ARTICULO - LLAMAR AL METODO NOTIFICAR AUTOR
        break;
      default:
      System.out.println("Opción no válida");
        break;
    }
    sc.close();
     }
   public void mostarTareaRealizar(Scanner sc){
    System.out.println("Tarea a realizar de: " + getNombre() + " " + getApellido());
    System.out.println("Registro de decisión final del artículo"); 
    System.out.print("Ingrese el codigo del artículo: ");
    String codigoIngresado = sc.nextLine();
    decidirSobreArticulo(codigoIngresado);
    Editor.escribirArchivo("revisiones.txt", toString()); //Verificar esto
    //notificar al autor sobre la decision final del articulo
  }
    

    

   
    
    


    
    
    
}
