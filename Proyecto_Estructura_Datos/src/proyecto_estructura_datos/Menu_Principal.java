/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_estructura_datos;

import java.awt.Color;

public class Menu_Principal extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public Menu_Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        Pflitros = new javax.swing.JPanel();
        Flitros = new javax.swing.JLabel();
        Psalir = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Mover = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1024, 680));
        setResizable(false);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setPreferredSize(new java.awt.Dimension(1360, 700));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("SportLand");
        Background.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 170, 40));

        Buscador.setBackground(new java.awt.Color(0, 0, 0));
        Buscador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Buscador.setForeground(new java.awt.Color(204, 204, 204));
        Buscador.setText("Buscar");
        Buscador.setBorder(null);
        Buscador.setCaretColor(new java.awt.Color(242, 242, 242));
        Buscador.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        Background.add(Buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 500, 20));

        Pflitros.setBackground(new java.awt.Color(23, 70, 93));

        Flitros.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Flitros.setText("Ordenar por");
        Flitros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PflitrosLayout = new javax.swing.GroupLayout(Pflitros);
        Pflitros.setLayout(PflitrosLayout);
        PflitrosLayout.setHorizontalGroup(
            PflitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PflitrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Flitros)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        PflitrosLayout.setVerticalGroup(
            PflitrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PflitrosLayout.createSequentialGroup()
                .addComponent(Flitros)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(Pflitros, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, -1));

        Psalir.setBackground(new java.awt.Color(255, 255, 255));

        Salir.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("x");
        Salir.setToolTipText("");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PsalirLayout = new javax.swing.GroupLayout(Psalir);
        Psalir.setLayout(PsalirLayout);
        PsalirLayout.setHorizontalGroup(
            PsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PsalirLayout.createSequentialGroup()
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addContainerGap())
        );
        PsalirLayout.setVerticalGroup(
            PsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Background.add(Psalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 40));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/michael-jordan-logo-2659.jpeg"))); // NOI18N
        Fondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Background.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 680));

        Mover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoverMouseDragged(evt);
            }
        });
        Mover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MoverLayout = new javax.swing.GroupLayout(Mover);
        Mover.setLayout(MoverLayout);
        MoverLayout.setHorizontalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        MoverLayout.setVerticalGroup(
            MoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Background.add(Mover, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMousePressed
        System.exit(0);
    }//GEN-LAST:event_SalirMousePressed

    private void MoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoverMousePressed

    private void MoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoverMouseDragged

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Psalir.setBackground(Color.red);
        Salir.setForeground(Color.white);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Psalir.setBackground(Color.white);
        Salir.setForeground(Color.black);
    }//GEN-LAST:event_SalirMouseExited

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JTextField Buscador;
    private javax.swing.JLabel Flitros;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel Mover;
    private javax.swing.JPanel Pflitros;
    private javax.swing.JPanel Psalir;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}