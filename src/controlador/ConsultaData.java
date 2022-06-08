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
///ok
    public List<Consulta> promediarPesoPorMascota(int idMascota) {

        List<Consulta> promedios = new ArrayList<>();
        Consulta consulta;
        Mascota mascota;
        try {
            sql = "SELECT consulta.idMascota, idConsulta, AVG(pesoPromedio) FROM mascota,consulta where consulta.idMascota=mascota.idMascota AND consulta.idMascota=?;";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, idMascota);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                double prom = rs.getDouble("AVG(pesoPromedio)");
                System.out.println("" + prom);
                consulta = new Consulta();
                consulta.setIdConsulta(rs.getInt("idConsulta"));
                mascota = buscarMascotas(rs.getInt("idMascota"));

                consulta.setPesoPromedio(rs.getDouble("AVG(pesoPromedio)"));

                consulta.setMascota(mascota);
                promedios.add(consulta);

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo generar el promedio de mascotas." + e.getMessage());
        }
        return promedios;
    }
//    public void CobrarConsulta() {
//      
//    }
    //1
/////(incompleto)
    public List<Consulta> promediarPesoDeMascotas() {

        List<Consulta> promedios = new ArrayList<>();
        Consulta consulta;
        Mascota mascota;
        try {
            sql = "SELECT consulta.idMascota, idConsulta, AVG(pesoPromedio) FROM mascota,consulta ORDER BY consulta.idMascota;";

            PreparedStatement ps = con.prepareStatement(sql);


            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                double prom = rs.getDouble("AVG(pesoPromedio)");
                System.out.println("" + prom);
                consulta = new Consulta();
                consulta.setIdConsulta(rs.getInt("idConsulta"));
                mascota = buscarMascotas(rs.getInt("idMascota"));

                consulta.setPesoPromedio(rs.getDouble("AVG(pesoPromedio)"));

                consulta.setMascota(mascota);
                promedios.add(consulta);

            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo generar el promedio de mascotas." + e.getMessage());
        }
        return promedios;
    }

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
//2 ok

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

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente");
        }
        return cliente;
    }
//3 ok

    public void registrarConsulta(Consulta consulta) {
        sql = "INSERT INTO consulta (precio, fechaConsulta, idMascota, idTratamiento, activo, pesoPromedio) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, consulta.getPrecio());
            ps.setDate(2, Date.valueOf(consulta.getFechaConsulta()));
            ps.setInt(3, consulta.getMascota().getIdMascota());
            ps.setInt(4, consulta.getTratamiento().getIdTratamiento());
            ps.setBoolean(5, consulta.isActivo());
            ps.setDouble(6, consulta.getPesoPromedio());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                consulta.setIdConsulta(rs.getInt(1));

                JOptionPane.showMessageDialog(null, " Se registró la consulta.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la consulta.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en la conexíon");
        }

    }
