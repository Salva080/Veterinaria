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
    private String detallesConsulta;
    private boolean activo;
    private double pesoConsulta;

    public Consulta(int idConsulta, double precio, LocalDate fechaConsulta, Mascota mascota, Tratamiento tratamiento, String detallesConsulta, boolean activo, double pesoConsulta) {
        this.idConsulta = idConsulta;
        this.precio = precio;
        this.fechaConsulta = fechaConsulta;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
        this.detallesConsulta=detallesConsulta;
        this.activo = activo;
        this.pesoConsulta = pesoConsulta;
    }

    public Consulta(double precio, LocalDate fechaConsulta, Mascota mascota, Tratamiento tratamiento,String detallesConsulta, boolean activo, double pesoConsulta) {
        this.precio = precio;
        this.fechaConsulta = fechaConsulta;
        this.mascota = mascota;
        this.tratamiento = tratamiento;
         this.detallesConsulta=detallesConsulta;
        this.activo = activo;
        this.pesoConsulta = pesoConsulta;
    }

    

    public Consulta() {
    }
    
  public String getDetallesConsulta() {
        return detallesConsulta;
    }

    public void setDetallesConsulta(String detallesConsulta) {
        this.detallesConsulta = detallesConsulta;
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

    public double getPesoConsulta() {
        return pesoConsulta;
    }

    public void setPesoConsulta(double pesoConsulta) {
        this.pesoConsulta = pesoConsulta;
    }

    @Override
    public String toString() {
        return idConsulta + ", precio " + precio + ", fecha de Consulta  " + fechaConsulta + ", " + mascota + ", tratamiento " + tratamiento + ", " + activo + ", peso Consulta " + pesoConsulta + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.fechaConsulta);
        hash = 79 * hash + Objects.hashCode(this.mascota);
        hash = 79 * hash + Objects.hashCode(this.tratamiento);
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
        final Consulta other = (Consulta) obj;
        if (!Objects.equals(this.fechaConsulta, other.fechaConsulta)) {
            return false;
        }
        if (!Objects.equals(this.mascota, other.mascota)) {
            return false;
        }
        if (!Objects.equals(this.tratamiento, other.tratamiento)) {
            return false;
        }
        return true;
    }

}
