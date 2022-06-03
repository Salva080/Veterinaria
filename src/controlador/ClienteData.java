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
import modelo.Cliente;
import modelo.Conexion;

/**
 *
 * @author Maximiliano Gonzalez
 */
public class ClienteData {

    private Connection con = null;
    private String sql;

    public ClienteData(Conexion conexion) {

        con = conexion.getConexion();
    }

    public void agregarCliente(Cliente cliente) {
        try {
            sql = "INSERT INTO cliente(dni, nombre, apellido, direccion, telefono, contactoAlternativo, activo) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, (int) cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(5, (int) cliente.getTelefono());
            ps.setString(6, cliente.getContactoAlternativo());
            ps.setBoolean(7, cliente.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agregó el cliente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar el cliente");

            }
            ps.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Error");
        }

    }

    public void eliminarCliente(int id) {

        sql = "UPDATE cliente SET activo = 0 WHERE IdCliente = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se eliminó el cliente");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo elimiar el cliente");
        }

    }

    public boolean clienteExiste(int id) {
        boolean ret = false;
        try {
            sql = "SELECT * FROM cliente WHERE idCliente =?";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ret = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente, no existe");
        }
        return ret;
    }

    public void modificarCliente(int id, Cliente cliente) {

        sql = "UPDATE cliente SET dni=?, nombre=?, apellido=?, direccion=?, telefono=?, contactoAlternativo=? WHERE activo=1 AND idCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, (int) cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setString(4, cliente.getDireccion());
            ps.setInt(5, (int) cliente.getTelefono());
            ps.setString(6, cliente.getContactoAlternativo());

            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se modificó el cliente");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo modificar el cliente");
        }

    }

    public Cliente buscarCliente(int id) {

        Cliente cliente = null;
        try {

            sql = "SELECT * FROM cliente WHERE idCliente=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(1));
                cliente.setDni(rs.getInt(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                cliente.setDireccion(rs.getString(5));
                cliente.setTelefono(rs.getInt(6));
                cliente.setContactoAlternativo(rs.getString(7));
                cliente.setActivo(rs.getBoolean(8));

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda del cliente.");
        }
        return cliente;

    }

    public List<Cliente> listarClienteActivos() {

        List<Cliente> clientes = new ArrayList<>();
        try {
            sql = "SELECT * FROM cliente WHERE activo= 1  ORDER BY IdCliente ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt(1));
                cliente.setDni(rs.getInt(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                cliente.setDireccion(rs.getString(5));
                cliente.setTelefono(rs.getInt(6));
                cliente.setContactoAlternativo(rs.getString(7));
                clientes.add(cliente);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda. ");
        }
        return clientes;
    }

    public List<Cliente> listarClientesInactivos() {

        List<Cliente> clientes = new ArrayList<>();
        try {
            sql = "SELECT * FROM cliente WHERE activo= 0  ORDER BY IdCliente ASC";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setIdCliente(rs.getInt(1));
                cliente.setDni(rs.getInt(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApellido(rs.getString(4));
                cliente.setDireccion(rs.getString(5));
                cliente.setTelefono(rs.getInt(6));
                cliente.setContactoAlternativo(rs.getString(7));
                clientes.add(cliente);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error en la busqueda. ");
        }
        return clientes;
    }

    public void activarCliente(int id) {
        sql = "UPDATE cliente SET activo =1 WHERE IdCliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se dió de alta al cliente");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se puedo activar el cliente");
        }

    }
}
