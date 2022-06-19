/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ClienteData;
import controlador.ConsultaData;
import controlador.MascotaData;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Consulta;
import modelo.Mascota;

/**
 *
 * @author NEXO-MAX
 */
public class ViewClientePorMascotas extends javax.swing.JInternalFrame {

    private ClienteData clienteData;
    private ConsultaData consultaData;
    private MascotaData mascotaData;
    private Conexion conexion;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Mascota> listaMascotas;
    private DefaultTableModel modelo;

    /**
     * Creates new form ViewListarClientesPorMascotas
     */
    public ViewClientePorMascotas() {
        initComponents();
        initComponents();
        this.setSize(900, 700);
        conexion = new Conexion();

        mascotaData = new MascotaData(conexion);
        listaMascotas = (ArrayList<Mascota>) mascotaData.listarMascotasActivas();
        cargaMascotas();
        clienteData = new ClienteData(conexion);
        listaClientes = (ArrayList<Cliente>) clienteData.listarClienteActivos();

        modelo = new DefaultTableModel();
        armaCabeceraTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tClientes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        cBuscar3 = new javax.swing.JButton();
        cMascotas = new javax.swing.JComboBox<>();
        cSalir = new javax.swing.JButton();
        cBuscar2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btAlta = new javax.swing.JButton();
        cBuscar1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tClientes.setBackground(new java.awt.Color(255, 255, 255));
        tClientes.setForeground(new java.awt.Color(0, 0, 0));
        tClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre", "Direccion", "Telefono", "Contacto", "Activo"
            }
        ));
        jScrollPane1.setViewportView(tClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 760, 150));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 690, 10));

        jLabel16.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("¿No encuentras la mascota?");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        cBuscar3.setBackground(new java.awt.Color(255, 255, 255));
        cBuscar3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cBuscar3.setForeground(new java.awt.Color(0, 0, 0));
        cBuscar3.setText("Buscar");
        cBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscar3ActionPerformed(evt);
            }
        });
        getContentPane().add(cBuscar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 90, 30));

        cMascotas.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 140, -1));

        cSalir.setBackground(new java.awt.Color(255, 255, 255));
        cSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cSalir.setForeground(new java.awt.Color(0, 0, 0));
        cSalir.setText("Salir");
        cSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 120, 30));

        cBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        cBuscar2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cBuscar2.setForeground(new java.awt.Color(0, 0, 0));
        cBuscar2.setText("Agregar");
        cBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(cBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 90, 30));

        jLabel15.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("¿No encuentras el cliente?");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        btAlta.setBackground(new java.awt.Color(255, 255, 255));
        btAlta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btAlta.setForeground(new java.awt.Color(0, 0, 0));
        btAlta.setText("Dar de Alta");
        btAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltaActionPerformed(evt);
            }
        });
        getContentPane().add(btAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 120, 30));

        cBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        cBuscar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cBuscar1.setForeground(new java.awt.Color(0, 0, 0));
        cBuscar1.setText("Agregar");
        cBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(cBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 90, 30));

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Mascotas:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("por mascotas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Lista de clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscar1ActionPerformed
        ViewCliente vc = new ViewCliente();
        ViewVeterinaria.escritorio.add(vc);
        vc.toFront();
        vc.setVisible(true);
    }//GEN-LAST:event_cBuscar1ActionPerformed

    private void cBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBuscar2ActionPerformed

    private void cSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cSalirActionPerformed

    private void btAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltaActionPerformed

    }//GEN-LAST:event_btAltaActionPerformed

    private void cBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscar3ActionPerformed
        cargaDatosMascotas();
    }//GEN-LAST:event_cBuscar3ActionPerformed
    private void armaCabeceraTabla() {

        //Titulos de Columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("DNI");
        columnas.add("Apellido");
        columnas.add("Nombre");
        columnas.add("Direccion");
        columnas.add("Telefono");
        columnas.add("Contacto");
        columnas.add("Activo");
        for (Object it : columnas) {

            modelo.addColumn(it);
        }
        tClientes.setModel(modelo);
    }

    private void borraFilasTabla() {

        int a = modelo.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }

    private void cargaMascotas() {
        //Carga las mascotas al ComboBox
        for (Mascota item : listaMascotas) {
            cMascotas.addItem(item);
        }
    }

    private void cargaDatosMascotas() {

        borraFilasTabla();
        //Llenar filas con las materias en las que esta incripto un alumno

        Mascota seleccionado = (Mascota) cMascotas.getSelectedItem();

        Cliente client = consultaData.buscarClientePorMascota(seleccionado.getIdMascota());
        
        modelo.addRow(new Object[]{client.getIdCliente(),client.getDni(), client.getApellido(), client.getNombre(), client.getDireccion(),client.getTelefono(), client.getContactoAlternativo(),client.isActivo()});

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlta;
    private javax.swing.JButton cBuscar1;
    private javax.swing.JButton cBuscar2;
    private javax.swing.JButton cBuscar3;
    private javax.swing.JComboBox<Mascota> cMascotas;
    private javax.swing.JButton cSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tClientes;
    // End of variables declaration//GEN-END:variables
}
