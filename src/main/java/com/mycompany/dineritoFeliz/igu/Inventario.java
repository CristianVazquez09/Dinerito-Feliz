
package com.mycompany.dineritoFeliz.igu;

import com.mycompany.dineritoFeliz.logica.Controladora;
import com.mycompany.dineritoFeliz.logica.Producto;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inventario extends javax.swing.JFrame {

    //Instancia para hacer la logica del programa 
    private Controladora control = null;

    public Inventario() {
        this.control = new Controladora();
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(169, 215, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(169, 215, 241));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        tablaProductos.setBackground(new java.awt.Color(205, 233, 244));
        tablaProductos.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaProductos.setSelectionBackground(new java.awt.Color(0, 255, 255));
        jScrollPane1.setViewportView(tablaProductos);

        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 201, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 790, 470));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setText("INVENTARIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 191, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo que carga los datos cada vez que se abre la ventana 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Llamando al metodo que carga los datos de la base de datos 
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    //Boton para editar 
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Validando que la tabla tenga productos  
        if (tablaProductos.getRowCount() > 0) {
            //Validando que se haya seleccionado un producto de la tabla 
            if (tablaProductos.getSelectedRow() != -1) {
                //Obteniendo el id del producto a eliminar
                int id_Producto = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));
                //Creamos una instancia de un Jframe para editar los datos del producto selecionado 
                ModificarProducto modificar = new ModificarProducto(id_Producto);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);

                //Cerramos la ventana 
                this.dispose();

                //Mostrando mensajes 
            } else {
                mostrarMensaje("No se selecciono ningun producto ", "Error", "Error al eliminar");
            }
        } else {

            mostrarMensaje("No hay productos que editar", "Error", "NullPointerExcpetion");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    //Boton para  eliminar 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Validando que la tabla tenga productos
        if (tablaProductos.getRowCount() > 0) {
            //Controlar que se haya seleccionado un producto
            if (tablaProductos.getSelectedRow() != -1) {
                //Obteniendo el id del producto a eliminar
                int id_Producto = Integer.parseInt(String.valueOf(tablaProductos.getValueAt(tablaProductos.getSelectedRow(), 0)));
                //Lllamamos al metodo eliminar 
                control.eliminarProducto(id_Producto);

                //Mostramos mensaje que se elimino correctamente
                mostrarMensaje("Eliminado correctamente", "informacion", "Eliminando");
                //Actualizamos los datos 
                cargarDatos();

                
                //Mostranod mensajes 
            } else {
                mostrarMensaje("No se selecciono ningun producto", "Error", "Error al eliminar");
            }
        } else {

            mostrarMensaje("No hay productos que eliminar", "Error", "NullPointerExcpetion");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Metodo que carga los datos de la tabla 
    public void cargarDatos() {
        //Instancia de una tabla por defecto 
        DefaultTableModel tabla = new DefaultTableModel() {

            //Filas y columnas no editables 
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };

        //Nombres de los titulos
        String titulos[] = {"ID", "Nombre", "Precio Neto", "Precio de Venta", "Ejemplares", "Fecha de entrega", "Fecha de expiracion", "Distribuidora"};

        //Asignando los titulos de las columnas 
        tabla.setColumnIdentifiers(titulos);

        //Creando la lista que contiene todos los datos de la base de datos 
        List<Producto> listaProductos = control.traerProductos();
        if (!listaProductos.isEmpty()) {//Validando que la lista no este vacia 

            //Asignando todos los productos a una vector de objetos 
            for (Producto producto : listaProductos) {
                //Obteniendo los valores de producto 
                Object[] objeto = producto.traerDatos();

                //Asignando los datos del producto a la fila 
                tabla.addRow(objeto);

            }
        }

        //Asignanod el modelo de tabla 
        tablaProductos.setModel(tabla);
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
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
