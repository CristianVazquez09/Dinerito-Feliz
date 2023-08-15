package com.mycompany.dineritoFeliz.igu;

import com.mycompany.dineritoFeliz.logica.Controladora;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class IngresarProductos extends javax.swing.JFrame {

    //Instancia para hacer la logica del programa 
    private Controladora control = null;
    Mensaje mensaje = new Mensaje();

    public IngresarProductos() {
        this.control = new Controladora();

        initComponents();
        
        ponerInvisiblelbl();
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
        lblCampObli3 = new javax.swing.JLabel();
        lblCampObli1 = new javax.swing.JLabel();
        lblCampObli2 = new javax.swing.JLabel();
        lblCampObli4 = new javax.swing.JLabel();
        lblCampObli5 = new javax.swing.JLabel();
        lblCampObli6 = new javax.swing.JLabel();
        lblCampObli7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(205, 233, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(169, 215, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Productos ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("Tipo de producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Precio de venta:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel5.setText("Precio neto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setText("Ejemplares:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel7.setText("Fecha de entrega:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de expiración:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, -1));

        txtEjemplares.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEjemplaresKeyTyped(evt);
            }
        });
        jPanel1.add(txtEjemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 170, -1));

        txtPrecioNeto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioNetoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, -1));

        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, -1));

        txtDistribuidora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistribuidoraKeyTyped(evt);
            }
        });
        jPanel1.add(txtDistribuidora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 120, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel9.setText("Distribuidora:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        cmbTipoProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Abarrotes ", "Enlatados ", "Lacteos ", "Botanas ", "Dulcerio ", "Harinas y pan ", "Frutas y verduras ", "Bebidas ", "Bebidas Alcoholicas ", "Carnes y embutidos ", "Automedicacion ", "Higiene personal ", "Uso domestico ", "Otros ", " " }));
        jPanel1.add(cmbTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, 20));

        btnGuardar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 100, 40));

        btnLimpiar.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 100, 40));
        jPanel1.add(jdFechaExpiracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, -1));
        jPanel1.add(jdFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 140, -1));

        lblCampObli3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli3.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli3.setText("campo obligatorio *");
        lblCampObli3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, 20));

        lblCampObli1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli1.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli1.setText("campo obligatorio *");
        lblCampObli1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 100, 20));

        lblCampObli2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli2.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli2.setText("campo obligatorio *");
        lblCampObli2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, 20));

        lblCampObli4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli4.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli4.setText("campo obligatorio *");
        lblCampObli4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 100, 20));

        lblCampObli5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli5.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli5.setText("campo obligatorio *");
        lblCampObli5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 100, 20));

        lblCampObli6.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli6.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli6.setText("campo obligatorio *");
        lblCampObli6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 100, 20));

        lblCampObli7.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCampObli7.setForeground(new java.awt.Color(255, 0, 51));
        lblCampObli7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCampObli7.setText("campo obligatorio *");
        lblCampObli7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(lblCampObli7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo que limpia los TxtFiels
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtDistribuidora.setText("");
        txtEjemplares.setText("");
        txtPrecioNeto.setText("");
        txtPrecioVenta.setText("");
        jdFechaEntrega.setDate(new Date());
        jdFechaExpiracion.setDate(new Date());
        txtNombre.setText("");
        cmbTipoProducto.setSelectedIndex(0);

        ponerInvisiblelbl();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Metodo que guarda los datos 
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (estaVacio()) {
            mensaje.mostrarMensaje("No puedes dejar campos vacios", "advertencia", "Advertencia");

        } else {
            //Asignando los valores
            String distribuidora = txtDistribuidora.getText();
            String nombre = txtNombre.getText();
            double precioNeto = Double.parseDouble(txtPrecioNeto.getText());
            double precioVenta = Double.parseDouble(txtPrecioVenta.getText());
            int ejemplares = Integer.parseInt(txtEjemplares.getText());
            Date fechaDeEntrega = jdFechaEntrega.getDate();
            Date fechaExpiracion = jdFechaExpiracion.getDate();

            //Enviando los datos a la controladora para que los gurde
            control.guardarDatos(nombre, precioNeto, precioVenta, ejemplares, fechaDeEntrega, fechaExpiracion, distribuidora);

            //Mostrando mensaje
            mensaje.mostrarMensaje("El producto se guardo correctamente", "informacion", "Guardando");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDistribuidoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistribuidoraKeyTyped

        // Inicializa una variable para contar el número de espacios en blanco.
        int spaceCount = 0;

        // Recorre cada caracter en el texto del campo txtDistribuidora.
        for (int i = 0; i < txtDistribuidora.getText().length(); i++) {
            // Si el caracter actual es un espacio en blanco, incrementa el contador.
            if (txtDistribuidora.getText().charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Verifica si el caracter ingresado no es una letra y tampoco es la tecla de espacio.
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            // Consumir el evento para evitar que el caracter no deseado sea mostrado en el campo.
            evt.consume();
            // Muestra un mensaje de error indicando que no se pueden ingresar caracteres especiales.
            mensaje.mostrarMensaje("No puedes ingresar caracteres especiales al nombre de una distribuidora", "error", "ERROR");
        } else if (spaceCount >= 5) {
            // Si se han ingresado más de 5 espacios en blanco, consumir el evento y mostrar un mensaje de error.
            evt.consume();
            mensaje.mostrarMensaje("No puedes ingresar más de 5 espacios en blanco", "error", "ERROR");
        }

    }//GEN-LAST:event_txtDistribuidoraKeyTyped

    private void txtPrecioVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyTyped
        // Obtiene el carácter de la tecla presionada
        char key = evt.getKeyChar();

        // Verifica si el carácter presionado no es un dígito numérico, un punto decimal ni la tecla de retroceso (borrar)
        if (!Character.isDigit(key) && key != '.' && key != KeyEvent.VK_BACK_SPACE) {
            // Si no es un dígito numérico, un punto decimal ni retroceso, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("Solo puedes ingresar números y un punto decimal en el precio de venta", "error", "ERROR");
        } else if (key == '.' && txtPrecioVenta.getText().contains(".")) {
            // Si la tecla presionada es un punto decimal y ya hay uno en el campo de texto, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("Solo puedes ingresar un punto decimal en el precio de venta", "error", "ERROR");
        } else if (key == '0' && (txtPrecioVenta.getText().isEmpty() || txtPrecioVenta.getCaretPosition() == 0)) {
            // Si la tecla presionada es "0" y el campo está vacío o el "0" está al principio, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("No puedes ingresar un precio de 0 pesos", "error", "ERROR");
           
        } else if (txtPrecioVenta.getText().startsWith(".")) {
            // Verifica si el campo comienza con un punto decimal
            evt.consume();
            mensaje.mostrarMensaje("Debe haber un número antes del punto decimal", "error", "ERROR");
        } 

    }//GEN-LAST:event_txtPrecioVentaKeyTyped

    private void txtPrecioNetoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioNetoKeyTyped
        // Obtiene el carácter de la tecla presionada
        char key = evt.getKeyChar();


        // Verifica si el carácter presionado no es un dígito numérico, un punto decimal ni la tecla de retroceso (borrar)
        if (!Character.isDigit(key) && key != '.' && key != KeyEvent.VK_BACK_SPACE) {
            // Si no es un dígito numérico, un punto decimal ni retroceso, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("Solo puedes ingresar números y un punto decimal en el precio de venta", "error", "ERROR");
        } else if (key == '.' && txtPrecioNeto.getText().contains(".")) {
            // Si la tecla presionada es un punto decimal y ya hay uno en el campo de texto, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("Solo puedes ingresar un punto decimal en el precio de venta", "error", "ERROR");
        } else if (key == '0' && (txtPrecioNeto.getText().isEmpty() || txtPrecioNeto.getCaretPosition() == 0)) {
            // Si la tecla presionada es "0" y el campo está vacío o el "0" está al principio, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("No puedes ingresar un precio de 0 pesos", "error", "ERROR");
            
        } else if (txtPrecioNeto.getText().startsWith(".")) {
            // Verifica si el campo comienza con un punto decimal
            evt.consume();
            mensaje.mostrarMensaje("Debe haber un número antes del punto decimal", "error", "ERROR");
            // Verifica si la tecla presionada es un punto decimal, la posición del cursor está después del inicio y el carácter anterior no es un dígito
        } 
    }//GEN-LAST:event_txtPrecioNetoKeyTyped

    private void txtEjemplaresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEjemplaresKeyTyped
        // Obtiene el carácter de la tecla presionada
        char key = evt.getKeyChar();

        // Verifica si el carácter presionado no es un dígito numérico, ni la tecla de retroceso (borrar)
        if (!Character.isDigit(key) && key != KeyEvent.VK_BACK_SPACE) {
            // Si no es un dígito numérico ni retroceso, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("Solo puedes ingresar numeros en los ejemplares", "error", "ERROR");
        } else if (key == '0' && (txtEjemplares.getText().isEmpty() || txtEjemplares.getCaretPosition() == 0)) {
            // Si la tecla presionada es "0" y el campo está vacío o el "0" está al principio, consume el evento
            evt.consume();
            mensaje.mostrarMensaje("No puedes ingresar 0 al pricipio", "error", "ERROR");
            
        }
    }//GEN-LAST:event_txtEjemplaresKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        // Inicializa una variable para contar el número de espacios en blanco.
        int spaceCount = 0;

        // Recorre cada caracter en el texto del campo txtNombre.
        for (int i = 0; i < txtNombre.getText().length(); i++) {
            // Si el caracter actual es un espacio en blanco, incrementa el contador.
            if (txtNombre.getText().charAt(i) == ' ') {
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
    }//GEN-LAST:event_txtNombreKeyTyped

    private boolean estaVacio() {
        // Variable para indicar si hay campos de texto vacíos.
        boolean vacias = false;
        // Array de campos de texto que se desean validar.
        JTextField[] camposTexto = {txtNombre, txtPrecioNeto, txtPrecioVenta, txtEjemplares, txtDistribuidora};
        // Array de etiquetas correspondientes a los campos de texto.
        JLabel[] lista = {lblCampObli1, lblCampObli2, lblCampObli3, lblCampObli4, lblCampObli7};
        // Índice para rastrear las etiquetas en el array.
        int i = 0;
        // Recorre cada campo de texto en el array.
        for (JTextField campo : camposTexto) {
            // Verifica si el campo de texto está vacío después de eliminar espacios en blanco.
            if (campo.getText().trim().isEmpty()) {
                vacias = true;
                // Muestra la etiqueta correspondiente al campo de texto vacío.
                lista[i].setVisible(true);
            }
            i++;
        }
        // Verifica si hay fechas vacías usando la función estaVacioFechas().
        if (estaVacioFechas()) {
            vacias = true;
        }
        // Retorna el valor de la variable "vacias".
        return vacias;
    }

    public boolean estaVacioFechas() {
        // Crear un array de JLabels que corresponden a las etiquetas de campos obligatorios para las fechas
        JLabel[] lista = {lblCampObli5, lblCampObli6};
        // Inicializar una variable booleana para verificar si hay campos vacíos
        boolean vacias = false;
        // Crear un array de JDateChoosers que contienen las fechas que deben ser verificadas
        JDateChooser[] fechas = {jdFechaEntrega, jdFechaExpiracion};

        for (int i = 0; i < fechas.length; i++) {
            // Verificar si la fecha en la posición actual del array es nula
            if (fechas[i].getDate() == null) {
                // Si es nula, marcar la variable "vacias" como verdadera y mostrar la etiqueta correspondiente
                vacias = true;
                lista[i].setVisible(true);
            }
        }
        // Devolver el valor de "vacias"
        return vacias;
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
    private javax.swing.JLabel lblCampObli1;
    private javax.swing.JLabel lblCampObli2;
    private javax.swing.JLabel lblCampObli3;
    private javax.swing.JLabel lblCampObli4;
    private javax.swing.JLabel lblCampObli5;
    private javax.swing.JLabel lblCampObli6;
    private javax.swing.JLabel lblCampObli7;
    private javax.swing.JTextField txtDistribuidora;
    private javax.swing.JTextField txtEjemplares;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioNeto;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables

    private void ponerInvisiblelbl() {
        JLabel[] lista = {lblCampObli1, lblCampObli2, lblCampObli3, lblCampObli4, lblCampObli5, lblCampObli6, lblCampObli7};

        for (JLabel jLabel : lista) {
            jLabel.setVisible(false);
        }
    }
}
