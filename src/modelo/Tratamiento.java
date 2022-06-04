/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Salva
 */
public class Tratamiento {

    private int idTratamiento;
    private String tipoTratamiento;
    private String descripcion;
    private String medicamento;
    private double precio;
    private boolean activo;
   
    public Tratamiento(int idTratamiento, String tipoTratamiento, String descripcion, String medicamento, double precio, boolean activo) {
        this.idTratamiento = idTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
      
       
        this.precio = precio;
        this.activo = activo;
    }

    public Tratamiento(String tipoTratamiento, String descripcion, String medicamento,double precio, boolean activo, Consulta consulta) {
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
       
       
        this.precio = precio;
        this.activo = activo;
    }

    public Tratamiento() {
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

  

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Tratamiento{" + "  " + idTratamiento + ",  " + tipoTratamiento + ", " + descripcion + ",  " + medicamento +  ",  " + precio + ",  " + activo + '}';
    }

   
    
     
     

}
