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
            ps.setInt(6, tratamiento.getConsulta().getIdConsulta());
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
}
