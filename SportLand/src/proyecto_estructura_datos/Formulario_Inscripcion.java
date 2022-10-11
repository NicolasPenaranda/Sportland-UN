package proyecto_estructura_datos;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Formulario_Inscripcion extends javax.swing.JFrame {
    
    private Validacion v;
    
    public Formulario_Inscripcion() throws IOException {
        v = new Validacion();
        initComponents();
        
        cargarDepartamentos();
        cargarUsuariosCorreos("Cuentas Normales.csv");
        cargarUsuariosCorreos("Cuentas Empresariales.csv");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        identificacion = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        confirmacionClave = new javax.swing.JPasswordField();
        correo = new javax.swing.JTextField();
        mesesExp = new javax.swing.JTextField();
        Celular = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        genero = new javax.swing.JComboBox<>();
        tipoCuenta = new javax.swing.JComboBox<>();
        tipoDocumento = new javax.swing.JComboBox<>();
        titulo = new javax.swing.JLabel();
        departamento = new javax.swing.JComboBox<>();
        municipio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        nombre.setEditable(false);
        nombre.setBackground(java.awt.Color.darkGray);
        nombre.setForeground(java.awt.Color.white);
        nombre.setText("CASILLA BLOQUEADA");
        nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        nombre.setPreferredSize(new java.awt.Dimension(125, 40));
        nombre.setName("Nombre");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(nombre, gridBagConstraints);

        apellido.setEditable(false);
        apellido.setBackground(java.awt.Color.darkGray);
        apellido.setForeground(java.awt.Color.white);
        apellido.setText("CASILLA BLOQUEADA");
        apellido.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Apellido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        apellido.setPreferredSize(new java.awt.Dimension(125, 40));
        apellido.setName("Apellido");
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(apellido, gridBagConstraints);

        edad.setEditable(false);
        edad.setBackground(java.awt.Color.darkGray);
        edad.setForeground(java.awt.Color.white);
        edad.setText("CASILLA BLOQUEADA");
        edad.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Edad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        edad.setPreferredSize(new java.awt.Dimension(125, 40));
        edad.setName("Edad");
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(edad, gridBagConstraints);

        identificacion.setEditable(false);
        identificacion.setBackground(java.awt.Color.darkGray);
        identificacion.setForeground(java.awt.Color.white);
        identificacion.setText("CASILLA BLOQUEADA");
        identificacion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Identificacion", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        identificacion.setPreferredSize(new java.awt.Dimension(125, 40));
        identificacion.setName("Identificacion");
        identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificacionActionPerformed(evt);
            }
        });
        identificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                identificacionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(identificacion, gridBagConstraints);

        usuario.setEditable(false);
        usuario.setBackground(java.awt.Color.darkGray);
        usuario.setForeground(java.awt.Color.white);
        usuario.setText("CASILLA BLOQUEADA");
        usuario.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        usuario.setPreferredSize(new java.awt.Dimension(125, 40));
        usuario.setName("Usuario");
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(usuario, gridBagConstraints);

        clave.setEditable(false);
        clave.setBackground(java.awt.Color.darkGray);
        clave.setForeground(java.awt.Color.white);
        clave.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        clave.setPreferredSize(new java.awt.Dimension(125, 40));
        clave.setName("Contraseña");
        clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveActionPerformed(evt);
            }
        });
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                claveKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(clave, gridBagConstraints);

        confirmacionClave.setEditable(false);
        confirmacionClave.setBackground(java.awt.Color.darkGray);
        confirmacionClave.setForeground(java.awt.Color.white);
        confirmacionClave.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Confirmar Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        confirmacionClave.setPreferredSize(new java.awt.Dimension(125, 40));
        confirmacionClave.setName("Confirmacion Contraseña");
        confirmacionClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacionClaveActionPerformed(evt);
            }
        });
        confirmacionClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmacionClaveKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(confirmacionClave, gridBagConstraints);

        correo.setEditable(false);
        correo.setBackground(java.awt.Color.darkGray);
        correo.setForeground(java.awt.Color.white);
        correo.setText("CASILLA BLOQUEADA");
        correo.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Correo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        correo.setPreferredSize(new java.awt.Dimension(125, 40));
        correo.setName("Correo");
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(correo, gridBagConstraints);

        mesesExp.setEditable(false);
        mesesExp.setBackground(java.awt.Color.darkGray);
        mesesExp.setForeground(java.awt.Color.white);
        mesesExp.setText("CASILLA BLOQUEADA");
        mesesExp.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Meses de Experiencia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        mesesExp.setPreferredSize(new java.awt.Dimension(125, 40));
        mesesExp.setName("Meses de Experiencia");
        mesesExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesesExpActionPerformed(evt);
            }
        });
        mesesExp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mesesExpKeyTyped(evt);
            }
        });
        mesesExp.setVisible(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(mesesExp, gridBagConstraints);

        Celular.setEditable(false);
        Celular.setBackground(java.awt.Color.darkGray);
        Celular.setForeground(java.awt.Color.white);
        Celular.setText("CASILLA BLOQUEADA");
        Celular.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Numero Celular", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), java.awt.Color.white)); // NOI18N
        Celular.setPreferredSize(new java.awt.Dimension(125, 40));
        Celular.setName("Numero celular");
        Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelularActionPerformed(evt);
            }
        });
        Celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CelularKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.ipady = -1;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(Celular, gridBagConstraints);

        botonRegistrar.setBackground(java.awt.Color.darkGray);
        botonRegistrar.setForeground(java.awt.Color.white);
        botonRegistrar.setText("Registrarse");
        botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseClicked(evt);
            }
        });
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(botonRegistrar, gridBagConstraints);

        botonVolver.setBackground(java.awt.Color.darkGray);
        botonVolver.setForeground(java.awt.Color.white);
        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(botonVolver, gridBagConstraints);

        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Masculino", "Femenino" }));
        genero.setEnabled(false);
        genero.setPreferredSize(new java.awt.Dimension(125, 40));
        genero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                generoItemStateChanged(evt);
            }
        });
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 111;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(genero, gridBagConstraints);

        tipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de cuenta", "Empresarial", "Normal" }));
        tipoCuenta.setPreferredSize(new java.awt.Dimension(125, 40));
        tipoCuenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoCuentaItemStateChanged(evt);
            }
        });
        tipoCuenta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tipoCuentaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCuentaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(tipoCuenta, gridBagConstraints);

        tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de documento", "Cedula", "Registro Civil", "Cedula de Extranjeria", "Tarjeta de Extranjeria" }));
        tipoDocumento.setEnabled(false);
        tipoDocumento.setPreferredSize(new java.awt.Dimension(125, 40));
        tipoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoDocumentoItemStateChanged(evt);
            }
        });
        tipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoDocumentoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(tipoDocumento, gridBagConstraints);

        titulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulo.setText("Formulario de inscripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(titulo, gridBagConstraints);

        departamento.setPreferredSize(new java.awt.Dimension(125, 40));
        departamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departamentoItemStateChanged(evt);
            }
        });
        departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departamentoMouseClicked(evt);
            }
        });
        departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(departamento, gridBagConstraints);

        municipio.setPreferredSize(new java.awt.Dimension(125, 40));
        municipio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                municipioItemStateChanged(evt);
            }
        });
        municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(municipio, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        v.sinNumeros(nombre, evt);
        v.resetDesign(nombre);
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        v.sinNumeros(apellido, evt);
        v.resetDesign(apellido);
    }//GEN-LAST:event_apellidoKeyTyped

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyTyped
       v.soloNumeros(edad, evt);
       v.resetDesign(edad);
    }//GEN-LAST:event_edadKeyTyped

    private void identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identificacionActionPerformed

    private void identificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_identificacionKeyTyped
        v.soloNumeros(identificacion, evt);
        v.resetDesign(identificacion);
    }//GEN-LAST:event_identificacionKeyTyped

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        v.resetDesign(usuario);
    }//GEN-LAST:event_usuarioKeyTyped

    private void claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void mesesExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesesExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesesExpActionPerformed

    private void mesesExpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesesExpKeyTyped
        v.soloNumeros(mesesExp, evt);
        v.resetDesign(mesesExp);
    }//GEN-LAST:event_mesesExpKeyTyped

    private void CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularActionPerformed

    private void CelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularKeyTyped
        v.soloNumeros(Celular, evt);
        v.resetDesign(Celular);
    }//GEN-LAST:event_CelularKeyTyped

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed

    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        Login a = new Login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void generoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_generoItemStateChanged
        v.resetDesign(genero);
    }//GEN-LAST:event_generoItemStateChanged

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void tipoCuentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoCuentaItemStateChanged
        resetDesignAll();
        tipoDocumento.removeAllItems();
        
        String s = (String)evt.getItem();
        if(s.equals("Empresarial")){
            nombre.setText("");
            identificacion.setText("");
            Celular.setText("");
            correo.setText("");
            usuario.setText("");
            clave.setText("");
            confirmacionClave.setText("");
            apellido.setText("CASILLA BLOQUEADA");
            edad.setText("CASILLA BLOQUEADA");
            mesesExp.setText("CASILLA BLOQUEADA");
            nombre.setEditable(true);
            nombre.setEditable(true);
            apellido.setEditable(false);
            identificacion.setEditable(true);
            edad.setEditable(false);
            mesesExp.setEditable(false);
            Celular.setEditable(true);
            correo.setEditable(true);
            usuario.setEditable(true);
            clave.setEditable(true);
            confirmacionClave.setEditable(true);
            tipoDocumento.addItem("Seleccione");
            tipoDocumento.addItem("NIT");
            tipoDocumento.setEnabled(true);
            genero.setEnabled(false);
        }else if(s.equals("Normal")){
            nombre.setText("");
            apellido.setText("");
            identificacion.setText("");
            edad.setText("");
            mesesExp.setText("");
            Celular.setText("");
            correo.setText("");
            usuario.setText("");
            clave.setText("");
            confirmacionClave.setText("");
            nombre.setEditable(true);
            apellido.setEditable(true);
            identificacion.setEditable(true);
            edad.setEditable(true);
            mesesExp.setEditable(true);
            Celular.setEditable(true);
            correo.setEditable(true);
            usuario.setEditable(true);
            clave.setEditable(true);
            confirmacionClave.setEditable(true);
            tipoDocumento.addItem("Tipo de documento");
            tipoDocumento.addItem("Cedula");
            tipoDocumento.addItem("Registro Civil");
            tipoDocumento.addItem("Cedula de Extranjeria");
            tipoDocumento.addItem("Tarjeta de Extranjeria"); 
            tipoDocumento.setEnabled(true);
            genero.setEnabled(true);
        }else if(s.equals("Tipo de cuenta")){
            nombre.setText("CASILLA BLOQUEADA");
            apellido.setText("CASILLA BLOQUEADA");
            identificacion.setText("CASILLA BLOQUEADA");
            edad.setText("CASILLA BLOQUEADA");
            mesesExp.setText("CASILLA BLOQUEADA");
            Celular.setText("CASILLA BLOQUEADA");
            correo.setText("CASILLA BLOQUEADA");
            usuario.setText("CASILLA BLOQUEADA");
            clave.setText("");
            confirmacionClave.setText("");
            nombre.setEditable(false);
            apellido.setEditable(false);
            identificacion.setEditable(false);
            edad.setEditable(false);
            mesesExp.setEditable(false);
            Celular.setEditable(false);
            correo.setEditable(false);
            usuario.setEditable(false);
            clave.setEditable(false);
            confirmacionClave.setEditable(false);
            tipoDocumento.setEnabled(false);
            genero.setEnabled(false);
        }
    }//GEN-LAST:event_tipoCuentaItemStateChanged

    private void tipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCuentaActionPerformed

    private void tipoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoDocumentoItemStateChanged
        // TODO add your handling code here:
        v.resetDesign(tipoDocumento);
    }//GEN-LAST:event_tipoDocumentoItemStateChanged

    private void tipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoDocumentoActionPerformed

    private void confirmacionClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacionClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmacionClaveActionPerformed

    private void departamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departamentoItemStateChanged
        // TODO add your handling code here:
        cargarMunicipios((String) evt.getItem());
        v.resetDesign(departamento);
    }//GEN-LAST:event_departamentoItemStateChanged

    private void departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departamentoActionPerformed

    private void municipioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_municipioItemStateChanged
        // TODO add your handling code here:
        v.resetDesign(municipio);
    }//GEN-LAST:event_municipioItemStateChanged

    private void municipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipioActionPerformed

    private void tipoCuentaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tipoCuentaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCuentaAncestorAdded

    private void departamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_departamentoMouseClicked

    private void botonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseClicked
        if(tipoCuenta.getSelectedItem().equals("Tipo de cuenta")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de cuenta para poder llenar el formulario.");
            return;
        }
        boolean a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14;
        a1=a2=a3=a4=a5=a6=a7=a8=a9=a10=a11=a12=a13=a14 = false;
        if(tipoCuenta.getSelectedItem().equals("Normal")){
            a1 = v.campoObligatorio(nombre);
            a2 = v.campoObligatorio(apellido);
            a3 = v.seleccionCombo(tipoDocumento);
            a4 = v.campoObligatorio(identificacion);
            a5 = v.campoObligatorio(edad);
            a6 = v.seleccionCombo(departamento);
            a7 = v.seleccionCombo(municipio);
            a8 = v.campoObligatorio(Celular);
            a9 = v.seleccionCombo(genero);
            a10 = v.campoObligatorio(correo);
            a11 = v.campoObligatorio(usuario);
            a12 = v.campoObligatorio(clave);
            a13 = v.campoObligatorio(confirmacionClave);
            a14 = v.campoObligatorio(mesesExp);
        }else if(tipoCuenta.getSelectedItem().equals("Empresarial")){
            a1 = v.campoObligatorio(nombre);
            a2 = v.seleccionCombo(tipoDocumento);
            a3 = v.campoObligatorio(identificacion);
            a4 = v.seleccionCombo(departamento);
            a5 = v.seleccionCombo(municipio);
            a6 = v.campoObligatorio(Celular);
            a7 = v.campoObligatorio(correo);
            a8 = v.campoObligatorio(usuario);
            a9 = v.campoObligatorio(clave);
            a10 = v.campoObligatorio(confirmacionClave);
        }
        if ((a1 || a2 || a3 || a4 || a5 || a6 || a7 || a8 || a9 || a10 || a12   || a11 || a13 || a14)) {
            JOptionPane.showMessageDialog(null, "Revise los datos digitados anteriormente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else if (!(clave.getText().equals(confirmacionClave.getText()))) {
            v.alerta(clave);
            v.alerta(confirmacionClave);
            JOptionPane.showMessageDialog(null, "Revise la contraseña ingresada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else if(usuarios.contains(usuario.getText())){
            v.alerta(usuario);
            JOptionPane.showMessageDialog(null, "USUARIO YA EXISTE.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else if(correos.contains(correo.getText())){
            v.campoObligatorio(correo);
            JOptionPane.showMessageDialog(null, "CORREO YA EXISTE.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            
            if(tipoCuenta.getSelectedItem().equals("Normal")){
                try {
                    String datos = cargarDatos("Cuentas Normales.csv");
                    Cuenta newCuenta = crearCuentaNormal();
                    cuentas.add(newCuenta);
                    usuarios.add(newCuenta.getUsuario());
                    correos.add(newCuenta.getClave());
                    datos += newCuenta.toString() + "\n";
                    escribirDatos("Cuentas Normales.csv", datos);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cargue de departamentos y municipios fallido.\n" + ex);
                }
            }else if(tipoCuenta.getSelectedItem().equals("Empresarial")){
                try {
                    String datos = cargarDatos("Cuentas Empresariales.csv");
                    Cuenta newCuenta = crearCuentaEmpresarial();
                    cuentas.add(newCuenta);
                    usuarios.add(newCuenta.getUsuario());
                    correos.add(newCuenta.getClave());
                    datos += newCuenta.toString() + "\n";
                    escribirDatos("Cuentas Empresariales.csv", datos);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Cargue de departamentos y municipios fallido.\n" + ex);
                }
            }
            
            JOptionPane.showMessageDialog(null, "USUARIO REGISTRADO EXITOSAMENTE.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            Login a = new Login();
            a.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonRegistrarMouseClicked

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
        v.resetDesign(correo);
    }//GEN-LAST:event_correoKeyTyped

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioKeyReleased

    private void claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyTyped
        // TODO add your handling code here:
        v.resetDesign(clave);
    }//GEN-LAST:event_claveKeyTyped

    private void confirmacionClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmacionClaveKeyTyped
        // TODO add your handling code here:
        v.resetDesign(confirmacionClave);
    }//GEN-LAST:event_confirmacionClaveKeyTyped
    
    public void escribirDatos(String path, String datos) throws IOException{
        try{
            FileWriter writer= new FileWriter(path);
            writer.write(datos);
//            System.out.println(datos);
            writer.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Cargue de datos fallido.\n" + e);
        }
        
                
    }
    
    public Empresarial crearCuentaEmpresarial(){
        return new Empresarial(new Empresa(nombre.getText(),tipoDocumento.getSelectedItem()+"",departamento.getSelectedItem()+"",municipio.getSelectedItem()+"",Long.parseLong(Celular.getText())), correo.getText(), usuario.getText(), clave.getText());
    }
    
    public Normal crearCuentaNormal(){
        return new Normal( new Persona( nombre.getText(),apellido.getText(),tipoDocumento.getSelectedItem().toString(),Long.parseLong(identificacion.getText()),Integer.parseInt(edad.getText()),Integer.parseInt(mesesExp.getText()),departamento.getSelectedItem().toString(),municipio.getSelectedItem().toString(),Long.parseLong(Celular.getText()) ), correo.getText(), usuario.getText(), clave.getText());
    }
    
    public void resetDesignAll(){
        v.resetDesign(nombre);
        v.resetDesign(apellido);
        v.resetDesign(identificacion);
        v.resetDesign(edad);
        v.resetDesign(mesesExp);
        v.resetDesign(Celular);
        v.resetDesign(correo);
        v.resetDesign(usuario);
        v.resetDesign(clave);
        v.resetDesign(confirmacionClave);
    }
    
    public String cargarDatos(String path){
        String datos = "";
        try{
            BufferedReader cargar = new BufferedReader(new FileReader(path));
            String line = null;
            while((line = cargar.readLine()) != null){
                datos += line + "\n";
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Cargue de departamentos y municipios fallido.\n" + e);
        }
        return datos;
    }
    
    private TreeMap<String, ArrayList<String>> listadoDepartamentos = new TreeMap<>();
    
    public void cargarDepartamentos() throws FileNotFoundException, IOException{
        try{
            BufferedReader cargar = new BufferedReader(new FileReader("Municipios_por_departamento.csv"));
            String s = cargar.readLine();
            while(s != null){
                String datos[] = s.split(",");
                if(listadoDepartamentos.containsKey(datos[0])){
                    listadoDepartamentos.get(datos[0]).add(datos[1]);
                }else{
                    listadoDepartamentos.put(datos[0], new ArrayList<>());
                    listadoDepartamentos.get(datos[0]).add(datos[1]);
                }
                s = cargar.readLine();
            }
            departamento.addItem("Departamento");
            for(Map.Entry<String, ArrayList<String>> it : listadoDepartamentos.entrySet()){
                departamento.addItem(it.getKey());
            }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Cargue de departamentos y municipios fallido.\n" + e);
        }
    }
    
    public void cargarMunicipios(String _departamento){
        municipio.removeAllItems();
        municipio.addItem("municipio");
        if(listadoDepartamentos.containsKey(_departamento)){
            ArrayList<String> municipios = listadoDepartamentos.get(_departamento);
            for (int i = 0; i < municipios.size(); i++) {
                municipio.addItem(municipios.get(i));
            }
        }
    }
    
    protected ArrayList<Cuenta> cuentas = new ArrayList<>();
    protected TreeSet<String> usuarios = new TreeSet<>(), correos = new TreeSet<>();
    public void cargarUsuariosCorreos(String path){
        try{
            BufferedReader cargar = new BufferedReader(new FileReader(path));
            String s = null;
            while((s = cargar.readLine()) != null){
//                System.out.println(s);
                String temp[] = s.split(",");
                Cuenta x = new Cuenta(temp[0],temp[1],temp[2]);
                x.tipoCuenta = Boolean.parseBoolean(temp[3]);
//                System.out.println(x.tipoCuenta);
                cuentas.add(x);
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Archivo no encontrado.\n" + e);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Formulario_Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Inscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Formulario_Inscripcion().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Formulario_Inscripcion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JPasswordField clave;
    private javax.swing.JPasswordField confirmacionClave;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox<String> departamento;
    private javax.swing.JTextField edad;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JTextField identificacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mesesExp;
    private javax.swing.JComboBox<String> municipio;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> tipoCuenta;
    private javax.swing.JComboBox<String> tipoDocumento;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
