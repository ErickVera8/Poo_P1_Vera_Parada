
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
        ArrayList<Editor> editores = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Revisor> revisores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                String nombre = datos[0];
                String apellido = datos[1];
                String correoElec = datos[2];
                String rol = datos[3];
                String user= datos[4];
                String password= datos[5];
                
                Usuario usuario = new Usuario(nombre,apellido,correoElec,rol,user,password);
                usuarios.add(usuario);
                if(rol.equals("E")){
                    String journal= datos[6];
                    
                    Editor editor = new Editor(journal, nombre,apellido,correoElec,user,password);
                    editores.add(editor);
                    
                }if(rol.equals("R")){
                    String especialidad = datos[6];
                    int numArticuloRevisado = Integer.parseInt(datos[7]);
                    
                    
                    Revisor revisor = new Revisor(especialidad,numArticuloRevisado,nombre,apellido,correoElec,user,password);
                    revisores.add(revisor);
                    
                    
                }if(rol.equals("A")){
                    String institucion=datos[6];
                    String campoInvestigacion = datos[7];
                    Autor autor = new Autor(institucion,campoInvestigacion,nombre,apellido,correoElec,user,password);
                    autores.add(autor);
                    
                    
                }
                
                
            }
        } catch (IOException e) {
            System.err.println("No se encontro archivo");
        }
        return usuarios;
    }
    public static Usuario iniciarSesion(String user,String password,ArrayList<Usuario> usuarios){
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equals(user) && usuario.getPassword().equals(password)) {
            return usuario;}
        
        }
        return null;
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
                    Scanner input = new Scanner(System.in);
                    System.out.println("Ingrese su usuario");
                    String user =input.nextLine();
                    System.out.println("Ingrese su contraseña");
                    String password = input.nextLine();
                    Usuario usuario=iniciarSesion(user,password,usuarios);
                    if(usuario.getRol().equals("R")){
                        System.out.println("Bienvenido "+usuario.getNombre());
                    }
                    if(usuario.getRol().equals("E")){
                        System.out.println("Bienvenido "+usuario.getNombre());
                        
                    }
                    
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
    }
}
    

    

    
    


