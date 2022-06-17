/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ClienteData;
import controlador.MascotaData;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Conexion;
import modelo.Mascota;

/**
 *
 * @author NEXO-MAX
 */
public class ViewMascotas extends javax.swing.JInternalFrame {
    private ArrayList<Cliente> listaClientes;
    private MascotaData md;
    private Conexion con;
    private ClienteData cli;
    /**
     * Creates new form ViewMascotas
     */
    public ViewMascotas() {
        initComponents();
        con = new Conexion();
        md = new MascotaData(con);
        cli = new ClienteData(con);
        listaClientes = (ArrayList<Cliente>) cli.listarClienteActivos();
        
        cargarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbCliente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jtfSexo = new javax.swing.JTextField();
        jtfEspecie = new javax.swing.JTextField();
        jtfRaza = new javax.swing.JTextField();
        jtfPesomascota = new javax.swing.JTextField();
        jtfPesoactual = new javax.swing.JTextField();
        jtfAlias = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JCheckBox();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jtfIDmascota = new javax.swing.JTextField();
        jbBuscarMascota = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbLimpíar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jtfColorpelaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setResizable(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 153, 204));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Mascotas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 130, 50));

        jcbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 260, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel4.setText("Peso actual de la mascota:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, 30));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel5.setText("Cliente:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 30));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel7.setText("Peso de mascota:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, 30));

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, 30));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel9.setText("Especie:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, 30));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel10.setText("Sexo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, 30));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel11.setText("Color de pelaje:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, 30));

        jLabel12.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel12.setText("Alias:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel13.setText("Mascota:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 570, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 172, 570, 10));

        jtfSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfSexoFocusLost(evt);
            }
        });
        jtfSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSexoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 130, -1));

        jtfEspecie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfEspecieFocusLost(evt);
            }
        });
        jtfEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEspecieKeyTyped(evt);
            }
        });
        jPanel1.add(jtfEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 250, -1));

        jtfRaza.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfRazaFocusLost(evt);
            }
        });
        jtfRaza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRazaKeyTyped(evt);
            }
        });
        jPanel1.add(jtfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 160, -1));

        jtfPesomascota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPesomascotaFocusLost(evt);
            }
        });
        jtfPesomascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesomascotaKeyTyped(evt);
            }
        });
        jPanel1.add(jtfPesomascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 80, -1));

        jtfPesoactual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfPesoactualFocusLost(evt);
            }
        });
        jtfPesoactual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPesoactualKeyTyped(evt);
            }
        });
        jPanel1.add(jtfPesoactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 90, -1));

        jtfAlias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfAliasFocusLost(evt);
            }
        });
        jtfAlias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAliasKeyTyped(evt);
            }
        });
        jPanel1.add(jtfAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 200, -1));

        jcbEstado.setText("ESTADO");
        jcbEstado.setEnabled(false);
        jPanel1.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, -1, -1));

        jdcFechaNac.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jdcFechaNacFocusLost(evt);
            }
        });
        jPanel1.add(jdcFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));
        jPanel1.add(jtfIDmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 80, -1));

        jbBuscarMascota.setText("Buscar");
        jbBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMascotaActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscarMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, 40));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, -1, -1));

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 77, -1));

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, -1, -1));

        jbLimpíar.setText("Limpiar");
        jbLimpíar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpíarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpíar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, -1, -1));

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, -1, -1));

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 640, -1, -1));

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel14.setText("Raza:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, 30));

        jtfColorpelaje.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfColorpelajeFocusLost(evt);
            }
        });
        jtfColorpelaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfColorpelajeKeyTyped(evt);
            }
        });
        jPanel1.add(jtfColorpelaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -50, -1, 730));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMascotaActionPerformed
        // TODO add your handling code here:
        
        Mascota m = md.buscarMascota(Integer.parseInt(jtfIDmascota.getText()));
        if(m != null){
        Cliente c = m.getCliente();
//            System.out.println(c);
        jcbCliente.setSelectedItem(c);
//        double pesoMascota = Double.parseDouble(jtfPesomascota.getText());
//        double pesoActual = Double.parseDouble(jtfPesoactual.getText());        
        int id = Integer.parseInt(jtfIDmascota.getText());
        
        if(jtfIDmascota.getText() != null && md.mascotaExiste(id)){
//            jcbCliente.setSelectedItem(m.getCliente());
            jtfAlias.setText(m.getAlias());
            jtfSexo.setText(m.getSexo());
            jtfEspecie.setText(m.getEspecie());
            jtfRaza.setText(m.getRaza());
            jtfColorpelaje.setText(m.getColorPelaje());
            jtfPesomascota.setText(m.getPesoMascota()+"");
            jtfPesoactual.setText(m.getPesoActual()+"");
            LocalDate lc = m.getFechaNac();
            Date date = Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdcFechaNac.setDate(date);
            jcbEstado.setSelected(m.isActivo());
            
            jbGuardar.setEnabled(false);
            jtfAlias.setEnabled(true);
            jtfSexo.setEnabled(true);
            jtfEspecie.setEnabled(true);
            jtfRaza.setEnabled(true);
            jtfColorpelaje.setEnabled(true);
            jtfPesomascota.setEnabled(true);
            jtfPesoactual.setEnabled(true);
            jdcFechaNac.setEnabled(true);
            jbBorrar.setEnabled(true);
            jbModificar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this, "Mascota no existente");
            jcbEstado.setEnabled(false);
            jtfAlias.setEnabled(false);
            jtfSexo.setEnabled(false);
            jtfEspecie.setEnabled(false);
            jtfRaza.setEnabled(false);
            jtfColorpelaje.setEnabled(false);
            jtfPesomascota.setEnabled(false);
            jtfPesoactual.setEnabled(false);
            jdcFechaNac.setEnabled(false);
            jbBorrar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbModificar.setEnabled(false);
        }
        if(jcbEstado.isSelected()){
            jbBorrar.setEnabled(true);
            jbModificar.setEnabled(true);
        }else{
            jbBorrar.setEnabled(false);
            jbModificar.setEnabled(false);
        }
        }else{
            JOptionPane.showMessageDialog(this, "Mascota no existente");
            jcbEstado.setEnabled(false);
            jtfAlias.setEnabled(false);
            jtfSexo.setEnabled(false);
            jtfEspecie.setEnabled(false);
            jtfRaza.setEnabled(false);
            jtfColorpelaje.setEnabled(false);
            jtfPesomascota.setEnabled(false);
            jtfPesoactual.setEnabled(false);
            jdcFechaNac.setEnabled(false);
            jbBorrar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jbBuscarMascotaActionPerformed

    private void jcbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbClienteActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        String alias = jtfAlias.getText();
        String sexo = jtfSexo.getText();
        String especie = jtfEspecie.getText();
        String raza = jtfRaza.getText();
        String colorPelaje = jtfColorpelaje.getText();
        double pesoMascota = Double.parseDouble(jtfPesomascota.getText());
        boolean estado = jcbEstado.isEnabled();
        Cliente c = (Cliente) jcbCliente.getSelectedItem();
        Date fecha = jdcFechaNac.getDate();
        LocalDate fechaNac = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
        double pesoActual = Double.parseDouble(jtfPesoactual.getText()); 
        
        Mascota m = new Mascota(alias, sexo, especie, raza, colorPelaje,fechaNac, pesoMascota, estado, c,pesoActual);
        
        if(jcbEstado.isSelected()){
        md.agregarMascota(m);
        jtfIDmascota.setText(m.getIdMascota()+ "");
        }else{
            JOptionPane.showMessageDialog(this, "Debe agregar una mascota con estado activo");
            jcbEstado.isFocusPainted();
        }
        jcbEstado.setSelected(true);
        desactivarOtros();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLimpíarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpíarActionPerformed
        // TODO add your handling code here:
        limpiar();
        activarID();
        jbBuscarMascota.setEnabled(true);
    }//GEN-LAST:event_jbLimpíarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(jtfIDmascota.getText());
        
        if(jtfIDmascota.getText() != null){
            md.eliminarMascota(id);
            jbGuardar.setEnabled(false);
            jbModificar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar una mascota");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        if(jtfIDmascota.getText() != null){
            int id = Integer.parseInt(jtfIDmascota.getText());
            String alias = jtfAlias.getText();
            String sexo = jtfSexo.getText();
            String especie = jtfEspecie.getText();
            String raza = jtfRaza.getText();
            String colorPelaje = jtfColorpelaje.getText();
            double pesoMascota = Double.parseDouble(jtfPesomascota.getText());
            boolean estado = jcbEstado.isEnabled();
            Cliente c = (Cliente) jcbCliente.getSelectedItem();
            Date fecha = jdcFechaNac.getDate();
            LocalDate fechaNac = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
            double pesoActual = Double.parseDouble(jtfPesoactual.getText()); 
            
            jcbEstado.setEnabled(false);
            jcbEstado.setSelected(true);
            Mascota m = new Mascota(alias, sexo, especie, raza, colorPelaje,fechaNac, pesoMascota, estado, c,pesoActual);
            md.modificarMascota(id, m);
            jbGuardar.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(this, "La mascota no se encuentra activa");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        activarOtros();
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtfAliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAliasKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El Alias de su mascota no debe ser numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfAliasKeyTyped

    private void jtfSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSexoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El sexo de su mascota no debe ser numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfSexoKeyTyped

    private void jtfEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEspecieKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "La especie de su mascota no debe ser un dato numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfEspecieKeyTyped

    private void jtfRazaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRazaKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "La raza de su mascota no debe ser un dato numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfRazaKeyTyped

    private void jtfColorpelajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfColorpelajeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El color de pelaje de su mascota no debe ser un dato numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfColorpelajeKeyTyped

    private void jtfPesomascotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesomascotaKeyTyped
        // TODO add your handling code here:
        double key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "El peso de la mascota debe ser numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfPesomascotaKeyTyped

    private void jtfPesoactualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesoactualKeyTyped
        // TODO add your handling code here:
        double key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "El peso actual de la mascota debe ser numerico!");
            evt.consume();
        }
    }//GEN-LAST:event_jtfPesoactualKeyTyped

    private void jdcFechaNacFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jdcFechaNacFocusLost
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(new Date());
        if ((!jtfIDmascota.getText().isEmpty())) {

            jbGuardar.setEnabled(true);

        } else {
            jbGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_jdcFechaNacFocusLost

    private void jtfAliasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfAliasFocusLost
        // TODO add your handling code here:
        if (jtfAlias.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfAlias.requestFocus();
        }
    }//GEN-LAST:event_jtfAliasFocusLost

    private void jtfSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfSexoFocusLost
        // TODO add your handling code here:
        if (jtfSexo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfSexo.requestFocus();
        }
    }//GEN-LAST:event_jtfSexoFocusLost

    private void jtfEspecieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfEspecieFocusLost
        // TODO add your handling code here:
        if (jtfEspecie.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfEspecie.requestFocus();
        }
    }//GEN-LAST:event_jtfEspecieFocusLost

    private void jtfRazaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRazaFocusLost
        // TODO add your handling code here:
        if (jtfRaza.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfRaza.requestFocus();
        }
    }//GEN-LAST:event_jtfRazaFocusLost

    private void jtfColorpelajeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfColorpelajeFocusLost
        // TODO add your handling code here:
        if (jtfColorpelaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfColorpelaje.requestFocus();
        }
    }//GEN-LAST:event_jtfColorpelajeFocusLost

    private void jtfPesomascotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesomascotaFocusLost
        // TODO add your handling code here:
        if (jtfPesomascota.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfPesomascota.requestFocus();
        }
    }//GEN-LAST:event_jtfPesomascotaFocusLost

    private void jtfPesoactualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfPesoactualFocusLost
        // TODO add your handling code here:
        if (jtfPesoactual.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            jtfPesoactual.requestFocus();
        }
    }//GEN-LAST:event_jtfPesoactualFocusLost

    private void cargarClientes(){
        for(Cliente item:listaClientes){
            jcbCliente.addItem(item);
        }
    }
    
    
    private void limpiar(){
        jtfIDmascota.setText("");
        jtfAlias.setText("");
        jtfSexo.setText("");
        jtfEspecie.setText("");
        jtfRaza.setText("");
        jtfColorpelaje.setText("");
        jtfPesomascota.setText("");
        jtfPesoactual.setText("");
        jcbEstado.setSelected(false);
        jdcFechaNac.setDate(null);
        desactivarOtros();
        desactivarID();
        botonesDesactivados();
    }
    
    private void activarOtros(){
            jtfIDmascota.setEnabled(true);
            jcbEstado.setEnabled(true);
            jtfAlias.setEnabled(true);
            jtfSexo.setEnabled(true);
            jtfEspecie.setEnabled(true);
            jtfRaza.setEnabled(true);
            jtfColorpelaje.setEnabled(true);
            jtfPesomascota.setEnabled(true);
            jtfPesoactual.setEnabled(true);
            jdcFechaNac.setEnabled(true);
            jbGuardar.setEnabled(true);
    }
    
    private void desactivarOtros(){
            jcbEstado.setEnabled(false);
            jtfAlias.setEnabled(false);
            jtfSexo.setEnabled(false);
            jtfEspecie.setEnabled(false);
            jtfRaza.setEnabled(false);
            jtfColorpelaje.setEnabled(false);
            jtfPesomascota.setEnabled(false);
            jtfPesoactual.setEnabled(false);
            jdcFechaNac.setEnabled(false);
            jbGuardar.setEnabled(false);
    }
    
    private void activarID(){
        jtfIDmascota.setEnabled(true);
    }
    
    private void desactivarID(){
        jtfIDmascota.setEnabled(false);
    }
    
    private void botonesDesactivados() {
        jbGuardar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbBuscarMascota.setEnabled(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarMascota;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpíar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcbCliente;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JTextField jtfAlias;
    private javax.swing.JTextField jtfColorpelaje;
    private javax.swing.JTextField jtfEspecie;
    private javax.swing.JTextField jtfIDmascota;
    private javax.swing.JTextField jtfPesoactual;
    private javax.swing.JTextField jtfPesomascota;
    private javax.swing.JTextField jtfRaza;
    private javax.swing.JTextField jtfSexo;
    // End of variables declaration//GEN-END:variables
}
