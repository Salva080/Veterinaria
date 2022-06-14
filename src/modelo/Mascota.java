/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Manuel Belgrano Nº3
 */
public class Mascota {
    private int idMascota;
    private String alias;
    private String sexo;
    private String especie;
    private String raza;
    private String colorPelaje;
    private LocalDate fechaNac;    
    private double pesoMascota;
    private boolean activo;
    private Cliente cliente;
    private double pesoActual;

    public Mascota(int idMascota, String alias, String sexo, String especie, String raza, String colorPelaje, LocalDate fechaNac, double pesoMascota, boolean activo, Cliente cliente, double pesoActual) {
        this.idMascota = idMascota;
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.fechaNac = fechaNac;
        this.pesoMascota = pesoMascota;
        this.activo = activo;
        this.cliente = cliente;
        this.pesoActual = pesoActual;
    }

    public Mascota(String alias, String sexo, String especie, String raza, String colorPelaje, LocalDate fechaNac, double pesoMascota, boolean activo, Cliente cliente, double pesoActuala) {
        this.alias = alias;
        this.sexo = sexo;
        this.especie = especie;
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.fechaNac = fechaNac;
        this.pesoMascota = pesoMascota;
        this.cliente = cliente;
        this.pesoActual = pesoActual;
    }
           
    public Mascota() {
    }

    public double getPesoMascota() {
        return pesoMascota;
    }

    public void setPesoMascota(double pesoMascota) {
        this.pesoMascota = pesoMascota;
    }

   

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.alias);
        hash = 17 * hash + Objects.hashCode(this.cliente);
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
        final Mascota other = (Mascota) obj;
        if (!Objects.equals(this.alias, other.alias)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idMascota + "," + alias + "," + sexo + "," + especie + "," + raza + "," + colorPelaje + "," + fechaNac + "," + pesoMascota +" ,"+ cliente +", "+ pesoActual;
    }
    
    
}