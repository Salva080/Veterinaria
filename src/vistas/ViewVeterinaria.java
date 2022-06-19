/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import vistas.ViewGestionConsulta;
import vistas.ViewCliente;


import vistas.ViewMascotas;

import vistas.*;

/**
 *
 * @author NEXO-MAX
 */
public class ViewVeterinaria extends javax.swing.JFrame {

    /**
     * Creates new form Veterinaria
     */
    public ViewVeterinaria() {
        initComponents();
       this.setSize(900, 900);
       this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiFormularioCliente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiFormularioMascotas = new javax.swing.JMenuItem();
        jmiListadoMascotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiAgregarConsulta = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menulTratamientos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setPreferredSize(new java.awt.Dimension(397, 268));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        jmiFormularioCliente.setText("Formulario de clientes");
        jmiFormularioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmiFormularioCliente);

        jMenuItem1.setText("Lista de Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mascotas");

        jmiFormularioMascotas.setText("Formulario Mascotas");
        jmiFormularioMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioMascotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmiFormularioMascotas);

        jmiListadoMascotas.setText("Listado Mascotas");
        jmiListadoMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListadoMascotasActionPerformed(evt);
            }
        });
        jMenu3.add(jmiListadoMascotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmiAgregarConsulta.setText("Gestion Consultas");
        jmiAgregarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarConsultaActionPerformed(evt);
            }
        });
        jMenu4.add(jmiAgregarConsulta);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Tratamientos");

        menulTratamientos.setText("GestionTratamientos");
        menulTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menulTratamientosActionPerformed(evt);
            }
        });
        jMenu5.add(menulTratamientos);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiFormularioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioClienteActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewCliente vc = new ViewCliente();
        vc.setSize(850,700);
        vc.setVisible(true);
        escritorio.add(vc);
        escritorio.moveToFront(vc);
        
    }//GEN-LAST:event_jmiFormularioClienteActionPerformed

    private void jmiFormularioMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioMascotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewMascotas vm = new ViewMascotas();
        vm.setSize(850,700);
        vm.setVisible(true);
        escritorio.add(vm);
        escritorio.moveToFront(vm);
    }//GEN-LAST:event_jmiFormularioMascotasActionPerformed

    private void jmiAgregarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarConsultaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewGestionConsulta vac = new ViewGestionConsulta();
        vac.setSize(970,700);
        vac.setVisible(true);
        escritorio.add(vac);
        escritorio.moveToFront(vac);
    }//GEN-LAST:event_jmiAgregarConsultaActionPerformed

    private void jmiListadoMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListadoMascotasActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        ViewListadoMascotas vlm = new ViewListadoMascotas();
        vlm.setSize(850,700);
        vlm.setVisible(true);
        escritorio.add(vlm);
        escritorio.moveToFront(vlm);
    }//GEN-LAST:event_jmiListadoMascotasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewListadoClientes lc = new ViewListadoClientes();
        lc.setSize(850,700);
        lc.setVisible(true);
        escritorio.add(lc);
        escritorio.moveToFront(lc);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menulTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menulTratamientosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ViewGestionTratamientos ltr = new ViewGestionTratamientos();
        ltr.setSize(900,700);
        ltr.setVisible(true);
        escritorio.add(ltr);
        escritorio.moveToFront(ltr);
    }//GEN-LAST:event_menulTratamientosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVeterinaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVeterinaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmiAgregarConsulta;
    private javax.swing.JMenuItem jmiFormularioCliente;
    private javax.swing.JMenuItem jmiFormularioMascotas;
    private javax.swing.JMenuItem jmiListadoMascotas;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenuItem menulTratamientos;
    // End of variables declaration//GEN-END:variables
}
