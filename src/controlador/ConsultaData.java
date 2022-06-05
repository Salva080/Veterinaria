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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Tratamiento;

public class ConsultaData {

    private Connection con = null;
    private String sql;
    private Conexion conexion;

    public ConsultaData(Conexion conexion) {
        con = conexion.getConexion();
        this.conexion = conexion;

    }

//    public double promediarPeso() {
//    double promedio=0;
//      return promedio
//    }
//    public void CobrarConsulta() {
//      
//    }
    public List<Mascota> listarMascotasPorCliente(int idCliente) {

        List<Mascota> mascotas = new ArrayList<>();
        Mascota mascota;
        sql = " SELECT * FROM mascota WHERE idCliente= ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                mascota = new Mascota();
                mascota.setIdMascota(rs.getInt("idMascota"));
                mascota.setAlias(rs.getString("alias"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setEspecie(rs.getString("especie"));
                mascota.setRaza(rs.getString("raza"));
                mascota.setColorPelaje(rs.getString("colorPelaje"));
                mascota.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                mascota.setPesoActual(rs.getDouble("pesoActual"));

                mascota.setActivo(rs.getBoolean("activo"));
                mascotas.add(mascota);

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo generar el listado de mascotas.");
        }
        return mascotas;
    }

    public Cliente buscarClientePorMascota(int idMascota) {
        Cliente cliente = null;
        try {
            sql = "SELECT * FROM cliente,mascota WHERE mascota.idCliente= cliente.idCliente AND mascota.idMascota =?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getInt(1));
                cliente.setDni(rs.getInt(2));
                cliente.setApellido(rs.getString(3));
                cliente.setNombre(rs.getString(4));
                cliente.setDireccion(rs.getString(5));
                cliente.setTelefono(rs.getInt(6));
                cliente.setContactoAlternativo(rs.getString(7));
                cliente.setActivo(rs.getBoolean(8));
                /*private int idCliente;
    private int dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private int telefono;
    private String contactoAlternativo;
    private boolean activo;*/
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente");
        }
        return cliente;
    }

    public void registrarConsulta(Consulta consulta) {
        sql = "INSERT INTO consulta (precio, fechaConsulta, idMascota, idTratamiento, activo, pesoPromedio) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, consulta.getPrecio());
            ps.setDate(2, (consulta.getFechaConsulta()));
            ps.setInt(3, consulta.getMascota().getIdMascota());
            ps.setInt(4, consulta.getTratamiento().getIdTratamiento());
            ps.setBoolean(5, consulta.isActivo());
            ps.setDouble(6, consulta.getPesoPromedio());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                consulta.setIdConsulta(rs.getInt(1));

                JOptionPane.showMessageDialog(null, " Se registró la consulta.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la consulta.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en la conexíon- (inscribir).");
        }

    }

