
package com.mycompany.dineritoFeliz.igu;

import com.mycompany.dineritoFeliz.logica.Controladora;

public class Informes extends javax.swing.JFrame {

    /**
     * Creates new form Informes
     */
    //Instancia para hacer la logica del programa 
    private Controladora control=null;
    public Informes() {
        control= new Controladora();
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        lblIngresosGenerados = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        lblProductoMasVendido = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        lblProductoMenosVendido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(25, 75, 124));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORME DE VENTAS ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 240, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Producto menos vendido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 170, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Producto mas vendido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 150, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresos Generados");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jToolBar1.setRollover(true);

        lblIngresosGenerados.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblIngresosGenerados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresosGenerados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToolBar1.add(lblIngresosGenerados);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 130, 30));

        jToolBar2.setRollover(true);

        lblProductoMasVendido.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblProductoMasVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductoMasVendido.setToolTipText("");
        jToolBar2.add(lblProductoMasVendido);

        jPanel1.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, 30));

        jToolBar3.setRollover(true);

        lblProductoMenosVendido.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblProductoMenosVendido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductoMenosVendido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToolBar3.add(lblProductoMenosVendido);

        jPanel1.add(jToolBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Vector que contiene los datos de el informe de ventas 
        String [] ventas=control.informeDeVentas();
        
        //Asignando los valores a los TextField
        //txtIngresosGenerados.setText(ventas[0]);
        lblIngresosGenerados.setText(ventas[0]);
        //txtProducMasVendido.setText(ventas[1]);
        lblProductoMasVendido.setText(ventas[1]);
        //txtProducMenosVendido.setText(ventas[2]);
        lblProductoMenosVendido.setText(ventas[2]);
    }//GEN-LAST:event_formWindowOpened



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JLabel lblIngresosGenerados;
    private javax.swing.JLabel lblProductoMasVendido;
    private javax.swing.JLabel lblProductoMenosVendido;
    // End of variables declaration//GEN-END:variables
}
