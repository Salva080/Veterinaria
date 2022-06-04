/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Tratamiento;
import modelo.Conexion;

/**
 *
 * @author Maximiliano Gonzalez
 */
public class TratamientoData {

    private Connection con = null;
    private String sql;

    public TratamientoData(Conexion conexion) {

        con = conexion.getConexion();
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        try {
            sql = "INSERT INTO tratamiento (tipoTratamiento, descripcion, medicamento, precio, activo, idConsulta) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, tratamiento.getTipoTratamiento());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setString(3, tratamiento.getMedicamento());
            ps.setDouble(4, tratamiento.getPrecio());
            ps.setBoolean(5, tratamiento.isActivo());
            //  ps.setInt(6, tratamiento.getConsulta().getIdConsulta());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tratamiento.setIdTratamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó el tratamiento");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el tratamiento");

            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error");
        }

    }

    public void eliminarTratamiento(int id) {
        sql = "UPDATE tratamiento SET activo = 0 WHERE idTratamiento = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Se eliminó el tratamiento");
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "No se pudo eliminar el tratamiento");
    }

    public boolean tratamientoExiste(int id) {
        boolean ret = false;
        try {
            sql = "SELECT * FROM tratamiento WHERE idTratamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ret = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el tratamiento, no existe");
        }
        return ret;
    }

    public void modificarTratamiento(int id, Tratamiento tratamiento) {

        sql = "UPDATE tratamiento SET apellido=?, nombre=?, fechaNac=? WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tratamiento.getTipoTratamiento());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setString(3, tratamiento.getMedicamento());
            ps.setDouble(4, tratamiento.getPrecio());
            ps.setBoolean(5, tratamiento.isActivo());
            //  ps.setInt(6, tratamiento.getConsulta().getIdConsulta());
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se modificó el tratamiento");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo modificar el tratamiento");
        }

    }

    public Tratamiento buscartratamiento(int id) {

        Tratamiento tratamiento = null;
        try {

            sql = "SELECT * FROM tratamiento WHERE idTratamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tratamiento = new Tratamiento();
                ps.setInt(1, tratamiento.getIdTratamiento());
                ps.setString(2, tratamiento.getTipoTratamiento());
                ps.setString(3, tratamiento.getDescripcion());
                ps.setString(4, tratamiento.getMedicamento());
                ps.setDouble(5, tratamiento.getPrecio());
                ps.setBoolean(6, tratamiento.isActivo());
                //  ps.setInt(7, tratamiento.getConsulta().getIdConsulta());

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda del tratamiento.");
        }
        return tratamiento;

    }

    public List<Tratamiento> listarTratamientosActivos() {

        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            sql = "SELECT * FROM tratamiento WHERE activo= 1  ORDER BY idTratamiento ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento tratamiento = new Tratamiento();

                ps.setInt(1, tratamiento.getIdTratamiento());
                ps.setString(2, tratamiento.getTipoTratamiento());
                ps.setString(3, tratamiento.getDescripcion());
                ps.setString(4, tratamiento.getMedicamento());
                ps.setDouble(5, tratamiento.getPrecio());
                ps.setBoolean(6, tratamiento.isActivo());
                //  ps.setInt(7, tratamiento.getConsulta().getIdConsulta());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda. ");
        }
        return tratamientos;
    }

    public List<Tratamiento> listartratamientosInactivos() {

        List<Tratamiento> tratamientos = new ArrayList<>();
        try {
            sql = "SELECT * FROM tratamiento WHERE activo= 0  ORDER BY idTratamiento ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tratamiento tratamiento = new Tratamiento();

                ps.setInt(1, tratamiento.getIdTratamiento());
                ps.setString(2, tratamiento.getTipoTratamiento());
                ps.setString(3, tratamiento.getDescripcion());
                ps.setString(4, tratamiento.getMedicamento());
                ps.setDouble(5, tratamiento.getPrecio());
                ps.setBoolean(6, tratamiento.isActivo());
                //  ps.setInt(7, tratamiento.getConsulta().getIdConsulta());

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda. ");
        }
        return tratamientos;
    }
    
    public void activarTratamiento(int id) {
        sql = "UPDATE Tratamiento SET activo =1 WHERE idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se dió de alta el tratamiento");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se puedo activar el tratamiento");
        }

    }

}
