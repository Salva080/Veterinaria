/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import modelo.Mascota;
import modelo.Tratamiento;

/**
 *
 * @author NEXO-MAX
 */
public class ViewAgregarConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewConsulta
     */
    public ViewAgregarConsulta() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        jLabel7.setText("CONSULTAS");

        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ALIAS ", "ESPECIE", "RAZA", "CLIENTE", "PESO", "PESO ACTUAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 200, 464, 87);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "TIPO", "DESCRIPCION", "PRECIO"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(360, 390, 464, 70);

        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(500, 150, 161, 20);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(510, 340, 172, 20);

        jButton1.setText("BUSCAR");
        getContentPane().add(jButton1);
        jButton1.setBounds(710, 150, 73, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("MASCOTAS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 150, 69, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TRATAMIENTOS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 340, 96, 15);

        jButton4.setText("AGREGAR");
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 380, 81, 23);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(80, 530, 691, 70);

        jButton6.setText("BUSCAR");
        getContentPane().add(jButton6);
        jButton6.setBounds(730, 340, 73, 23);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(130, 170, 86, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(130, 240, 81, 20);

        jLabel4.setText("PESO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 230, 76, 23);

        jLabel5.setText("FECHA");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 50, 24);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel6.setText("AGREGAR CONSULTA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 70, 271, 29);
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(130, 300, 21, 21);

        jLabel1.setText("ACTIVO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 300, 46, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CONSULTAS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 460, 100, 14);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-10, -10, 870, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<Mascota> jComboBox1;
    private javax.swing.JComboBox<Tratamiento> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}