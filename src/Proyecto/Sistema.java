
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
    
    
    //metodo para leer el txt
    public static ArrayList<Usuario> leerArchivoUsuario(String archivo) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                String nombre = datos[0];
                String apellido = datos[1];
                String correoElec = datos[2];
                String rol = datos[3];
                
                Usuario usuario = new Usuario(nombre,apellido,correoElec,rol);
                usuarios.add(usuario);
                
            }
        } catch (IOException e) {
            System.err.println("No se encontro archivo");
        }
        return usuarios;
    }
    
    
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = Sistema.leerArchivoUsuario("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Proyecto\\Usuario.txt");
        Scanner sc = new Scanner(System.in);
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
        int op = 0;
        while (op!=3) {
            System.out.println("-------------Acceso al Sistema--------");
            System.out.println("1. Someter Articulo");
            System.out.println("2. Iniciar Sesion");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //someterArticulo();
                    break;
                case 2:
                    //iniciarSesion();
                    
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
    //public static void iniciarSesion(){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Ingrese su user: ");
        //String user = sc.nextLine();
        //System.out.println("Ingrese su password: ");
        //String password = sc.nextLine();

        }
            

    
    
    
    
    
    
    
    
    
    
}
