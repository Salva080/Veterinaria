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
public class Cliente {
    private int idCliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private int telefono;
    private String contactoAlternativo;
    private boolean activo;

    public Cliente(int idCliente, int dni, String nombre, String apellido, String direccion, int telefono, String contactoAlternativo, boolean activo) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.apellido = nombre;
        this.nombre = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public Cliente(int dni, String nombre, String apellido, String direccion, int telefono, String contactoAlternativo, boolean activo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contactoAlternativo = contactoAlternativo;
        this.activo = activo;
    }

    public Cliente() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContactoAlternativo() {
        return contactoAlternativo;
    }

    public void setContactoAlternativo(String contactoAlternativo) {
        this.contactoAlternativo = contactoAlternativo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    

    @Override
    public String toString() {
        return dni+", "+apellido+", "+nombre; //MODIFICADO  
    }

    @Override
    public int hashCode() { //MODIFICADO
        int hash = 7;
        hash = 89 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) { //MODIFICADO
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    

    
}