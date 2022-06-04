package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Salva
 */
public class Consulta {

    private int idConsulta;
    private double precio;
    private LocalDate fechaConsulta;
    private Mascota mascota; ///
    private Tratamiento tratamiento;
    private boolean activo;
    private double pesoPromedio;

    public Consulta(int idConsulta, double precio, LocalDate fechaConsulta, Mascota mascota, Tratamiento tratamiento, boolean activo, double pesoPromedio) {
        this.idConsulta = idConsulta;
        this.precio = precio;
        this.fechaConsulta = fechaConsulta;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.activo = activo;
        this.pesoPromedio = pesoPromedio;
    }

    public Consulta(double precio, LocalDate fechaConsulta, Mascota mascota, Tratamiento tratamiento, boolean activo, double pesoPromedio) {
        this.precio = precio;
        this.fechaConsulta = fechaConsulta;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.activo = activo;
        this.pesoPromedio = pesoPromedio;
    }

    public Consulta() {
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDate fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getPesoPromedio() {
        return pesoPromedio;
    }

    public void setPesoPromedio(double pesoPromedio) {
        this.pesoPromedio = pesoPromedio;
    }

    @Override
    public String toString() {
        return  idConsulta + ", precio " + precio + ", fecha de Consulta  " + fechaConsulta + ", " + mascota + ", tratamiento " + tratamiento + ", " + activo + ", peso Promedio " + pesoPromedio + '}';
    }

   
    

    
}

