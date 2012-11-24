/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apmanager.ui.components;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ADMIN
 */
public class CellRender extends javax.swing.JPanel implements TableCellRenderer {

    /**
     * Creates new form CellRender
     */
    public CellRender() {
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

        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(46, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getTableCellRendererComponent(
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (hasFocus) {
            this.setBackground(new Color(230, 210, 120));
        } else if (isSelected) {
            this.setBackground(new Color(240, 230, 140));
        } else {
            this.setBackground(Color.WHITE);
        }
        if (value != null) {
            this.jLabel1.setText(value.toString());
        } else {
            this.jLabel1.setText("");
        }
        
        return this;
    }
}
