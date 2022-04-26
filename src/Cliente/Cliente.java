package Cliente;

import java.awt.Color;

public class Cliente extends javax.swing.JFrame {

    public Cliente() {
        initComponents();
        getRootPane().setDefaultButton(this.BotonIngresar);
        this.PanelRegistro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelIngreso = new javax.swing.JPanel();
        LinkRegistro = new javax.swing.JLabel();
        AnuncioBienvenida = new javax.swing.JLabel();
        ImagenPerfil = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Contraseña = new javax.swing.JTextField();
        BotonIngresar = new javax.swing.JButton();
        PanelRegistro = new javax.swing.JPanel();
        ImagenPerfil1 = new javax.swing.JLabel();
        NombreRegistro = new javax.swing.JTextField();
        Contraseña1 = new javax.swing.JTextField();
        Contraseña2 = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Recursos/icono_chat.png")).getImage());
        setMaximumSize(new java.awt.Dimension(700, 600));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setName("Ingreso"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelIngreso.setBackground(new java.awt.Color(188, 245, 188));
        PanelIngreso.setPreferredSize(new java.awt.Dimension(700, 600));
        PanelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LinkRegistro.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        LinkRegistro.setForeground(new java.awt.Color(0, 102, 204));
        LinkRegistro.setText("No tengo cuenta, quiero registrarme");
        LinkRegistro.setToolTipText("Da click para registrarte");
        LinkRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LinkRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkRegistroMouseClicked(evt);
            }
        });
        PanelIngreso.add(LinkRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 250, -1));

        AnuncioBienvenida.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        AnuncioBienvenida.setText("Bienvenid@");
        PanelIngreso.add(AnuncioBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 20, 130, 35));

        ImagenPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Perfil.png"))); // NOI18N
        PanelIngreso.add(ImagenPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 300, 300));

        Nombre.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(153, 153, 153));
        Nombre.setText("Nombre");
        Nombre.setToolTipText("Digita tu nombre");
        Nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreFocusLost(evt);
            }
        });
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        PanelIngreso.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 300, 32));

        Contraseña.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(153, 153, 153));
        Contraseña.setText("Contraseña");
        Contraseña.setToolTipText("Digita tu contraseña");
        Contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContraseñaFocusLost(evt);
            }
        });
        PanelIngreso.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 300, 32));

        BotonIngresar.setBackground(new java.awt.Color(51, 153, 255));
        BotonIngresar.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        BotonIngresar.setText("Ingresar");
        BotonIngresar.setToolTipText("Ingresar");
        BotonIngresar.setBorder(null);
        BotonIngresar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BotonIngresarFocusGained(evt);
            }
        });
        PanelIngreso.add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 120, 30));

        getContentPane().add(PanelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelRegistro.setBackground(new java.awt.Color(153, 255, 204));
        PanelRegistro.setMaximumSize(new java.awt.Dimension(700, 600));
        PanelRegistro.setMinimumSize(new java.awt.Dimension(700, 600));
        PanelRegistro.setPreferredSize(new java.awt.Dimension(700, 600));
        PanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagenPerfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Perfil.png"))); // NOI18N
        PanelRegistro.add(ImagenPerfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 300, 300));

        NombreRegistro.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        NombreRegistro.setForeground(new java.awt.Color(153, 153, 153));
        NombreRegistro.setText("Nombre");
        NombreRegistro.setToolTipText("Digita tu nombre");
        NombreRegistro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NombreRegistroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreRegistroFocusLost(evt);
            }
        });
        PanelRegistro.add(NombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 540, 32));

        Contraseña1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Contraseña1.setForeground(new java.awt.Color(153, 153, 153));
        Contraseña1.setText("Contraseña");
        Contraseña1.setToolTipText("Digita tu contraseña");
        Contraseña1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Contraseña1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Contraseña1FocusLost(evt);
            }
        });
        PanelRegistro.add(Contraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 540, 32));

        Contraseña2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        Contraseña2.setForeground(new java.awt.Color(153, 153, 153));
        Contraseña2.setText("Digita tu contraseña nuevamente");
        Contraseña2.setToolTipText("Digita tu contraseña nuevamente");
        Contraseña2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Contraseña2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Contraseña2FocusLost(evt);
            }
        });
        PanelRegistro.add(Contraseña2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 540, 32));

        BotonRegistrar.setBackground(new java.awt.Color(51, 153, 255));
        BotonRegistrar.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setToolTipText("Da click para registrar");
        BotonRegistrar.setBorder(null);
        BotonRegistrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BotonRegistrarFocusGained(evt);
            }
        });
        PanelRegistro.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 120, 30));

        BotonCancelar.setBackground(new java.awt.Color(255, 136, 136));
        BotonCancelar.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        BotonCancelar.setText("Cancelar");
        BotonCancelar.setToolTipText("Da click para cancelar");
        BotonCancelar.setBorder(null);
        BotonCancelar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BotonCancelarFocusGained(evt);
            }
        });
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        PanelRegistro.add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 120, 30));

        getContentPane().add(PanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaFocusGained
        if (this.Contraseña.getText().equals("Contraseña")) {
            this.Contraseña.setText("");
            this.Contraseña.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_ContraseñaFocusGained

    private void ContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContraseñaFocusLost
        if (this.Contraseña.getText().equals("")) {
            this.Contraseña.setText("Contraseña");
            this.Contraseña.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_ContraseñaFocusLost

    private void NombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFocusLost
        if (this.Nombre.getText().equals("")) {
            this.Nombre.setText("Nombre");
            this.Nombre.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_NombreFocusLost

    private void NombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFocusGained
        if (this.Nombre.getText().equals("Nombre")) {
            this.Nombre.setText("");
            this.Nombre.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_NombreFocusGained

    private void BotonIngresarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BotonIngresarFocusGained

    }//GEN-LAST:event_BotonIngresarFocusGained

    private void LinkRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkRegistroMouseClicked
        this.PanelIngreso.setVisible(false);
        this.PanelRegistro.setVisible(true);
    }//GEN-LAST:event_LinkRegistroMouseClicked

    private void BotonRegistrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BotonRegistrarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistrarFocusGained

    private void NombreRegistroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreRegistroFocusGained
        if (this.NombreRegistro.getText().equals("Nombre")) {
            this.NombreRegistro.setText("");
            this.NombreRegistro.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_NombreRegistroFocusGained

    private void NombreRegistroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreRegistroFocusLost
        if (this.NombreRegistro.getText().equals("")) {
            this.NombreRegistro.setText("Nombre");
            this.NombreRegistro.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_NombreRegistroFocusLost

    private void Contraseña1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Contraseña1FocusGained
        if (this.Contraseña1.getText().equals("Contraseña")) {
            this.Contraseña1.setText("");
            this.Contraseña1.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_Contraseña1FocusGained

    private void Contraseña1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Contraseña1FocusLost
        if (this.Contraseña1.getText().equals("")) {
            this.Contraseña1.setText("Contraseña");
            this.Contraseña1.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_Contraseña1FocusLost

    private void Contraseña2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Contraseña2FocusGained
        if (this.Contraseña2.getText().equals("Digita tu contraseña nuevamente")) {
            this.Contraseña2.setText("");
            this.Contraseña2.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_Contraseña2FocusGained

    private void Contraseña2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Contraseña2FocusLost
        if (this.Contraseña2.getText().equals("")) {
            this.Contraseña2.setText("Digita tu contraseña nuevamente");
            this.Contraseña2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_Contraseña2FocusLost

    private void BotonCancelarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BotonCancelarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarFocusGained

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        this.PanelRegistro.setVisible(false);
        this.PanelIngreso.setVisible(true);
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnuncioBienvenida;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonIngresar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField Contraseña;
    private javax.swing.JTextField Contraseña1;
    private javax.swing.JTextField Contraseña2;
    private javax.swing.JLabel ImagenPerfil;
    private javax.swing.JLabel ImagenPerfil1;
    private javax.swing.JLabel LinkRegistro;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreRegistro;
    private javax.swing.JPanel PanelIngreso;
    private javax.swing.JPanel PanelRegistro;
    // End of variables declaration//GEN-END:variables
}
