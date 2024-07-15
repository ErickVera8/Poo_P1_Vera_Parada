package Proyecto;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick
 */
public class Articulo {
    private String titulo;
    private String resumen;
    private String contenido;
    private ArrayList<String> palabrasClaves;
    private String codigoUnico ;
    private EstadoArticulo estado;
    private static final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
 
    public Articulo(String titulo,String resumen,String contenido,ArrayList palabraClave,EstadoArticulo estado ){
        
        this.resumen=resumen;
        this.contenido=contenido;
        this.palabrasClaves=palabraClave;
        this.codigoUnico=generarCodigoArticulo();
        this.estado=estado;
        Sistema.articulos.add(this);

        
    }
    private static String generarCodigoArticulo(){
    Random rd = new Random();
    StringBuilder codigo = new StringBuilder(5);
    for(int i = 0; i< 5;i++){
      int var = rd.nextInt(caracteres.length());
      codigo.append(caracteres.charAt(var));
    }
    return codigo.toString();
}
    public static Articulo ingresarDatosArticulo(Scanner sc, Autor autor){
        System.out.println("------------------------------------");
        System.out.println(autor.getNombre() + " " + autor.getApellido() + ", Ingrese los datos de su artículo");
        System.out.println("------------------------------------");
        System.out.print("Ingrese el título del artículo: ");
        String titulo = sc.nextLine();
        System.out.print("Ingrese el contenido del artículo: ");
        String contenido = sc.nextLine();
        System.out.print("Ingrese la cantidad de palabras clave que va ingresar: ");
        int cantP = sc.nextInt();
        sc.nextLine();
        ArrayList<String> palabrasClaves = new ArrayList<>();
        for(int i = 1; i < cantP + 1;i++){
            System.out.println("Ingrese la palabra clave N(" +i+")");
            String pClave = sc.nextLine();
            palabrasClaves.add(pClave);
            }
        System.out.print("Ingrese resumen del artículo: ");
        String resumen = sc.nextLine();

        return new Articulo(titulo,contenido,resumen,palabrasClaves,EstadoArticulo.Ingresado);
  }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getResumen(){
        return resumen;
    }
    public void setResumen(String resumen){
        this.resumen=resumen;
    }
    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido=contenido;
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public EstadoArticulo getEstado() {
        return estado;
    }

    public void setEstado(EstadoArticulo estado) {
        this.estado = estado;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }
    
}