    public void modificarConsulta(int idConsulta, Consulta consulta) {

        sql = "UPDATE consulta SET precio=?, fechaConsulta=?, idMascota=?, idTratamiento=?, pesoPromedio=?, WHERE idConsulta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, consulta.getPrecio());
            ps.setDate(2, Date.valueOf(consulta.getFechaConsulta()));
            ps.setInt(3, consulta.getMascota().getIdMascota());
            ps.setInt(3, consulta.getTratamiento().getIdTratamiento());
            ps.setDouble(5, consulta.getPesoPromedio());

            ps.setInt(1, idConsulta);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se modificó la consulta.");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo modificar la consulta.");
        }

    }
    
    public void eliminarConsulta(int idMascota, int idTratamiento) {

        try {

            sql = "DELETE FROM consulta WHERE idMascota =? and idTratamiento = ?";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMascota);
            ps.setInt(2, idTratamiento);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se eliminó la consulta ");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la consulta " + ex.getMessage());
        }

    }

    public Tratamiento buscarTratamiento(int id) {

        TratamientoData tr = new TratamientoData(conexion);
        return tr.buscarTratamiento(id);
    }

    public Mascota buscarMascota(int id) {

        MascotaData md = new MascotaData(conexion);
        return md.buscarMascota(id);

    }

    public List<Consulta> listarConsultasporMascota(int idMascota) {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta;
        Mascota mascota;
        Tratamiento tratamiento;

        sql = "SELECT * FROM consulta WHERE idMascota = ? ORDER BY idTratamiento ASC ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                consulta = new Consulta();
                consulta.setIdConsulta(rs.getInt("idConsulta"));

                tratamiento = buscarTratamiento(rs.getInt("idTratamiento"));
                consulta.setTratamiento(tratamiento);

                mascota = buscarMascota(rs.getInt("IdMascota"));

                consulta.setMascota(mascota);
                consulta.setTratamiento(tratamiento);
                consultas.add(consulta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener las consultas" + ex.getMessage());
        }

        return consultas;
    }

    public List<Consulta> listarConsultasPorTratamiento(int idTratamiento, String tipoTratamiento) {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta;
        Mascota mascota;
        Tratamiento tratamiento;

        if (tipoTratamiento == null);
        {

            try {
                sql = "SELECT * FROM consulta, tratamiento, mascota WHERE idTratamiento = ? ORDER BY tipoTratamiento ASC ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idTratamiento);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    consulta = new Consulta();
                    consulta.setIdConsulta(rs.getInt("idConsulta"));

                    tratamiento = buscarTratamiento(rs.getInt("idTratamiento"));
                    consulta.setTratamiento(tratamiento);

                    mascota = buscarMascota(rs.getInt("IdMascota"));

                    consulta.setMascota(mascota);
                    consulta.setTratamiento(tratamiento);
                    consultas.add(consulta);
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener las consultas" + ex.getMessage());
            }

        }
        if (idTratamiento == 0) {
            try {
                sql = "SELECT * FROM consulta, tratamiento, mascota WHERE tipoTratamiento = ? ORDER BY tipoTratamiento ASC ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, tipoTratamiento);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    consulta = new Consulta();
                    consulta.setIdConsulta(rs.getInt("idConsulta"));

                    tratamiento = buscarTratamiento(rs.getInt("idTratamiento"));
                    consulta.setTratamiento(tratamiento);

                    mascota = buscarMascota(rs.getInt("IdMascota"));

                    consulta.setMascota(mascota);
                    consulta.setTratamiento(tratamiento);
                    consultas.add(consulta);
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener las consultas" + ex.getMessage());
            }

        }
        return consultas;
    }

    public List<Tratamiento> listarTratamientosporMascota(int idMascota) {
        List<Tratamiento> tratamientos = new ArrayList<>();
        Tratamiento trat;
        sql = "SELECT * FROM consulta,tratamiento WHERE tratamiento.idTratamiento=consulta.idTratamiento AND idMascota =? ORDER BY tipoTratamiento ASC;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMascota);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                trat = new Tratamiento();
                trat.setIdTratamiento(rs.getInt("IdTratamiento"));
                trat.setTipoTratamiento(rs.getString("tipoTratamiento"));
                trat.setDescripcion(rs.getString("descripcion"));
                trat.setMedicamento(rs.getString("medicamento"));
                trat.setPrecio(rs.getDouble("precio"));
                trat.setActivo(rs.getBoolean("activo"));

                tratamientos.add(trat);
                rs.close();
                /*private int idTratamiento;
    private String tipoTratamiento;
    private String descripcion;
    private String medicamento;
    private double precio;
    private boolean activo;*/
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo obtener el listado de tratamientos");

        }

        return tratamientos;

    }

    public List<Consulta> listarConsultasActivas() {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consul;
        Mascota mascota;
        Tratamiento tratamiento;

        sql = "SELECT * FROM consulta WHERE activo=1 ORDER BY fecha ASC;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                consul = new Consulta();
                consul.setIdConsulta(rs.getInt("idConsulta"));
                consul.setPrecio(rs.getDouble("precio"));
                consul.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate());

                consul.setPesoPromedio(rs.getDouble("pesoPromedio"));
                consul.setActivo(rs.getBoolean("activo"));
                tratamiento = buscarTratamiento(rs.getInt("idTratamiento"));
                consul.setTratamiento(tratamiento);

                mascota = buscarMascota(rs.getInt("IdMascota"));

                consul.setMascota(mascota);
                consul.setTratamiento(tratamiento);

                consultas.add(consul);
                rs.close();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " No se pudo obtener el listado de consultas activas");

        }

        return consultas;

    }

    public List<Consulta> listarConsultasInactivas() {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consul;
        Mascota mascota;
        Tratamiento tratamiento;

        sql = "SELECT * FROM consulta WHERE activo=0 ORDER BY fecha ASC;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                consul = new Consulta();
                consul.setIdConsulta(rs.getInt("idConsulta"));
                consul.setPrecio(rs.getDouble("precio"));
                consul.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate());

                consul.setPesoPromedio(rs.getDouble("pesoPromedio"));
                consul.setActivo(rs.getBoolean("activo"));
                tratamiento = buscarTratamiento(rs.getInt("idTratamiento"));
                consul.setTratamiento(tratamiento);

                mascota = buscarMascota(rs.getInt("IdMascota"));

                consul.setMascota(mascota);
                consul.setTratamiento(tratamiento);

                consultas.add(consul);
                rs.close();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " No se pudo obtener el listado de consultas Inactivas");

        }

        return consultas;

    }
}
