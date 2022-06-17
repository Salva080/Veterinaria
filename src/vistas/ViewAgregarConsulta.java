/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ClienteData;
import controlador.ConsultaData;
import controlador.MascotaData;
import controlador.TratamientoData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Consulta;
import modelo.Mascota;
import modelo.Tratamiento;

/**
 *
 * @author NEXO-MAX
 */
public class ViewAgregarConsulta extends javax.swing.JInternalFrame {

    private ArrayList<Tratamiento> tratamientos;
    private TratamientoData tData;
    private ArrayList<Consulta> consultas;
    private ConsultaData cData;
    private ArrayList<Mascota> mascotas;
    private MascotaData mData;
    private ArrayList<Cliente> clientes;
    private ClienteData clienteData;
    private Conexion conexion;
    private DefaultTableModel modelo;

    public ViewAgregarConsulta() {
        initComponents();
        conexion = new Conexion();
        cData = new ConsultaData(conexion);

        tData = new TratamientoData(conexion);
        tratamientos = (ArrayList<Tratamiento>) tData.listarTratamientosActivos();

        mData = new MascotaData(conexion);
        mascotas = (ArrayList<Mascota>) mData.listarMascotasActivas();
        modelo = new DefaultTableModel();

        cargarTratamiento();
        cargarMascota();
        armaCabeceraTabla();
        consultas = (ArrayList<Consulta>) cData.listarConsultasActivas();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        cbMascota = new javax.swing.JComboBox<>();
        cbTratamiento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tConsulta = new javax.swing.JTable();
        tPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chActivo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSalir = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tPeso = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tFecha = new com.toedter.calendar.JDateChooser();
        btnLimpiar = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        tId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        jLabel7.setText("CONSULTAS");

        popupMenu1.setLabel("popupMenu1");

        setBorder(null);
        getContentPane().setLayout(null);

        getContentPane().add(cbMascota);
        cbMascota.setBounds(160, 190, 160, 20);

        getContentPane().add(cbTratamiento);
        cbTratamiento.setBounds(160, 260, 160, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MASCOTA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 190, 90, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TRATAMIENTOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 260, 96, 15);

        btnGuardar.setText("GUARDAR");
        btnGuardar.setEnabled(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(140, 320, 90, 30);

        tConsulta.setBackground(new java.awt.Color(204, 255, 204));
        tConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tConsulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "FECHA", "MASCOTA", "TRATAMIENTO", "PESO CONSULTA", "PRECIO"
            }
        ));
        jScrollPane3.setViewportView(tConsulta);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 380, 690, 90);

        tPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tPrecioFocusLost(evt);
            }
        });
        tPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrecioActionPerformed(evt);
            }
        });
        tPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(tPrecio);
        tPrecio.setBounds(440, 260, 81, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PRECIO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 260, 76, 23);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel6.setText("Agregar consulta");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 20, 190, 29);

        chActivo.setSelected(true);
        getContentPane().add(chActivo);
        chActivo.setBounds(650, 260, 30, 21);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("ACTIVO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 260, 50, 14);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 130, 260, 10);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(530, 320, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("FECHA");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 130, 50, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("PESO");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(380, 190, 40, 23);

        tPeso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tPesoFocusLost(evt);
            }
        });
        tPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tPesoKeyTyped(evt);
            }
        });
        getContentPane().add(tPeso);
        tPeso.setBounds(440, 190, 81, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(60, 300, 650, 20);

        tFecha.setBackground(new java.awt.Color(153, 204, 255));
        tFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tFechaFocusLost(evt);
            }
        });
        tFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFechaMouseClicked(evt);
            }
        });
        getContentPane().add(tFecha);
        tFecha.setBounds(120, 140, 110, 20);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(400, 320, 90, 30);

        btnNueva.setText("NUEVA");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });
        getContentPane().add(btnNueva);
        btnNueva.setBounds(320, 40, 90, 30);

        btnModificar.setText("MODIFICAR");
        getContentPane().add(btnModificar);
        btnModificar.setBounds(270, 320, 91, 30);

        tId.setEnabled(false);
        getContentPane().add(tId);
        tId.setBounds(110, 90, 80, 20);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(320, 90, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 80, 40, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPesoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean coma = key == 44;
        boolean punto = key == 46;
        if (!(numeros || coma || punto)) {
//            JOptionPane.showMessageDialog(this, "Ingrese un peso válido");
            evt.consume();
        }
    }//GEN-LAST:event_tPesoKeyTyped

    private void tFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFechaMouseClicked
        // TODO add your handling code here:
        if (tFecha.isDisplayable() && tFecha.getAutoscrolls()) {

            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_tFechaMouseClicked

    private void tFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFechaFocusLost
        // TODO add your handling code here:
        if (null == tFecha.getDate()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            tFecha.requestFocus();
            btnGuardar.setEnabled(false);
        } else {
            btnGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_tFechaFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if(controlar()) {
           registrar();
       }else{
          desactivarCampos();
       }

//        double precio = Double.parseDouble(tPrecio.getText());
//
//        Date fech = tFecha.getDate();
//        LocalDate fechaNac = fech.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        Mascota seleccionada = (Mascota) cbMascota.getSelectedItem();
//
//        Tratamiento seleccionado = (Tratamiento) cbTratamiento.getSelectedItem();
//
//        boolean estado = chActivo.isSelected();
//
//        double PesoC = Double.parseDouble(tPeso.getText());
//
//        Consulta consul = new Consulta(precio, fechaNac, seleccionada, seleccionado, estado, PesoC);
//   
//        if( chActivo.isSelected()&& !tPrecio.getText().isEmpty()&& tFecha.getDate() !=null && !tPeso.getText().isEmpty() ){
//        cData.registrarConsulta(consul);
//        }
//        else{
//           
//            JOptionPane.showMessageDialog(this, " Esta agregando una consulta con estado inactivo");//
//            chActivo.isFocusPainted();//
//        
//          }  chActivo.setSelected(true);//
//        
//        modelo.addRow(new Object[]{consul.getIdConsulta(), consul.getFechaConsulta(), consul.getMascota().getAlias(), consul.getTratamiento().getTipoTratamiento(), consul.getPesoConsulta(), consul.getPrecio()});

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        tPrecio.setText("");
        tPeso.setText("");
        tFecha.setDate(null);
       
        btnGuardar.setEnabled(false);


    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPrecioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean coma = key == 44;
        boolean punto = key == 46;
        if (!(numeros || coma || punto)) {
//            JOptionPane.showMessageDialog(this, "Ingrese un peso válido");
            evt.consume();
        }
    }//GEN-LAST:event_tPrecioKeyTyped

    private void tPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrecioActionPerformed
       
    }//GEN-LAST:event_tPrecioActionPerformed

    private void tPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPrecioFocusLost
        // TODO add your handling code here:
         if (tFecha.getDate() != null) {

            if (!tPeso.getText().isEmpty()) { //

                if (!tPrecio.getText().isEmpty()) {

                    
                        btnGuardar.setEnabled(true);
                        
                        
                    }else {
              JOptionPane.showMessageDialog(this, "No puede dejar campos vacíos ");
            tPrecio.requestFocus();
            
                }
            }
             
             
         }
        
        
        
    }//GEN-LAST:event_tPrecioFocusLost

    private void tPesoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPesoFocusLost
        if(tPeso.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "El campo peso debe estar completo");
            tPeso.requestFocus();
            
        }
    }//GEN-LAST:event_tPesoFocusLost

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        // TODO add your handling code here:
        
       if(controlar()) {
           registrar();
       }else{
           
       }
        
        
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
     btnBuscar.setEnabled(false);
     tId.setEnabled(false);
     btnModificar.setEnabled(false);
     activarCampos();
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (tId.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Debe ingrear un ID"); 
       }
        
        
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cargarTratamiento() {

        for (Tratamiento item : tratamientos) {

            cbTratamiento.addItem(item);

        }

    }

    private void cargarMascota() {

        for (Mascota item : mascotas) {

            cbMascota.addItem(item);

        }

    }

    private void armaCabeceraTabla() {

        //Titulos de Columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Fecha");
        columnas.add("Mascota");
        columnas.add("Tratamiento");
        columnas.add("Peso Consulta");
        columnas.add("Precio");

        for (Object it : columnas) {

            modelo.addColumn(it);
        }
        tConsulta.setModel(modelo);
    }

    private void borraFilasTabla() {

        int a = modelo.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }
    private boolean controlar(){
        boolean control=true;
          if (tFecha.getDate() == null) {

            if (tPeso.getText().isEmpty()) { //

                if (tPrecio.getText().isEmpty()) {

                   JOptionPane.showMessageDialog(this, "Todos los campos deben estar completos");
                }
            }
         } return control;
    }
    
    private void registrar(){
        double precio = Double.parseDouble(tPrecio.getText());

        Date fech = tFecha.getDate();
        LocalDate fechaNac = fech.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Mascota seleccionada = (Mascota) cbMascota.getSelectedItem();

        Tratamiento seleccionado = (Tratamiento) cbTratamiento.getSelectedItem();

        boolean estado = chActivo.isSelected();

        double PesoC = Double.parseDouble(tPeso.getText());

        Consulta consul = new Consulta(precio, fechaNac, seleccionada, seleccionado, estado, PesoC);
   
        if( chActivo.isSelected()&& !tPrecio.getText().isEmpty()&& tFecha.getDate() !=null && !tPeso.getText().isEmpty() ){
        cData.registrarConsulta(consul);
        }
        else{
           
            JOptionPane.showMessageDialog(this, " Esta agregando una consulta con estado inactivo");//
            chActivo.isFocusPainted();//
        
          }  chActivo.setSelected(true);//
        
        modelo.addRow(new Object[]{consul.getIdConsulta(), consul.getFechaConsulta(), consul.getMascota().getAlias(), consul.getTratamiento().getTipoTratamiento(), consul.getPesoConsulta(), consul.getPrecio()});
    }
    
   private void desactivarCampos(){
       tPrecio.setEnabled(false);
        tFecha.setEnabled(false);
        cbMascota.setEnabled(false);
        cbTratamiento.setEnabled(false);
        chActivo.setEnabled(false);
        tPeso.setEnabled(false);
   }
   private void activarCampos(){
       tPrecio.setEnabled(true);
        tFecha.setEnabled(true);
        cbMascota.setEnabled(true);
        cbTratamiento.setEnabled(true);
        chActivo.setEnabled(true);
        tPeso.setEnabled(true);
   }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Mascota> cbMascota;
    private javax.swing.JComboBox<Tratamiento> cbTratamiento;
    private javax.swing.JCheckBox chActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTable tConsulta;
    private com.toedter.calendar.JDateChooser tFecha;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tPeso;
    private javax.swing.JTextField tPrecio;
    // End of variables declaration//GEN-END:variables
}
