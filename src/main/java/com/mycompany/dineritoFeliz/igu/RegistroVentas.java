package com.mycompany.dineritoFeliz.igu;

import com.mycompany.dineritoFeliz.logica.Controladora;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class RegistroVentas extends javax.swing.JFrame {

    //Instancia para hacer la logica del programa 
    private Controladora control = null;

    Mensaje mensaje = new Mensaje();

    public RegistroVentas() {
        initComponents();
        this.control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadVendida = new javax.swing.JTextField();
        txtProductoVendido = new javax.swing.JTextField();
        btnGuardarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 245, 226));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(50, 146, 202));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setText("Registro de Ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 50));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Cantidad Vendida:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Producto Vendido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 30));

        txtCantidadVendida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadVendidaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidadVendida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, -1));

        txtProductoVendido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductoVendidoKeyTyped(evt);
            }
        });
        jPanel1.add(txtProductoVendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, -1));

        btnGuardarVenta.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardarVenta.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGuardarVenta.setText("Guardar Venta");
        btnGuardarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo que guarad la venta realizada 
    private void btnGuardarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVentaActionPerformed

        if (estaVacio()) {
            mensaje.mostrarMensaje("No puedes dejar campos vacios", "advertencia", "Advertencia");
        } else {
            //Asignando los valores ingressados 
            String nombreProducto = txtProductoVendido.getText();
            int cantidadVendida = Integer.parseInt(txtCantidadVendida.getText());

            //Llamando a la controladora para registrar la venta 
            control.registarVenta(nombreProducto, cantidadVendida);
            //Mostrando mensaje 
            mensaje.mostrarMensaje("Se registro la venta correctamente", "informacion", "Guardado exitoso");
        }
    }//GEN-LAST:event_btnGuardarVentaActionPerformed

    private void txtCantidadVendidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadVendidaKeyTyped
        // Obtiene el carácter de la tecla presionada
        char key = evt.getKeyChar();

        // Verifica si el carácter presionado no es un dígito numérico, un punto decimal ni la tecla de retroceso (borrar)
        if (!Character.isDigit(key) && key != KeyEvent.VK_BACK_SPACE) {
            // Si no es un dígito numérico ni retroceso, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("Solo puedes ingresar numeros en la cantidad vendida", "error", "ERROR");
            // Si la tecla presionada es un 0
        } else if (key == '0') {

            if (txtCantidadVendida.getText().isEmpty() || txtCantidadVendida.getCaretPosition() == 0) {
                // Si el campo está vacío o el "0" está al principio, consume el evento
                evt.consume();
                mensaje.mostrarMensaje("No puedes vender la cantidad de 0 productos", "error", "ERROR");
            }
        } else {
            // Verifica si ya hay algún carácter distinto de "0" ingresado
            if (txtCantidadVendida.getText().startsWith("0")) {
                // Si hay un "0" al principio, reemplázalo con el nuevo carácter ingresado
                txtCantidadVendida.setText(String.valueOf(key));
                // Posiciona el cursor al final del texto
                txtCantidadVendida.setCaretPosition(txtCantidadVendida.getText().length());
            }
        }

    }//GEN-LAST:event_txtCantidadVendidaKeyTyped

    private void txtProductoVendidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductoVendidoKeyTyped
        // Inicializa una variable para contar el número de espacios en blanco.
        int spaceCount = 0;

        // Recorre cada caracter en el texto del campo txtNombre.
        for (int i = 0; i < txtProductoVendido.getText().length(); i++) {
            // Si el caracter actual es un espacio en blanco, incrementa el contador.
            if (txtProductoVendido.getText().charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Verifica si el caracter ingresado no es una letra, ni la tecla de espacio, ni la tecla de retroceso.
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            // Consumir el evento para evitar que el caracter no deseado sea mostrado en el campo. Y mostrar mensaje
            evt.consume();
            mensaje.mostrarMensaje("No puedes ingresar caracteres especiales al nombre de un producto", "error", "ERROR");
        } else if (spaceCount >= 5) {
            // Si se han ingresado más de 5 espacios en blanco en el texto, consumir el evento y mostrar un mensaje de error.
            evt.consume();
            mensaje.mostrarMensaje("No puedes ingresar más de 5 espacios en blanco", "error", "ERROR");
        }
    }//GEN-LAST:event_txtProductoVendidoKeyTyped

    private boolean estaVacio() {
        // Variable para indicar si hay campos de texto vacíos.
        boolean vacias = false;
        // Array de campos de texto que se desean validar.
        JTextField[] camposTexto = {txtCantidadVendida, txtProductoVendido};

        // Recorre cada campo de texto en el array.
        for (JTextField campo : camposTexto) {
            // Verifica si el campo de texto está vacío después de eliminar espacios en blanco.
            if (campo.getText().trim().isEmpty()) {
                vacias = true;
            }
        }
        // Retorna el valor de la variable "vacias".
        return vacias;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCantidadVendida;
    private javax.swing.JTextField txtProductoVendido;
    // End of variables declaration//GEN-END:variables
}
