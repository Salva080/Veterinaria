/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Mascota;
import modelo.Tratamiento;

/**
 *
 * @author Salva
 */
public class MascotaData {

    private Connection con = null;
    private String sql;
    private Conexion conexion;

    public MascotaData(Conexion conexion) {
        con = conexion.getConexion();
        this.conexion = conexion;
    }

    public Cliente buscarCliente(int id) {

        ClienteData cl = new ClienteData(conexion);
        return cl.buscarCliente(id);
    }

// Terminado OK
    public void agregarMascota(Mascota mascota) {

        try {
            sql = "INSERT INTO mascota (alias, sexo, especie, raza, colorPelaje, fechaNac, pesoActual, activo, idCliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelaje());
            ps.setDate(6, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(7, mascota.getPesoActual());
            ps.setBoolean(8, mascota.isActivo());
            ps.setInt(9, mascota.getCliente().getIdCliente());//
            
            
            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mascota.setIdMascota(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Se agrego la mascota con exito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar a la mascota");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error" + ex);
        }
    }

    public void eliminarMascota(int id) {
        sql = "UPDATE mascota SET activo = 0 WHERE idMascota = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();

            JOptionPane.showMessageDialog(null, "Se elimino a la mascota");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la mascota");
        }
    }

    public boolean mascotaExiste(int id) {
        boolean ret = false;
        try {
            sql = "SELECT * FROM mascota WHERE idMascota = ?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ret = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar a la mascota, no existe");
        }
        return ret;
    }

    
    
   // MODIFICAR
    public void modificarMascota(int idMascota, Mascota mascota) {
        
        sql = "UPDATE mascota SET alias = ?,sexo = ?,especie= ?,raza = ?,colorPelaje = ?,fechaNac = ?,pesoActual = ?,idCliente = ? WHERE activo = 1 AND idMascota = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, mascota.getAlias());
            ps.setString(2, mascota.getSexo());
            ps.setString(3, mascota.getEspecie());
            ps.setString(4, mascota.getRaza());
            ps.setString(5, mascota.getColorPelaje());
            ps.setDate(6, Date.valueOf(mascota.getFechaNac()));
            ps.setDouble(7,  mascota.getPesoActual());
            ps.setInt(8, mascota.getCliente().getIdCliente());
            ps.setInt(9, idMascota);
            
            
            ps.executeUpdate();
            
            ps.close(); 
            JOptionPane.showMessageDialog(null, "Se modificó la mascota");           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR LA MASCOTA" + ex.getMessage());
        }
    }

    public Mascota buscarMascota(int id) {
        Mascota mascota = null;
        try {
            sql = "SELECT * FROM `mascota` WHERE idMascota = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt(1));
                mascota.setAlias(rs.getString(2));
                mascota.setSexo(rs.getString(3));
                mascota.setEspecie(rs.getString(4));
                mascota.setRaza(rs.getString(5));
                mascota.setColorPelaje(rs.getString(6));
                mascota.setFechaNac(rs.getDate(7).toLocalDate());
                mascota.setPesoActual(rs.getDouble(8));
                mascota.setActivo(rs.getBoolean(9));

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la mascota");
        }
        return mascota;
    }

    public List<Mascota> listarMascotasActivas() {
        List<Mascota> mascotas = new ArrayList<>();
        try {
            sql = "SELECT * FROM `mascota` WHERE activo = 1 ORDER BY idMascota ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mascota mascota = new Mascota();

                mascota.setIdMascota(rs.getInt(1));
                mascota.setAlias(rs.getString(2));
                mascota.setSexo(rs.getString(3));
                mascota.setEspecie(rs.getString(4));
                mascota.setRaza(rs.getString(5));
                mascota.setColorPelaje(rs.getString(6));
                mascota.setFechaNac(rs.getDate(7).toLocalDate());
                mascota.setPesoActual(rs.getDouble(8));
                mascota.setActivo(rs.getBoolean(9));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA BUSQUEDA");
        }
        return mascotas;
    }

    public List<Mascota> listarMascotasInactivas() {
        List<Mascota> mascotas = new ArrayList<>();
        try {
            sql = "SELECT * FROM `mascota` WHERE activo = 0 ORDER BY idMascota ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mascota mascota = new Mascota();

                mascota.setIdMascota(rs.getInt(1));
                mascota.setAlias(rs.getString(2));
                mascota.setSexo(rs.getString(3));
                mascota.setEspecie(rs.getString(4));
                mascota.setRaza(rs.getString(5));
                mascota.setColorPelaje(rs.getString(6));
                mascota.setFechaNac(rs.getDate(7).toLocalDate());
                mascota.setPesoActual(rs.getDouble(8));
                mascota.setActivo(rs.getBoolean(9));
                mascotas.add(mascota);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR EN LA BUSQUEDA");
        }
        return mascotas;
    }

    public void activarMascotas(int id) {
        sql = "UPDATE `mascota` SET activo = 1 WHERE idMascota = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, "Se activo a la mascota nuevamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo activar a la mascota");
        }
    }

}
