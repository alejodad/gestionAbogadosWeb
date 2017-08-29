/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ale
 */
public class Abogado {
private String cedulaAbogado;
private String nombreAbogado;
private String numeroTelefonoAbogado;
private String biograiaAbogado;
private String idEspecialidad;

    public Abogado(String cedulaAbogado, String nombreAbogado, String numeroTelefonoAbogado, String biograiaAbogado, String idEspecialidad) {
        this.cedulaAbogado = cedulaAbogado;
        this.nombreAbogado = nombreAbogado;
        this.numeroTelefonoAbogado = numeroTelefonoAbogado;
        this.biograiaAbogado = biograiaAbogado;
        this.idEspecialidad = idEspecialidad;
    }

    public Abogado() {
        this.cedulaAbogado = "";
        this.nombreAbogado = "";
        this.numeroTelefonoAbogado = "";
        this.biograiaAbogado = "";
        this.idEspecialidad = "";
    }

    public String getCedulaAbogado() {
        return cedulaAbogado;
    }

    public void setCedulaAbogado(String cedulaAbogado) {
        this.cedulaAbogado = cedulaAbogado;
    }

    public String getNombreAbogado() {
        return nombreAbogado;
    }

    public void setNombreAbogado(String nombreAbogado) {
        this.nombreAbogado = nombreAbogado;
    }

    public String getNumeroTelefonoAbogado() {
        return numeroTelefonoAbogado;
    }

    public void setNumeroTelefonoAbogado(String numeroTelefonoAbogado) {
        this.numeroTelefonoAbogado = numeroTelefonoAbogado;
    }

    public String getBiograiaAbogado() {
        return biograiaAbogado;
    }

    public void setBiograiaAbogado(String biograiaAbogado) {
        this.biograiaAbogado = biograiaAbogado;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(String idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
                                    
                                    
}
