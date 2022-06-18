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
     private  ArrayList<Tratamiento> lista;
    private TratamientoData tData;
 
     
     
  
    public ViewGestionTratamientos() {
        initComponents();
       try{
        conexion = new Conexion();
        tData=new TratamientoData(conexion);
       modelo = new DefaultTableModel(); 

        cargarTabla(0, null);
       
       } catch(Exception e){
           
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txttipot = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tadescripciont = new javax.swing.JTextArea();
        btngc = new javax.swing.JButton();
        txtmedicamentot = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        btneliminart1 = new javax.swing.JButton();
        btneliminart2 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttratamientos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txttipotfiltro = new javax.swing.JTextField();
        btneliminart = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();

        rbactivos.add(rbActivo);
        rbActivo.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        rbActivo.setText("ACTIVOS");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });

        rbactivos.add(rbNoActivo);
        rbNoActivo.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        rbNoActivo.setText("NO ACTIVOS");
        rbNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActivoActionPerformed(evt);
            }
        });

        btnAlta.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnAlta.setText("Dar de Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Gestionar");

        cbActivo.setBackground(new java.awt.Color(255, 255, 255));
        cbActivo.setSelected(true);
        cbActivo.setEnabled(false);
        cbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActivoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel7.setText("Activo:");

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel10.setText("Precio:");

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel9.setText("Medicamento:");

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel6.setText("Descripción:");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel8.setText("Tipo:");

        txttipot.setEnabled(false);
        txttipot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttipotFocusLost(evt);
            }
        });

        tadescripciont.setColumns(20);
        tadescripciont.setRows(5);
        tadescripciont.setEnabled(false);
        tadescripciont.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tadescripciontFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(tadescripciont);

        btngc.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btngc.setText("Guardar");
        btngc.setEnabled(false);
        btngc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngcActionPerformed(evt);
            }
        });

        txtmedicamentot.setEnabled(false);
        txtmedicamentot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtmedicamentotFocusLost(evt);
            }
        });

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

        btneliminart1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btneliminart1.setText("Modificar");
        btneliminart1.setEnabled(false);
        btneliminart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminart1ActionPerformed(evt);
            }
        });

        btneliminart2.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btneliminart2.setText("Eliminar");
        btneliminart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminart2ActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btngc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminart1)
                .addGap(15, 15, 15)
                .addComponent(btneliminart2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(cbActivo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txttipot, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtmedicamentot, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar)
                .addGap(102, 102, 102)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(btnIngresar))
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttipot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtmedicamentot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbActivo))
                .addGap(17, 17, 17)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngc)
                    .addComponent(btneliminart1)
                    .addComponent(btneliminart2)
                    .addComponent(btnLimpiar))
                .addGap(0, 64, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Listado de tratamientos");

        rbactivos.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("TODOS");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        ttratamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo", "Descripcion", "Medicamento", "Precio"
            }
        ));
        jScrollPane1.setViewportView(ttratamientos);

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        jLabel1.setText("Buscar por tipo:");

        txttipotfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttipotfiltroKeyReleased(evt);
            }
        });

        btneliminart.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        btneliminart.setText("Salir");
        btneliminart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminartActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Book Antiqua", 0, 11)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbActivo)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbNoActivo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txttipotfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btneliminart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11))
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbNoActivo)
                            .addComponent(rbActivo)
                            .addComponent(jRadioButton1))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txttipotfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAlta)
                            .addComponent(btneliminart)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
 cargarTabla(2, null);
    }//GEN-LAST:event_rbActivoActionPerformed

    private void rbNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActivoActionPerformed
       rbActivo.setSelected(false);
       btnAlta.setEnabled(true);
        cargarTabla(1, null);

    }//GEN-LAST:event_rbNoActivoActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
// //    int filaSeleccionada = tTratamiento.getSelectedRow();
//  
//        if (filaSeleccionada != -1) {
//ttratamientos.setValueAt(lista.get(i).getIdTratamiento(), i,0);
//            int idTratamiento = (Integer) modelo.getValueAt(filaSeleccionada, 0);
//
//            tData.activarTratamiento(idTratamiento);
//
//            boolean estado = (Boolean) modelo.getValueAt(filaSeleccionada, 5);
//            
//                       
//          //  borraFilasTabla();
//
//        } else {
//            JOptionPane.showMessageDialog(this, " Debe seleccionar un tratamiento");
//
//        }
    }//GEN-LAST:event_btnAltaActionPerformed

    private void cbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActivoActionPerformed
       
    }//GEN-LAST:event_cbActivoActionPerformed

    private void btngcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngcActionPerformed
