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
    private Consulta consulta;

    public Tratamiento(int idTratamiento, String tipoTratamiento, String descripcion, String medicamento, double precio, boolean activo, Consulta consulta ) {
        this.idTratamiento = idTratamiento;
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.consulta = consulta;
       
        this.precio = precio;
        this.activo = activo;
    }

    public Tratamiento(String tipoTratamiento, String descripcion, String medicamento,double precio, boolean activo, Consulta consulta) {
        this.tipoTratamiento = tipoTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.consulta = consulta;
       
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
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
        return "Tratamiento{" + "idTratamiento=" + idTratamiento + ", tipoTratamiento=" + tipoTratamiento + ", descripcion=" + descripcion + ", medicamento=" + medicamento + ", consulta=" + consulta + ", precio=" + precio + ", activo=" + activo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.tipoTratamiento);
        hash = 67 * hash + Objects.hashCode(this.medicamento);
        hash = 67 * hash + Objects.hashCode(this.consulta);
       
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tratamiento other = (Tratamiento) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.tipoTratamiento, other.tipoTratamiento)) {
            return false;
        }
        if (!Objects.equals(this.medicamento, other.medicamento)) {
            return false;
        }
        if (!Objects.equals(this.consulta, other.consulta)) {
            return false;
        }
     
        return true;
    }

}
