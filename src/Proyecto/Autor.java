/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;

/**
 *
 * @author Erick
 */
public class Autor extends Usuario{
    private int codigoIdentificacion;
    private String institucion;
    private String campoInvestigacion;
    private String user;
    private String password;
    int aleatorio=(int)(Math.random()*1000);

    public Autor(int codigoIdentificacion, String institucion, String campoInvestigacion, String nombre, String apellido,String correoElectronico,String user,String password) {
        super(nombre,apellido,correoElectronico,"A");
        this.codigoIdentificacion = aleatorio;
        this.institucion = institucion;
        this.campoInvestigacion = campoInvestigacion;
        this.user = user;
        this.password = password;
    }
    

    public int getCodigoIdentificacion() {
        return codigoIdentificacion;
    }

    public void setCodigoIdentificacion(int codigoIdentificacion) {
        this.codigoIdentificacion = codigoIdentificacion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCampoInvestigacion() {
        return campoInvestigacion;
    }

    public void setCampoInvestigacion(String campoInvestigacion) {
        this.campoInvestigacion = campoInvestigacion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAleatorio() {
        return aleatorio;
    }

   
  
}
