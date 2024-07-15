
package Proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick
 */
public class Sistema {
        public static ArrayList<Usuario> usuarios = new ArrayList<>();
        public static ArrayList<Editor> editores = new ArrayList<>();
        public static ArrayList<Autor> autores = new ArrayList<>();
        public static ArrayList<Revisor> revisores = new ArrayList<>();
        public static ArrayList<Articulo> articulos = new ArrayList<>();
        
    
    
    //metodo para leer el txt
    public static ArrayList<Usuario> leerArchivoUsuario(String archivo) {

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                String nombre = datos[0];
                String apellido = datos[1];
                String correoElec = datos[2];
                String rolUsuario = datos[3];
                String user= datos[4];
                String password= datos[5];
                
                Usuario usuario = new Usuario(nombre,apellido,correoElec,user,password);
                usuarios.add(usuario);
                switch (rolUsuario){
                    case "Editor":
                    String journal= datos[6];
                    
                    Editor editor = new Editor(journal, nombre,apellido,correoElec,user,password);
                    editores.add(editor);
                    break;
                    case "Revisor":
                        String especialidad = datos[6];
                        int numArticuloRevisado = Integer.parseInt(datos[7]); 
                        Revisor revisor = new Revisor(especialidad,numArticuloRevisado,nombre,apellido,correoElec,user,password);
                        revisores.add(revisor);
                    break;
                    case "Autor":
                        String institucion=datos[6];
                        String campoInvestigacion = datos[7];
                        Autor autor = new Autor(institucion,campoInvestigacion,nombre,apellido,correoElec,user,password);
                        autores.add(autor);
                    break;
                    default:
                            System.out.println("Tipo de usuario no permitido: " + rolUsuario);
                            break;
                    
                    
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
        public static void iniciarSesion(Scanner sc){
        System.out.print("Ingrese su usuario: ");
        String userV = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraV = sc.nextLine();
        boolean comprobarUsuario = false;
        for(Usuario usuario: usuarios){
            if(usuario.getPassword().equals(contraV) && usuario.getUser().equals(userV)){ 
                comprobarUsuario = true;
                if (usuario instanceof Revisor){
                    Revisor revisor = (Revisor) usuario;
                    System.out.println("------------------------------------------------");
                    System.out.println("Bienvenido " + revisor.getNombre() + " " + revisor.getApellido());
                    revisor.mostrarTareaRealizar();
                    break;
                }else if(usuario instanceof Editor){
                    Editor editor = (Editor) usuario;
                    System.out.println("------------------------------------------------");
                    System.out.println("Bienvenido " + editor.getNombre() + " " + editor.getApellido());
                    editor.mostarTareaRealizar(sc);
                }
                break;
            } 
        }
        if(!comprobarUsuario){
            System.out.println("Usuario o contraseña incorrectos...");
            System.out.println("-----------------------------------------");
        }
    }

// metodo para escribir en los archivos
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

    
    
    
    

    
    
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = Sistema.leerArchivoUsuario("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Proyecto\\Usuario.txt");
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
                    //someterArticulo();
                    break;
                case 2:
                    iniciarSesion(sc);
                    
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
    }
}
    

    

    
    


