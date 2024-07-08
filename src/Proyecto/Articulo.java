package Proyecto;

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
    private String palabrasClave;
    private int codigoUnico =(int)(Math.random()*1000);
 
    public Articulo(String titulo,String resumen,String contenido,String palabraClave ){
        
        this.resumen=resumen;
        this.contenido=contenido;
        this.palabrasClave=palabraClave;

        
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
    public String getPalabrasClave(){
        return palabrasClave;
    }
    public void setPalabrasClave(String palabrasClave){
        this.palabrasClave=palabrasClave;
    }
    
}
