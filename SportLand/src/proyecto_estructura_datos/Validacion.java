package proyecto_estructura_datos;


import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Validacion {

    public Validacion() {
    }

    public void sinNumeros(JTextField a, KeyEvent ke) {
        if (ke.getSource().equals(a)) {
            char val = ke.getKeyChar();
            if (Character.isDigit(val)) {
                ke.consume();
            }
        }
    }

    public void soloNumeros(JTextField a, KeyEvent ke) {
        if (ke.getSource().equals(a)) {
            char val = ke.getKeyChar();
            if (!Character.isDigit(val)) {
                ke.consume();
            }
        }
    }

    public boolean campoObligatorio(JTextField a) {
        if (a.getText().trim().isEmpty()) {
            a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED),a.getName()+ " *", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.RED));
            return true;
        } else {
            a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), a.getName(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.WHITE));
        }
        return false;
    }
    
    public boolean campoObligatorio(JTextArea a) {
        if (a.getText().trim().isEmpty()) {
            a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED),a.getName()+ " *", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.RED));
            return true;
        } else {
            a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), a.getName(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.WHITE));
        }
        return false;
    }
    
    public void alerta(JTextField a){
        a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED),a.getName()+ " *", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.RED));
    }

    public void resetDesign(JTextField a){
        a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), a.getName(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.WHITE));
    }
    
    public void resetDesign(JComboBox a){
        a.setBackground(Color.white);
    }
    
    public void resetDesign(JTextArea a){
        a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), a.getName(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.WHITE));
    }
    
    public boolean campoObligatorio(JPasswordField a) {
        if (a.getPassword().length==0) {
            a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED),a.getName()+ " *", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.RED));
            return true;
        } else {
            a.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), a.getName(), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), java.awt.Color.WHITE));
        }
        return false;
    }
    
    public boolean seleccionlista(JList a){
        if(a.getSelectedValuesList().size()==0){
            return true;
        }
        return false;
    }

}
