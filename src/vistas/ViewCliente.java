/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ClienteData;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Conexion;

/**
 *
 * @author NEXO-MAX
 */
public class ViewCliente extends javax.swing.JInternalFrame {

    private ClienteData clienteData;
    private Conexion conexion;

    /**
     * Creates new form ViewCliente
     */
    public ViewCliente() {
        initComponents();
        limpiar();
        this.setSize(900, 700);
        conexion = new Conexion();
        clienteData = new ClienteData(conexion);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        cId = new javax.swing.JTextField();
        cBuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cCelular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        alternativo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cEstado = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cDNI2 = new javax.swing.JTextField();
        cBuscar1 = new javax.swing.JButton();
        cDNI = new javax.swing.JTextField();
        cGuardar = new javax.swing.JButton();
        cBorrar = new javax.swing.JButton();
        cActualizar = new javax.swing.JButton();
        cLimpiar = new javax.swing.JButton();
        cSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Busqueda:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 110, 87, 23);

        cId.setBackground(new java.awt.Color(255, 255, 255));
        cId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cIdKeyTyped(evt);
            }
        });
        getContentPane().add(cId);
        cId.setBounds(180, 140, 60, 30);

        cBuscar.setBackground(new java.awt.Color(255, 255, 255));
        cBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cBuscar.setForeground(new java.awt.Color(0, 0, 0));
        cBuscar.setText("Buscar ");
        cBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(cBuscar);
        cBuscar.setBounds(250, 130, 90, 30);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ingresar cliente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 170, 140, 30);

        cApellido.setBackground(new java.awt.Color(255, 255, 255));
        cApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cApellidoFocusLost(evt);
            }
        });
        cApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(cApellido);
        cApellido.setBounds(180, 280, 160, 30);

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 290, 59, 17);

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 320, 57, 17);

        cNombre.setBackground(new java.awt.Color(255, 255, 255));
        cNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cNombreFocusLost(evt);
            }
        });
        cNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cNombreKeyTyped(evt);
            }
        });
        getContentPane().add(cNombre);
        cNombre.setBounds(180, 310, 160, 30);

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dirección:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 350, 64, 17);

        cDireccion.setBackground(new java.awt.Color(255, 255, 255));
        cDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cDireccionFocusLost(evt);
            }
        });
        cDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDireccionKeyTyped(evt);
            }
        });
        getContentPane().add(cDireccion);
        cDireccion.setBounds(180, 340, 260, 30);

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 380, 50, 17);

        cCelular.setBackground(new java.awt.Color(255, 255, 255));
        cCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cCelularFocusLost(evt);
            }
        });
        getContentPane().add(cCelular);
        cCelular.setBounds(180, 370, 260, 30);

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Nomb. Alternativo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(80, 410, 125, 17);

        alternativo.setBackground(new java.awt.Color(255, 255, 255));
        alternativo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                alternativoFocusLost(evt);
            }
        });
        alternativo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alternativoKeyTyped(evt);
            }
        });
        getContentPane().add(alternativo);
        alternativo.setBounds(250, 400, 190, 30);

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 430, 48, 17);

        cEstado.setBackground(new java.awt.Color(255, 255, 255));
        cEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(cEstado);
        cEstado.setBounds(180, 430, 24, 24);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(80, 230, 360, 2);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Clientes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 30, 150, 48);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Buscar cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(550, 130, 140, 30);

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DNI:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 260, 32, 17);

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID Cliente:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(80, 150, 69, 17);

        jLabel14.setFont(new java.awt.Font("Book Antiqua", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DNI:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(80, 180, 32, 17);

        cDNI2.setBackground(new java.awt.Color(255, 255, 255));
        cDNI2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDNI2KeyTyped(evt);
            }
        });
        getContentPane().add(cDNI2);
        cDNI2.setBounds(180, 180, 160, 30);

        cBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        cBuscar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cBuscar1.setForeground(new java.awt.Color(0, 0, 0));
        cBuscar1.setText("Buscar ");
        cBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(cBuscar1);
        cBuscar1.setBounds(350, 170, 90, 30);

        cDNI.setBackground(new java.awt.Color(255, 255, 255));
        cDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cDNIFocusLost(evt);
            }
        });
        cDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDNIKeyTyped(evt);
            }
        });
        getContentPane().add(cDNI);
        cDNI.setBounds(180, 250, 160, 30);

        cGuardar.setBackground(new java.awt.Color(255, 255, 255));
        cGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cGuardar.setForeground(new java.awt.Color(0, 0, 0));
        cGuardar.setText("Guardar");
        cGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cGuardar);
        cGuardar.setBounds(80, 520, 100, 35);

        cBorrar.setBackground(new java.awt.Color(255, 255, 255));
        cBorrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cBorrar.setForeground(new java.awt.Color(0, 0, 0));
        cBorrar.setText("Borrar");
        cBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cBorrar);
        cBorrar.setBounds(210, 520, 100, 35);

        cActualizar.setBackground(new java.awt.Color(255, 255, 255));
        cActualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cActualizar.setForeground(new java.awt.Color(0, 0, 0));
        cActualizar.setText("Actualizar");
        cActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(cActualizar);
        cActualizar.setBounds(340, 520, 100, 35);

        cLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        cLimpiar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        cLimpiar.setText("Limpiar");
        cLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cLimpiar);
        cLimpiar.setBounds(470, 520, 100, 35);

        cSalir.setBackground(new java.awt.Color(255, 255, 255));
        cSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cSalir.setForeground(new java.awt.Color(0, 0, 0));
        cSalir.setText("Salir");
        cSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cSalir);
        cSalir.setBounds(600, 520, 90, 35);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(80, 490, 610, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEstadoActionPerformed

    private void cGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cGuardarActionPerformed
        int dni = Integer.parseInt(cDNI.getText());
        String apellido = cApellido.getText();
        String nombre = cNombre.getText();
        String direccion = cDireccion.getText();
        int celular = Integer.parseInt(cCelular.getText());
        String alt = alternativo.getText();
        boolean estado = cEstado.isEnabled();

        Cliente c = new Cliente(dni, nombre, apellido, direccion, celular, alt, estado);

        clienteData.agregarCliente(c);
        cId.setText(c.getIdCliente() + "");
        limpiar();

    }//GEN-LAST:event_cGuardarActionPerformed

    private void cBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBorrarActionPerformed
        int id = Integer.parseInt(cId.getText());
        if (clienteData.clienteExiste(id)) {
            clienteData.eliminarCliente(id);
            limpiar();
            desactivarOtros();
            desactivarId();
        } else {
            JOptionPane.showMessageDialog(this, "El clinete no existe");
        }
    }//GEN-LAST:event_cBorrarActionPerformed

    private void cActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActualizarActionPerformed
        if (cId.getText() != null) {
            int id = Integer.parseInt(cId.getText());
            int dni = Integer.parseInt(cDNI.getText());
            String apellido = cApellido.getText();
            String nombre = cNombre.getText();
            String direccion = cDireccion.getText();
            int celular = Integer.parseInt(cCelular.getText());
            String alt = alternativo.getText();
            boolean estado = cEstado.isEnabled();

            Cliente c = new Cliente(dni, nombre, apellido, direccion, celular, alt, estado);
            clienteData.modificarCliente(id, c);

            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el cliente");
        }
    }//GEN-LAST:event_cActualizarActionPerformed

    private void cLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_cLimpiarActionPerformed

    private void cBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscarActionPerformed
        botonesBuscar();
        activarOtros();

        Cliente c = clienteData.buscarCliente(Integer.parseInt(cId.getText()));

        int id = Integer.parseInt(cId.getText());

        if (cId.getText() != null && clienteData.clienteExiste(id)) {

            cDNI.setText(c.getDni() + "");
            cApellido.setText(c.getApellido());
            cNombre.setText(c.getNombre());
            cDireccion.setText(c.getDireccion());
            cCelular.setText(c.getTelefono() + "");
            alternativo.setText(c.getContactoAlternativo());
            cEstado.setSelected(c.isActivo());
            cGuardar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el cliente");
            limpiar();
        }

        //  activarOtros();
    }//GEN-LAST:event_cBuscarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        desactivarOtros();
        activarId();
        cBuscar.setEnabled(true);
        cBuscar1.setEnabled(true);
        cDNI2.setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSalirActionPerformed
        dispose();
    }//GEN-LAST:event_cSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        desactivarId();
        activarOtros();
        //botonesGuardar();

        sinBotonesBuscar();
        cBuscar.setEnabled(false);
        cBuscar1.setEnabled(false);
        cDNI2.setEnabled(false);
        limpiarCampos();
        cId.setText("");
        cId.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cApellidoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El dato APELLIDO  no debe ser numérico");
            evt.consume();
        }

    }//GEN-LAST:event_cApellidoKeyTyped

    private void cNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El dato NOMBRE  no debe ser numérico");
            evt.consume();
        }

    }//GEN-LAST:event_cNombreKeyTyped

    private void cDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDireccionKeyTyped

    }//GEN-LAST:event_cDireccionKeyTyped

    private void alternativoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alternativoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            JOptionPane.showMessageDialog(this, "El dato Contacto alternativo  no debe ser numérico");
            evt.consume();
        }

    }//GEN-LAST:event_alternativoKeyTyped

    private void cDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cDNIFocusLost
        if (cDNI.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            cDNI.requestFocus();
        }
    }//GEN-LAST:event_cDNIFocusLost

    private void cApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cApellidoFocusLost
        if (cApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            cApellido.requestFocus();
        }
    }//GEN-LAST:event_cApellidoFocusLost

    private void cNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNombreFocusLost
        if (cNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            cNombre.requestFocus();
        }
    }//GEN-LAST:event_cNombreFocusLost

    private void cDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cDireccionFocusLost
        if (cDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            cDireccion.requestFocus();
        }
    }//GEN-LAST:event_cDireccionFocusLost

    private void cCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cCelularFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cCelularFocusLost

    private void alternativoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alternativoFocusLost
        if (alternativo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede dejar vacio este campo");
            alternativo.requestFocus();
        }
    }//GEN-LAST:event_alternativoFocusLost

    private void cIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cIdKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "El dato ID debe ser numérico");
            evt.consume();
        }

    }//GEN-LAST:event_cIdKeyTyped

    private void cDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDNIKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "El dato DNI debe ser numérico, sin puntos.");
            evt.consume();
        }

    }//GEN-LAST:event_cDNIKeyTyped

    private void cDNI2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDNI2KeyTyped
       int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            JOptionPane.showMessageDialog(this, "El dato DNI debe ser numérico, sin puntos.");
            evt.consume();
        }
    }//GEN-LAST:event_cDNI2KeyTyped

    private void cBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBuscar1ActionPerformed
        botonesBuscar();
        activarOtros();

        Cliente c = clienteData.buscarClientePorDni(Integer.parseInt(cDNI2.getText()));
        
        int id = c.getIdCliente();

        if (cId.getText() != null && clienteData.clienteExiste(id)) {
            
            cId.setText(c.getIdCliente()+"");
            cDNI.setText(c.getDni() + "");
            cApellido.setText(c.getApellido());
            cNombre.setText(c.getNombre());
            cDireccion.setText(c.getDireccion());
            cCelular.setText(c.getTelefono() + "");
            alternativo.setText(c.getContactoAlternativo());
            cEstado.setSelected(c.isActivo());
            cGuardar.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el cliente");
            limpiar();
        }
    }//GEN-LAST:event_cBuscar1ActionPerformed
    private void limpiar() {
        cId.setText("");
        cDNI.setText("");
        cDNI2.setText("");
        cApellido.setText("");
        cNombre.setText("");
        cDireccion.setText("");
        cCelular.setText("");
        alternativo.setText("");
        cEstado.setSelected(false);
        desactivarOtros();
        desactivarId();
        botonesDesactivados();
        cDNI2.setEnabled(false);
        cBuscar1.setEnabled(false);
        cId.setEnabled(false);

    }
    private void limpiarCampos(){
        cId.setText("");
        cDNI.setText("");
        cDNI2.setText("");
        cApellido.setText("");
        cNombre.setText("");
        cDireccion.setText("");
        cCelular.setText("");
        alternativo.setText("");
        cEstado.setSelected(false);
    }

    private void activarId() {
        cId.setEnabled(true);
    }

    private void desactivarId() {
        cId.setEnabled(false);
    }

    private void activarOtros() {
        cNombre.setEnabled(true);
        cApellido.setEnabled(true);
        cEstado.setEnabled(true);
        cDNI.setEnabled(true);
        cDireccion.setEnabled(true);
        cCelular.setEnabled(true);
        alternativo.setEnabled(true);
        cId.setEnabled(true);
        cDNI2.setEnabled(true);
        cGuardar.setEnabled(true);
        cBorrar.setEnabled(true);
        cActualizar.setEnabled(true);

    }

    private void desactivarOtros() {
        cNombre.setEnabled(false);
        cApellido.setEnabled(false);
        cEstado.setEnabled(false);
        cDNI.setEnabled(false);
        cDireccion.setEnabled(false);
        cCelular.setEnabled(false);
        alternativo.setEnabled(false);
        cId.setEnabled(false);
        cGuardar.setEnabled(false);
        cBorrar.setEnabled(false);
        cActualizar.setEnabled(false);
    }

    private void botonesDesactivados() {
        cGuardar.setEnabled(false);
        cBorrar.setEnabled(false);
        cActualizar.setEnabled(false);
        cBuscar.setEnabled(false);
        cBuscar1.setEnabled(false);
    }

    private void botonesBuscar() {
        cActualizar.setEnabled(true);
        cBorrar.setEnabled(true);
    }

    private void sinBotonesBuscar() {
        cActualizar.setEnabled(false);
        cBorrar.setEnabled(false);
    }

    private void botonesGuardar() {
        cGuardar.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alternativo;
    private javax.swing.JButton cActualizar;
    private javax.swing.JTextField cApellido;
    private javax.swing.JButton cBorrar;
    private javax.swing.JButton cBuscar;
    private javax.swing.JButton cBuscar1;
    private javax.swing.JTextField cCelular;
    private javax.swing.JTextField cDNI;
    private javax.swing.JTextField cDNI2;
    private javax.swing.JTextField cDireccion;
    private javax.swing.JCheckBox cEstado;
    private javax.swing.JButton cGuardar;
    private javax.swing.JTextField cId;
    private javax.swing.JButton cLimpiar;
    private javax.swing.JTextField cNombre;
    private javax.swing.JButton cSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