guardar(); 
cargarTabla(0, null);
    }//GEN-LAST:event_btngcActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    cargarTabla(0, null);    
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
        }else{
          btngc.setEnabled(true);
       }
    }//GEN-LAST:event_txtprecioFocusLost

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txttipot.setText("");
       tadescripciont.setText("");
       txtmedicamentot.setText("");
       txtprecio.setText("");
       
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btneliminart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminart2ActionPerformed
       
    }//GEN-LAST:event_btneliminart2ActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       activarCampos();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    desactivarCampos();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btneliminart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminart1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminart1ActionPerformed

    private void btneliminartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminartActionPerformed
      dispose();
    }//GEN-LAST:event_btneliminartActionPerformed
    private void tablaTratamientos(int filas){
        String titulos[] = new String[6];
        titulos[0]="ID";
        titulos[1]="TIPO";
        titulos[2]="DESCRIPCION";
        titulos[3]="MEDICAMENTO";
        titulos[4]="PRECIO";
        titulos[5]="ACTIVO";

        ttratamientos.setModel(new TablaModelo(titulos,filas));

 
    }
 private void desactivarCampos(){
      txttipot.setEnabled(false);
       tadescripciont.setEnabled(false);
       txtmedicamentot.setEnabled(false);
       txtprecio.setEnabled(false);
      cbActivo.setEnabled(false);
 }
 private void activarCampos(){
      txttipot.setEnabled(true);
       tadescripciont.setEnabled(true);
       txtmedicamentot.setEnabled(true);
       txtprecio.setEnabled(true);
      cbActivo.setEnabled(true);
 }
 
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btneliminart;
    private javax.swing.JButton btneliminart1;
    private javax.swing.JButton btneliminart2;
    private javax.swing.JButton btngc;
    private javax.swing.JCheckBox cbActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbNoActivo;
    private javax.swing.ButtonGroup rbactivos;
    private javax.swing.JTextArea tadescripciont;
    private javax.swing.JTable ttratamientos;
    private javax.swing.JTextField txtmedicamentot;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txttipot;
    private javax.swing.JTextField txttipotfiltro;
    // End of variables declaration//GEN-END:variables

    private void guardar() {  
String tipoTratamiento, descripcion, medicamento;
double precio= Double.parseDouble(txtprecio.getText());
boolean activo= cbActivo.isSelected();
tipoTratamiento= txttipot.getText();
descripcion=tadescripciont.getText();
medicamento= txtmedicamentot.getText();
if(!tipoTratamiento.isEmpty()&& !descripcion.isEmpty() && !medicamento.isEmpty() && !txtprecio.getText().isEmpty() ){
    

try{
Tratamiento t= new Tratamiento(tipoTratamiento, descripcion, medicamento, precio, activo);
tData.agregarTratamiento(t);

     }catch(Exception e){
        JOptionPane.showMessageDialog(this,e.getMessage());
     }
    }else{
    JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos");
}
    }

    private void cargarTabla(int valor, String s) {
       lista= new ArrayList<Tratamiento> ();
       lista= tData.listarTratamientos(valor, s);
       tablaTratamientos(lista.size());
       if(!lista.isEmpty()){
 for(int i=0; i<lista.size(); i++){
    
   ttratamientos.setValueAt(lista.get(i).getIdTratamiento(), i,0);
     ttratamientos.setValueAt(lista.get(i).getTipoTratamiento(), i,1);
     ttratamientos.setValueAt(lista.get(i).getDescripcion(), i,2);
     ttratamientos.setValueAt(lista.get(i).getMedicamento(), i,3);
     ttratamientos.setValueAt(lista.get(i).getPrecio(), i,4);
     if(lista.get(i).isActivo()){
    ttratamientos.setValueAt( "Si", i,5);
 }else{
           ttratamientos.setValueAt("No" , i,5);  
     }
 }   
       }

     }

    private void filtroTipo() {
        
     String tt= txttipotfiltro.getText();
       
        lista= new ArrayList<Tratamiento>();
        lista= tData.listarTratamientos(3, tt);
        tablaTratamientos(lista.size());   
        cargarTabla(3, tt);
     
    }
}        