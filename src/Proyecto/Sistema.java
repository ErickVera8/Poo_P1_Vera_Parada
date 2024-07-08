
package Proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Sistema {
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Articulo> articulos;
    
    //metodo para leer el txt
    public String leerTxt(String direccion){
        String texto="";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp="";
            String bfRead;
            while((bfRead = bf.readLine())!= null){
            temp = temp+bfRead+"\n";
            }
            
            texto = temp;
        }
        catch(IOException e){
            System.err.println("No se encontro archivo");
            
        }
        return texto;
    }
    //metodo para separar y crear los usuarios
    //public Usuario crearUsuario(String texto){
        //String[] linea = texto.split("\n");
        //for(int i=0;i<linea.length;i++){
             //String[] datos=linea[i].split(";");
             //for(int j=0;j<datos.length;j++){
                 //if(datos[5].equals("e")){
                     //Usuario datos[2]=new Editor(datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
                     
                     
                 //}
             //}
        //}
        
        
    //}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op = 0;
        while (op!=3) {
            System.out.println("-------------Acceso al Sistema--------");
            System.out.println("1. Someter Articulo");
            System.out.println("2. Iniciar Sesion");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    someterArticulo();
                    break;
                case 2:
                    iniciarSesion();
                    
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
    public static void iniciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su user: ");
        String user = sc.nextLine();
        System.out.println("Ingrese su password: ");
        String password = sc.nextLine();

        }
            

    
    
    
    
    
    
    
    
    
    
}
