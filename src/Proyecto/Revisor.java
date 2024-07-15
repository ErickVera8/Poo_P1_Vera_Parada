package Proyecto;

/**
 *
 * @author Erick
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Revisor extends Usuario {
    private String especialidad;
    private int numeroArticulosRevisados;
    private List<String> articulosAsignados;
    
    public Revisor(String especialidad, int numeroArticulosRevisados, String nombre, String correoElectronico, String apellido, String user, String password) {
        super(nombre, correoElectronico, apellido,RolUsuario.Revisor, user, password);
        this.especialidad = especialidad;
        this.numeroArticulosRevisados = numeroArticulosRevisados;
        this.articulosAsignados = new ArrayList<>();
        
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroArticulosRevisados() {
        return numeroArticulosRevisados;
    }

    public void setNumeroArticulosRevisados(int numeroArticulosRevisados) {
        this.numeroArticulosRevisados = numeroArticulosRevisados;
    }
    
    public void asignarArticulo(String articulo) {
        articulosAsignados.add(articulo);
    }

    public void aceptarAsignacion(String articulo) {
        if (articulosAsignados.contains(articulo)) {
            System.out.println("Asignación aceptada para el artículo: " + articulo);
            numeroArticulosRevisados++;
        } else {
            System.out.println("El artículo " + articulo + " no está asignado a este revisor.");
        }
    }

    public void rechazarAsignacion(String articulo) {
        if (articulosAsignados.contains(articulo)) {
            articulosAsignados.remove(articulo);
            System.out.println("Asignación rechazada para el artículo: " + articulo);
        } else {
            System.out.println("El artículo " + articulo + " no está asignado a este revisor.");
        }
    }
    
    
    public String generarCorreoElectronico() {
        return "Estimado/a " + getNombre() + " " + getApellido() + ",\n\nSe le ha asignado un nuevo artículo para revisión.\n\nSaludos,\nComité Editorial";
    }

    @Override
    public String toString() {
        return "Revisor{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", correoElectronico='" + getCorreoElectronico() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", numeroArticulosRevisados=" + numeroArticulosRevisados +
                '}';
    }

    public static List<Revisor> cargarRevisores(String archivo) {
        List<Revisor> revisores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                Revisor revisor = new Revisor(datos[0],Integer.parseInt(datos[4]),datos[1],datos[2],datos[3],datos[4],datos[5],datos[6]);
                revisores.add(revisor);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return revisores;
    }

    public static void guardarRevisores(String archivo, List<Revisor> revisores) {
        try (FileWriter fw = new FileWriter(archivo)) {
            for (Revisor revisor : revisores) {
                fw.write(revisor.getNombre() + "," + revisor.getApellido() + "," + revisor.getCorreoElectronico() + "," + revisor.getEspecialidad() + "," + revisor.getNumeroArticulosRevisados() + "\n");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}