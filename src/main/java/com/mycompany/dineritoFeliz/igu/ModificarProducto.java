
package com.mycompany.dineritoFeliz.igu;

import com.mycompany.dineritoFeliz.logica.Controladora;
import com.mycompany.dineritoFeliz.logica.Producto;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ModificarProducto extends javax.swing.JFrame {

    //Instancia para hacer la logica del programa 
    private Controladora control= null;
    private Producto producto;//Variable global 
    
    //Constructor que tiene el id del producto a modificar
    public ModificarProducto(int id_Producto) {
        this.control= new Controladora();
        initComponents();
        this.producto= new Producto();
        //Metodo que carga los datos del producto a modificar
        cargarDatos(id_Producto);
    }

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
        jLabel9 = new javax.swing.JLabel();
        cmbTipoProducto = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jdFechaExpiracion = new com.toedter.calendar.JDateChooser();
        jdFechaEntrega = new com.toedter.calendar.JDateChooser();

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
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        jLabel2.setText("Tipo de producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

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
        jPanel1.add(txtEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 80, -1));
        jPanel1.add(txtPrecioNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, -1));
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 80, -1));
        jPanel1.add(txtDistribuidora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, -1));

        jLabel9.setText("Distribuidora:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        cmbTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Abarrotes ", "Enlatados ", "Lacteos ", "Botanas ", "Dulcerio ", "Harinas y pan ", "Frutas y verduras ", "Bebidas ", "Bebidas Alcoholicas ", "Carnes y embutidos ", "Automedicacion ", "Higiene personal ", "Uso domestico ", "Otros ", " " }));
        jPanel1.add(cmbTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, 20));

        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));
        jPanel1.add(jdFechaExpiracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 130, -1));
        jPanel1.add(jdFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para guardar los cambios 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Recibiendo los datos ingresados de los Jtextfields
        String distribuidora =txtDistribuidora.getText();
        String nombre = txtNombre.getText();
        double precioNeto = Double.parseDouble(txtPrecioNeto.getText());
        double precioVenta = Double.parseDouble(txtPrecioVenta.getText());
        int ejemplares = Integer.parseInt(txtEjemplares.getText());
        Date fechaDeEntrega = jdFechaEntrega.getDate();
        Date fechaExpiracion = jdFechaExpiracion.getDate();
        
        //La controladora modificando el producto
        control.ModificarProducto(producto,nombre,precioNeto,precioVenta,ejemplares,fechaDeEntrega,fechaExpiracion,distribuidora);
        
        mostrarMensaje("Guardado de cambios exitoso", "informacion", "Guardando");
        
        //Volviendo a mostar la pantalla de inventario y cerrando esta ventana 
        Inventario i = new Inventario();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Metodo para limpiar los TextField
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
        txtDistribuidora.setText("");
        txtEjemplares.setText("");
        txtPrecioNeto.setText("");
        txtPrecioVenta.setText("");
        jdFechaEntrega.setDate(new Date());
        jdFechaExpiracion.setDate(new Date());
        txtNombre.setText("");
        cmbTipoProducto.setSelectedIndex(0);  
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Metodo que carga los datos del producto a editar 
    private void cargarDatos (int id_Producto){
        //Recuperando el producto a editar
        this.producto= control.traerProducto(id_Producto);
        
        //Poniendo los valores del producto a los TextFiels
        txtNombre.setText(producto.getNombre());
        txtPrecioNeto.setText(String.valueOf(producto.getPrecioNeto()));
        txtPrecioVenta.setText(String.valueOf( producto.getPrecioVenta()));
        txtEjemplares.setText(String.valueOf(producto.getEjempleares()));
        jdFechaEntrega.setDate(producto.getFechaEntrega());
        jdFechaExpiracion.setDate(producto.getFechaExpiracion());
        txtDistribuidora.setText(producto.getDistribuidora().getNomnre());
        
        
    }

    
    //Metodo para mostrar mensajes 
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equalsIgnoreCase("informacion")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equalsIgnoreCase("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbTipoProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdFechaEntrega;
    private com.toedter.calendar.JDateChooser jdFechaExpiracion;
    private javax.swing.JTextField txtDistribuidora;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioNeto;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
