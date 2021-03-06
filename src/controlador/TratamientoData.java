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
            sql = "INSERT INTO Tratamiento (tipoTratamiento, descripcion, medicamento, precio, activo) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, tratamiento.getTipoTratamiento());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setString(3, tratamiento.getMedicamento());
            ps.setDouble(4, tratamiento.getPrecio());
            ps.setBoolean(5, tratamiento.isActivo());
            //  ps.setInt(6, Tratamiento.getConsulta().getIdConsulta());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                tratamiento.setIdTratamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó el tratamiento");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el Tratamiento");

            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error");
        }

    }
//Agreagar ok.

    public void eliminarTratamiento(int id) {
        sql = "UPDATE tratamiento SET activo = 0 WHERE idTratamiento = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Se eliminó el Tratamiento");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el Tratamiento");
        }

    }
//eliminar ok.    

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
           // JOptionPane.showMessageDialog(null, "El tratamiento si existe");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el Tratamiento, no existe");
        }
        return ret;
    }
//existe ok.

    
    //modificado y controlado
    public void modificarTratamiento(int id, Tratamiento tratamiento) {

        sql = "UPDATE tratamiento SET tipoTratamiento=?, descripcion=?, medicamento=?, precio=? WHERE activo=1 AND idTratamiento=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, tratamiento.getTipoTratamiento());
            ps.setString(2, tratamiento.getDescripcion());
            ps.setString(3, tratamiento.getMedicamento());
            ps.setDouble(4, tratamiento.getPrecio());
           
             ps.setInt(5, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se modificó el Tratamiento");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo modificar el Tratamiento");
        }

    }
    
     public void activarTratamiento(int id) {
        sql = "UPDATE tratamiento SET activo = 1 WHERE idTratamiento = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Se dió de alta el Tratamiento");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo dar de alta el Tratamiento");
        }

    }

    public Tratamiento buscarTratamiento(int id) {

        Tratamiento tratamiento = null;
        try {

            sql = "SELECT * FROM tratamiento WHERE idTratamiento = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tratamiento = new Tratamiento();
                // correcto         
                tratamiento.setIdTratamiento(rs.getInt(1));

         
                tratamiento.setTipoTratamiento(rs.getString(2));
                tratamiento.setDescripcion(rs.getString(3));
                tratamiento.setMedicamento(rs.getString(4));
                tratamiento.setPrecio(rs.getDouble(5));
                tratamiento.setActivo(rs.getBoolean(6));
             

            }
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda del Tratamiento.");
        }
        return tratamiento;

    }

    public List<Tratamiento> listarTratamientos() {

        List<Tratamiento> Tratamientos = new ArrayList<>();
        try {
            sql = "SELECT * FORM tratamiento ORDER BY tratamiento, idTratamiento ASC";
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
                //  ps.setInt(7, Tratamiento.getConsulta().getIdConsulta());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda de tratamientos. ");
        }
        return Tratamientos;
    }

    //tratamientos activos, no activos,por tipo
    public ArrayList<Tratamiento> listarTratamientos(int valor, String tt) {
Tratamiento tratamiento;
        ArrayList<Tratamiento> tlista = new ArrayList<Tratamiento>();
        switch(valor){
            case 0:
                sql = "SELECT * FROM tratamiento";
                break;
            case 1:
                sql = "SELECT * FROM tratamiento where activo=0";
                break;
            case 2:
                sql = "SELECT * FROM tratamiento where activo=1";
                break;
            case 3:
                 sql = "SELECT * FROM tratamiento where tipoTratamiento like '%"+tt+"%'";
                 break;
                           
            default: break;    
        }
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tratamiento = new Tratamiento();
tratamiento.setIdTratamiento(rs.getInt("idTratamiento"));
tratamiento.setTipoTratamiento(rs.getString("tipoTratamiento"));
tratamiento.setMedicamento(rs.getString("medicamento"));
tratamiento.setDescripcion(rs.getString("descripcion"));
tratamiento.setPrecio(rs.getDouble("precio"));
tratamiento.setActivo(rs.getBoolean("activo"));
              
                tlista.add(tratamiento);
            }
            ps.close();

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, " Error en la busqueda de tratamientos. ");
        }
        return tlista;
    }
}
