/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.TratamientoData;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.TablaModelo;
import modelo.Tratamiento;

/**
 *
 * @author Caro_Z
 */
public class ViewGestionTratamientos extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion();
    private DefaultTableModel modelo;
    private ArrayList<Tratamiento> lista;
    private TratamientoData tData;

    public ViewGestionTratamientos() {
        initComponents();
        try {
            conexion = new Conexion();
            tData = new TratamientoData(conexion);
            modelo = new DefaultTableModel();

            cargarTabla(0, null);

        } catch (Exception e) {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbactivos = new javax.swing.ButtonGroup();
        rbActivo = new javax.swing.JRadioButton();
        rbNoActivo = new javax.swing.JRadioButton();
        btnAlta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbActivo = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txttipot = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tadescripciont = new javax.swing.JTextArea();
        btngc = new javax.swing.JButton();
        txtmedicamentot = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btneliminart = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttratamientos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txttipotfiltro = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cActualizar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        rbactivos.add(rbActivo);
        rbActivo.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        rbActivo.setText("ACTIVOS");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });
        getContentPane().add(rbActivo);
        rbActivo.setBounds(114, 207, 79, 23);

        rbactivos.add(rbNoActivo);
        rbNoActivo.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        rbNoActivo.setText("NO ACTIVOS");
        rbNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActivoActionPerformed(evt);
            }
        });
        getContentPane().add(rbNoActivo);
        rbNoActivo.setBounds(211, 207, 99, 23);

        btnAlta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnAlta.setText("Dar de Alta");
        btnAlta.setEnabled(false);
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlta);
        btnAlta.setBounds(129, 514, 111, 25);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Gestionar");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(177, 0, 168, 48);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 386, 610, 10);

        cbActivo.setBackground(new java.awt.Color(255, 255, 255));
        cbActivo.setEnabled(false);
        cbActivo.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                cbActivoComponentAdded(evt);
            }
        });
        cbActivo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbActivoFocusLost(evt);
            }
        });
        cbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActivoActionPerformed(evt);
            }
        });
        jPanel1.add(cbActivo);
        cbActivo.setBounds(91, 345, 21, 21);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel7.setText("Activo:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(6, 346, 58, 23);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel10.setText("Precio:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(6, 297, 63, 23);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel9.setText("Medicamento:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(6, 256, 122, 23);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel6.setText("Descripción:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(6, 160, 100, 23);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel8.setText("Id:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(15, 82, 22, 23);

        txttipot.setEnabled(false);
        txttipot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttipotFocusLost(evt);
            }
        });
        jPanel1.add(txttipot);
        txttipot.setBounds(116, 118, 266, 20);

        tadescripciont.setColumns(20);
        tadescripciont.setRows(5);
        tadescripciont.setEnabled(false);
        tadescripciont.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tadescripciontFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(tadescripciont);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(124, 160, 252, 80);

        btngc.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btngc.setText("Guardar");
        btngc.setEnabled(false);
        btngc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngcActionPerformed(evt);
            }
        });
        jPanel1.add(btngc);
        btngc.setBounds(6, 402, 77, 25);

        txtmedicamentot.setEnabled(false);
        txtmedicamentot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmedicamentotFocusLost(evt);
            }
        });
        jPanel1.add(txtmedicamentot);
        txtmedicamentot.setBounds(134, 256, 250, 20);

        txtprecio.setEnabled(false);
        txtprecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtprecioFocusLost(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtprecio);
        txtprecio.setBounds(75, 297, 217, 20);

        btnModificar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);
        btnModificar.setBounds(107, 402, 83, 25);

        btnLimpiar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(206, 402, 84, 25);

        btnIngresar.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(6, 0, 89, 23);

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel11.setText("Tipo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(6, 118, 42, 23);

        tId.setEnabled(false);
        tId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tIdActionPerformed(evt);
            }
        });
        jPanel1.add(tId);
        tId.setBounds(116, 82, 84, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(6, 54, 360, 10);

        btneliminart.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btneliminart.setText("Salir");
        btneliminart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminartActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminart);
        btneliminart.setBounds(308, 402, 70, 25);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 410, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(461, 103, 401, 460);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Listado de tratamientos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 132, 373, 48);

        rbactivos.add(rbTodos);
        rbTodos.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        rbTodos.setSelected(true);
        rbTodos.setText("TODOS");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });
        getContentPane().add(rbTodos);
        rbTodos.setBounds(29, 207, 67, 23);

        ttratamientos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        ttratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Descripcion", "Medicamento", "Precio", "Activo"
            }
        ));
        ttratamientos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttratamientosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttratamientos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 411, 198);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Buscar por tipo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(29, 254, 84, 16);

        txttipotfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttipotfiltroKeyReleased(evt);
            }
        });
        getContentPane().add(txttipotfiltro);
        txttipotfiltro.setBounds(158, 252, 263, 20);

        btnConsultar.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(318, 103, 103, 23);

        btnBaja.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnBaja.setText("Dar de Baja");
        btnBaja.setEnabled(false);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBaja);
        btnBaja.setBounds(269, 514, 93, 25);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3 tortu.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 650);

        cActualizar.setBackground(new java.awt.Color(255, 255, 255));
        cActualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos (3).png"))); // NOI18N
        cActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(cActualizar);
        cActualizar.setBounds(570, 460, 70, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
        rbNoActivo.setSelected(false);
        rbTodos.setSelected(false);
        btnAlta.setEnabled(false);
        btnBaja.setEnabled(true);

        cargarTabla(2, null);
    }//GEN-LAST:event_rbActivoActionPerformed

    private void rbNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActivoActionPerformed
        rbActivo.setSelected(false);
        rbTodos.setSelected(false);
        btnAlta.setEnabled(true);
        btnBaja.setEnabled(false);
        cargarTabla(1, null);

    }//GEN-LAST:event_rbNoActivoActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        int filaSeleccionada = ttratamientos.getSelectedRow();

        if (filaSeleccionada != -1) {

            int idTratamiento = (Integer) ttratamientos.getValueAt(filaSeleccionada, 0);

            tData.activarTratamiento(idTratamiento);

            String activo = ttratamientos.getValueAt(filaSeleccionada, 5).toString();
            cargarTabla(2, null);

        } else {
            JOptionPane.showMessageDialog(this, " Debe seleccionar un tratamiento");

        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void cbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActivoActionPerformed
        if (cbActivo.isSelected()) {
            btnModificar.setEnabled(true);
        }
    }//GEN-LAST:event_cbActivoActionPerformed

    private void btngcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngcActionPerformed
        guardar();
        cargarTabla(0, null);
        limpiarCampos();
    }//GEN-LAST:event_btngcActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        cargarTabla(0, null);
    }//GEN-LAST:event_rbTodosActionPerformed

    private void txttipotfiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttipotfiltroKeyReleased
        filtroTipo();////
    }//GEN-LAST:event_txttipotfiltroKeyReleased

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean coma = key == 44;
        boolean punto = key == 46;
        if (!(numeros || coma || punto)) {

            evt.consume();
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txttipotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttipotFocusLost
        if (txttipot.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo tipo debe estar completo");
            txttipot.requestFocus();
        }
    }//GEN-LAST:event_txttipotFocusLost

    private void tadescripciontFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tadescripciontFocusLost
        if (tadescripciont.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Descripcion debe estar completo");
            tadescripciont.requestFocus();
        }
    }//GEN-LAST:event_tadescripciontFocusLost

    private void txtmedicamentotFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtmedicamentotFocusLost
        if (txtmedicamentot.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo Medicamento debe estar completo");
            txtmedicamentot.requestFocus();
        }
    }//GEN-LAST:event_txtmedicamentotFocusLost

    private void txtprecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecioFocusLost
        if (txtprecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo precio debe estar completo");
            txtprecio.requestFocus();
        } else {
            btngc.setEnabled(true);
        }
    }//GEN-LAST:event_txtprecioFocusLost

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        tId.setText("");
        txttipot.setText("");
        tadescripciont.setText("");
        txtmedicamentot.setText("");
        txtprecio.setText("");
        cbActivo.setSelected(false);
        desactivarBtn();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed

        int filaSeleccionada = ttratamientos.getSelectedRow();

        if (filaSeleccionada != -1) {

            int idTratamiento = (Integer) ttratamientos.getValueAt(filaSeleccionada, 0);

            tData.eliminarTratamiento(idTratamiento);

            String activo = ttratamientos.getValueAt(filaSeleccionada, 5).toString();

            cargarTabla(1, null);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, " Debe seleccionar un tratamiento");

        }


    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        activarCampos();
        if (rbActivo.isSelected()) {
            btnModificar.setEnabled(true);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        desactivarCampos();
        desactivarBtn();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSeleccionada = ttratamientos.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {

            try {
                int id = Integer.parseInt(tId.getText());
                String tipoTratamiento, descripcion, medicamento;

                double precio = Double.parseDouble(txtprecio.getText());
                boolean activo = cbActivo.isSelected();
                tipoTratamiento = txttipot.getText();
                descripcion = tadescripciont.getText();
                medicamento = txtmedicamentot.getText();
                if (cbActivo.isSelected()) {
                    Tratamiento t = new Tratamiento(tipoTratamiento, descripcion, medicamento, precio, activo);
                    tData.modificarTratamiento(id, t);
                } else {
                    JOptionPane.showMessageDialog(this, "El tratamiento no esta activo. Actívelo para poder modificarlo");
                    cargarTabla(1, null);
                }

            } catch (Exception e) {
            }

            cargarTabla(2, null);
            limpiarCampos();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btneliminartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartActionPerformed
        dispose();
    }//GEN-LAST:event_btneliminartActionPerformed

    private void cbActivoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbActivoFocusLost
        if (cbActivo.isSelected()) {
            btnModificar.setEnabled(true);
        }

    }//GEN-LAST:event_cbActivoFocusLost

    private void ttratamientosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ttratamientosMouseClicked
        try {
            int seleccionado = ttratamientos.rowAtPoint(evt.getPoint());

            tId.setText(String.valueOf(ttratamientos.getValueAt(seleccionado, 0)));
            txttipot.setText(String.valueOf(ttratamientos.getValueAt(seleccionado, 1)));
            tadescripciont.setText(String.valueOf(ttratamientos.getValueAt(seleccionado, 2)));
            txtmedicamentot.setText(String.valueOf(ttratamientos.getValueAt(seleccionado, 3)));
            txtprecio.setText(String.valueOf(ttratamientos.getValueAt(seleccionado, 4)));

            if (ttratamientos.getValueAt(seleccionado, 5).toString().equals("Si")) {
                cbActivo.setSelected(true);
            } else {
                cbActivo.setSelected(false);
            }
        } catch (Exception ex) {

        }

    }//GEN-LAST:event_ttratamientosMouseClicked

    private void cbActivoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_cbActivoComponentAdded

    }//GEN-LAST:event_cbActivoComponentAdded

    private void tIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tIdActionPerformed
        if (!tId.getText().isEmpty()) {
            btnModificar.setEnabled(true);
        } else {
            btnModificar.setEnabled(false);

        }
    }//GEN-LAST:event_tIdActionPerformed

    private void cActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActualizarActionPerformed
       
    }//GEN-LAST:event_cActualizarActionPerformed
    private void tablaTratamientos(int filas) {
        String titulos[] = new String[6];
        titulos[0] = "ID";
        titulos[1] = "TIPO";
        titulos[2] = "DESCRIPCION";
        titulos[3] = "MEDICAMENTO";
        titulos[4] = "PRECIO";
        titulos[5] = "ACTIVO";

        ttratamientos.setModel(new TablaModelo(titulos, filas));

    }

    private void desactivarBtn() {
        btnModificar.setEnabled(false);
        btngc.setEnabled(false);
    }

    private void desactivarCampos() {
        txttipot.setEnabled(false);
        tadescripciont.setEnabled(false);
        txtmedicamentot.setEnabled(false);
        txtprecio.setEnabled(false);
        cbActivo.setEnabled(false);
    }

    private void activarCampos() {
        txttipot.setEnabled(true);
        tadescripciont.setEnabled(true);
        txtmedicamentot.setEnabled(true);
        txtprecio.setEnabled(true);
        cbActivo.setEnabled(true);
    }

    private void limpiarCampos() {
        tId.setText("");
        txttipot.setText("");
        tadescripciont.setText("");
        txtmedicamentot.setText("");
        txtprecio.setText("");
        cbActivo.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btneliminart;
    private javax.swing.JButton btngc;
    private javax.swing.JButton cActualizar;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbNoActivo;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.ButtonGroup rbactivos;
    private javax.swing.JTextField tId;
    private javax.swing.JTextArea tadescripciont;
    private javax.swing.JTable ttratamientos;
    private javax.swing.JTextField txtmedicamentot;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttipot;
    private javax.swing.JTextField txttipotfiltro;
    // End of variables declaration//GEN-END:variables

    private void guardar() {
        String tipoTratamiento, descripcion, medicamento;
        double precio = Double.parseDouble(txtprecio.getText());
        boolean activo = cbActivo.isSelected();
        tipoTratamiento = txttipot.getText();
        descripcion = tadescripciont.getText();
        medicamento = txtmedicamentot.getText();
        if (!tipoTratamiento.isEmpty() && !descripcion.isEmpty() && !medicamento.isEmpty() && !txtprecio.getText().isEmpty()) {

            try {
                Tratamiento t = new Tratamiento(tipoTratamiento, descripcion, medicamento, precio, activo);
                tData.agregarTratamiento(t);
                int id = t.getIdTratamiento();
                tId.setText(id + "");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos");
        }
        if (!cbActivo.isSelected()) {
            JOptionPane.showMessageDialog(this, "Esta ingresando un tratammiento con estado inactivo");
            cbActivo.requestFocus();
            cbActivo.isSelected();
        }
    }

    private void cargarTabla(int valor, String s) {
        lista = new ArrayList<Tratamiento>();
        lista = tData.listarTratamientos(valor, s);
        tablaTratamientos(lista.size());
        if (!lista.isEmpty()) {
            for (int i = 0; i < lista.size(); i++) {

                ttratamientos.setValueAt(lista.get(i).getIdTratamiento(), i, 0);
                ttratamientos.setValueAt(lista.get(i).getTipoTratamiento(), i, 1);
                ttratamientos.setValueAt(lista.get(i).getDescripcion(), i, 2);
                ttratamientos.setValueAt(lista.get(i).getMedicamento(), i, 3);
                ttratamientos.setValueAt(lista.get(i).getPrecio(), i, 4);
                if (lista.get(i).isActivo()) {
                    ttratamientos.setValueAt("Si", i, 5);
                } else {
                    ttratamientos.setValueAt("No", i, 5);
                }
            }
        }

    }

    private void filtroTipo() {

        String tt = txttipotfiltro.getText();

        lista = new ArrayList<Tratamiento>();
        lista = tData.listarTratamientos(3, tt);
        tablaTratamientos(lista.size());
        cargarTabla(3, tt);

    }
}
