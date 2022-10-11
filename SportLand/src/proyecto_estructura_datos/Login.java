package proyecto_estructura_datos;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    private ArrayList cuentasN;
    private ArrayList cuentasE;
    private Validacion v;
    public Login() {
        setResizable(false);
        cuentasN=new ArrayList();
        cuentasE=new ArrayList();
        v = new Validacion();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        cuadroUsuario = new javax.swing.JTextField();
        cuadroClave = new javax.swing.JTextField();
        botonEntrar = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1.setBackground(new java.awt.Color(0, 0, 204));

        cuadroUsuario.setBackground(java.awt.Color.darkGray);
        cuadroUsuario.setForeground(java.awt.Color.white);
        cuadroUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        cuadroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadroUsuarioMouseClicked(evt);
            }
        });
        cuadroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroUsuarioActionPerformed(evt);
            }
        });
        cuadroUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadroUsuarioKeyTyped(evt);
            }
        });

        cuadroClave.setBackground(java.awt.Color.darkGray);
        cuadroClave.setForeground(java.awt.Color.white);
        cuadroClave.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        cuadroClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroClaveActionPerformed(evt);
            }
        });

        botonEntrar.setText("Entrar");
        botonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonEntrarMouseEntered(evt);
            }
        });
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        botonRegistrarse.setForeground(java.awt.Color.white);
        botonRegistrarse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuadroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(p1Layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(cuadroClave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(cuadroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cuadroClave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(botonEntrar)
                .addGap(50, 50, 50)
                .addComponent(botonRegistrarse)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void cuadroClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroClaveActionPerformed

    private void cuadroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroUsuarioActionPerformed

    private void botonRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarseMouseClicked
        Formulario_Inscripcion formulario;
        try {
            formulario = new Formulario_Inscripcion();
            formulario.setVisible(true);
            dispose();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ups, algo paso\n" + ex);
        }
        
    }//GEN-LAST:event_botonRegistrarseMouseClicked

    private void cuadroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroUsuarioMouseClicked

    private void cuadroUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroUsuarioKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cuadroUsuarioKeyTyped

    private void botonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseClicked
        
                    Menu_Empresarial ventana = new Menu_Empresarial();
                    ventana.setVisible(true);
                    dispose();
             
    }//GEN-LAST:event_botonEntrarMouseClicked

    private void botonEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEntrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEntrarMouseEntered

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JLabel botonRegistrarse;
    private javax.swing.JTextField cuadroClave;
    private javax.swing.JTextField cuadroUsuario;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables
}
