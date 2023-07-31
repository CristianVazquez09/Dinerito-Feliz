/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dineritoFeliz.igu;

/**
 *
 * @author malaf
 */
public class IngresarProductos extends javax.swing.JFrame {

    /**
     * Creates new form IngresarProductos
     */
    public IngresarProductos() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEjemplares = new javax.swing.JTextField();
        txtPrecioNeto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        txtDistribuidora = new javax.swing.JTextField();
        txtFechaEntrega = new javax.swing.JTextField();
        txtFechaExp = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 233, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(169, 215, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Productos ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        jLabel2.setText("Distribuidora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel3.setText("Precio de venta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setText("Precio neto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel6.setText("Ejemplares:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setText("Fecha de entrega:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel8.setText("Fecha de expiración:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 180, -1));

        txtEjemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEjemplaresActionPerformed(evt);
            }
        });
        jPanel1.add(txtEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, -1));
        jPanel1.add(txtPrecioNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, -1));
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 80, -1));
        jPanel1.add(txtDistribuidora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, -1));
        jPanel1.add(txtFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 110, -1));
        jPanel1.add(txtFechaExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEjemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEjemplaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEjemplaresActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDistribuidora;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaExp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioNeto;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