//4

    public void modificarConsulta(int id, Consulta consulta) {

        sql = "UPDATE consulta SET precio=?, fechaConsulta=?, pesoPromedio=?, WHERE activo=1 AND idConsulta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(2, consulta.getPrecio());
            ps.setDate(3, Date.valueOf(consulta.getFechaConsulta()));
//            ps.setInt(3, consulta.getMascota().getIdMascota());
//            ps.setInt(4, consulta.getTratamiento().getIdTratamiento());
            ps.setDouble(4, consulta.getPesoPromedio());

            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();
            JOptionPane.showMessageDialog(null, " Se modificó la consulta.");
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " No se pudo modificar la consulta.");
        }

    }
    //5
    //ok

    public void eliminarConsulta(int idMascota, int idTratamiento) {

        try {

            sql = "UPDATE consulta SET activo=0 WHERE idMascota =? AND idTratamiento = ?";

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
//6 

    public Tratamiento buscarTratamientos(int id) {

        TratamientoData tr = new TratamientoData(conexion);
        return tr.buscarTratamiento(id);
    }
//7 

    public Mascota buscarMascotas(int id) {

        MascotaData md = new MascotaData(conexion);
        return md.buscarMascota(id);

    }
//8 ok (no trae fecha)

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

                tratamiento = buscarTratamientos(rs.getInt("idTratamiento"));
                consulta.setTratamiento(tratamiento);

                mascota = buscarMascotas(rs.getInt("IdMascota"));

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
//9 ok ( ver no muestra fecha)

    public List<Consulta> listarConsultasPorTratamiento(int idTratamiento, String tipoTratamiento) {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consulta;
        Mascota mascota;
        Tratamiento tratamiento;

        if (tipoTratamiento == null);
        {

            try {
                sql = "SELECT * FROM consulta, tratamiento, mascota WHERE consulta.idTratamiento = tratamiento.idTratamiento AND tratamiento.idTratamiento= ? ORDER BY fechaConsulta ASC ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idTratamiento);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    consulta = new Consulta();
                    consulta.setIdConsulta(rs.getInt("idConsulta"));
                    consulta.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate());

                    tratamiento = buscarTratamientos(rs.getInt("idTratamiento"));
                    consulta.setTratamiento(tratamiento);

                    mascota = buscarMascotas(rs.getInt("IdMascota"));

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
                //   sql = "SELECT * FROM consulta, tratamiento, mascota WHERE consulta.idTratamiento = tratamiento.idTratamiento AND tipoTratamiento = ? ORDER BY tipoTratamiento ASC ";
                sql = "SELECT consulta.idConsulta, consulta.fechaConsulta, tratamiento.idTratamiento, tratamiento.tipoTratamiento, consulta.idMascota FROM consulta, tratamiento  WHERE consulta.idTratamiento = tratamiento.idTratamiento AND tipoTratamiento = ? ORDER BY fechaConsulta ASC ";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, tipoTratamiento);
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    consulta = new Consulta();
                    consulta.setIdConsulta(rs.getInt("idConsulta"));
//                     consulta.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate()); 

                    tratamiento = buscarTratamientos(rs.getInt("idTratamiento"));
                    consulta.setTratamiento(tratamiento);

                    mascota = buscarMascotas(rs.getInt("IdMascota"));

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
//10 

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
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " No se pudo obtener el listado de tratamientos");

        }

        return tratamientos;

    }
//11 ok ver (no trae fecha)

    public List<Consulta> listarConsultasActivas() {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consul;
        Mascota mascota;
        Tratamiento tratamiento;

        sql = "SELECT * FROM consulta WHERE activo=1 ORDER BY fechaConsulta ASC;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                consul = new Consulta();

                consul.setIdConsulta(rs.getInt("idConsulta"));
                consul.setPrecio(rs.getDouble("precio"));
                //consul.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate());

                consul.setPesoPromedio(rs.getDouble("pesoPromedio"));
                consul.setActivo(rs.getBoolean("activo"));
                tratamiento = buscarTratamientos(rs.getInt("idTratamiento"));
                consul.setTratamiento(tratamiento);

                mascota = buscarMascotas(rs.getInt("IdMascota"));

                consul.setMascota(mascota);
                consul.setTratamiento(tratamiento);

                consultas.add(consul);

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " No se pudo obtener el listado de consultas activas");

        }

        return consultas;

    }
//12 okk (no trae fecha)

    public List<Consulta> listarConsultasInactivas() {
        List<Consulta> consultas = new ArrayList<>();
        Consulta consul;
        Mascota mascota;
        Tratamiento tratamiento;

        sql = "SELECT * FROM consulta WHERE activo=0 ORDER BY fechaConsulta ASC;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                consul = new Consulta();
                consul.setIdConsulta(rs.getInt("idConsulta"));
                consul.setPrecio(rs.getDouble("precio"));
                //consul.setFechaConsulta(rs.getDate("fechaConsulta").toLocalDate());

                consul.setPesoPromedio(rs.getDouble("pesoPromedio"));
                consul.setActivo(rs.getBoolean("activo"));
                tratamiento = buscarTratamientos(rs.getInt("idTratamiento"));
                consul.setTratamiento(tratamiento);

                mascota = buscarMascotas(rs.getInt("IdMascota"));

                consul.setMascota(mascota);
                consul.setTratamiento(tratamiento);

                consultas.add(consul);

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " No se pudo obtener el listado de consultas Inactivas");

        }

        return consultas;

    }
}
