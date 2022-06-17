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
import modelo.Tratamiento;

/**
 *
 * @author Caro_Z
 */
public class ViewListadoTratamientos extends javax.swing.JInternalFrame {
    Conexion conexion = new Conexion();
     private DefaultTableModel modelo;
     private List<Tratamiento> listaTratActivo;
    private TratamientoData tData;
    private List<Tratamiento> listaTratInactivo;
     
     
  
    public ViewListadoTratamientos() {
        initComponents();
        
        conexion = new Conexion();
        
       tData=new TratamientoData(conexion);
       listaTratActivo=(ArrayList)tData.listarTratamientosActivos();
       listaTratInactivo=(ArrayList)tData.listarTratamientosInactivos();
       modelo = new DefaultTableModel();
        armarCabeceraTabla(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbActivo = new javax.swing.JRadioButton();
        rbNoActivo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tTratamiento = new javax.swing.JTable();
        btnAlta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        rbActivo.setText("ACTIVOS");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });

        rbNoActivo.setText("NO ACTIVOS");
        rbNoActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActivoActionPerformed(evt);
            }
        });

        tTratamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TIPO", "DESCRIPCION", "MEDICAMENTO", "PRECIO", "ACTIVO"
            }
        ));
        jScrollPane1.setViewportView(tTratamiento);

        btnAlta.setText("DAR DE ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO DE TRATAMIENTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(rbActivo)
                        .addGap(76, 76, 76)
                        .addComponent(rbNoActivo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbActivo)
                    .addComponent(rbNoActivo))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnSalir))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
        rbNoActivo.setSelected(false);
        btnAlta.setEnabled(false);
        borraFilasTabla();
        cargaDatosActivos();
    }//GEN-LAST:event_rbActivoActionPerformed

    private void rbNoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActivoActionPerformed
         rbActivo.setSelected(false);
        btnAlta.setEnabled(true);
        borraFilasTabla();
        cargaDatosInactivos();
    }//GEN-LAST:event_rbNoActivoActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
     int filaSeleccionada = tTratamiento.getSelectedRow();
  
        if (filaSeleccionada != -1) {

            int idTratamiento = (Integer) modelo.getValueAt(filaSeleccionada, 0);

            tData.activarTratamiento(idTratamiento);

            boolean estado = (Boolean) modelo.getValueAt(filaSeleccionada, 5);
            
                       
            borraFilasTabla();

        } else {
            JOptionPane.showMessageDialog(this, " Debe seleccionar un tratamiento");

        }
    }//GEN-LAST:event_btnAltaActionPerformed
    private void armarCabeceraTabla(){
         ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("TIPO");
        columnas.add("DESCRIPCION");
        columnas.add("MEDICAMENTO");
        columnas.add("PRECIO");
        columnas.add("ACTIVO");

        for (Object it : columnas) {

            modelo.addColumn(it);
        }
        tTratamiento.setModel(modelo);
        
    }
    private void borraFilasTabla() {

        int a = modelo.getRowCount() - 1;

        for (int i = a; i >= 0; i--) {

            modelo.removeRow(i);
        }
    }
     private void cargaDatosActivos() {

        borraFilasTabla();
        

        ArrayList<Tratamiento> lista = (ArrayList) tData.listarTratamientosActivos();

        for (Tratamiento t : lista) {

            modelo.addRow(new Object[]{t.getIdTratamiento(), t.getTipoTratamiento(), t.getDescripcion(),t.getMedicamento(),t.getPrecio(),t.isActivo()});
        }
    }
      private void cargaDatosInactivos() {

        borraFilasTabla();
       
        ArrayList<Tratamiento> lista = (ArrayList) tData.listarTratamientosInactivos();

        for (Tratamiento t : lista) {

            modelo.addRow(new Object[]{t.getIdTratamiento(), t.getTipoTratamiento(), t.getDescripcion(),t.getMedicamento(),t.getPrecio(),t.isActivo()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbNoActivo;
    private javax.swing.JTable tTratamiento;
    // End of variables declaration//GEN-END:variables
}
