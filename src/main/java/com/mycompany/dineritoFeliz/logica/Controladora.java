package com.mycompany.dineritoFeliz.logica;

import com.mycompany.dineritoFeliz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;

public class Controladora {

    private ControladoraPersistencia control = new ControladoraPersistencia();
    //Variable global de una lista de ventas 
    private ArrayList<Venta> listaVentas;

    

    //---------------Metodos CRUD de productos--------------- 
    public void crearProducto(Producto producto) {
        control.crearProducto(producto);
        
    }

    public Producto traerProducto(int id) {

        return control.traerProducto(id);
    }

    public ArrayList<Producto> traerProductos() {
        return control.traerProductos();

    }

    public void eliminarProducto(int id) {
        control.eliminarProducto(id);
    }

    public void editarProducto(Producto producto) {
        control.editarProduto(producto);
    }

    //Metodo que modifica productos
    public void ModificarProducto(Producto producto, String nombre, double precioNeto, double precioVenta, int ejemplares, Date fechaDeEntrega, Date fechaExpiracion, String distribuidora) {
        //Buscando la distribuidora
        Distribuidora distri = buscarDistribuidora(distribuidora);

        //Guardando los nuevos datos del producto 
        producto.guardarDatos(nombre, precioNeto, precioVenta, ejemplares, fechaDeEntrega, fechaExpiracion, distri);
        //Editando el producto 
        control.editarProduto(producto);

        //Agregando el producto modifica a la lista de la distribuidora correspondiente 
        distri.getListaProductos().add(producto);

        //Guardando los cambios de distribuidora 
        control.editarDistribuidora(distri);
    }

    //----------------------------------Metodos CRUD de distribuidora----------------------------------
    public void crearDistribuidora(Distribuidora distribuidora) {
        control.crearDistribuidora(distribuidora);
    }

    public Distribuidora traerDistribuidora(int id) {
        return control.traerDistribuidora(id);
    }

    public void editarDistribuidora(Distribuidora d) {
        control.editarDistribuidora(d);
    }

    public void eliminarDistribuidora(int id) {
        control.eliminarDistribuidora(id);
    }

    //Metodo para buscar distribuidora 
    private Distribuidora buscarDistribuidora(String distribuidora) {
        //Creando una lista de las distribuidoras de la base de datos 
        ArrayList<Distribuidora> lista = control.traerDistribuidoras();
        //Creando dos distribuidora en caso de que exista o no 
        Distribuidora disExiste;
        Distribuidora disNoExiste = new Distribuidora();
        int existe = 0;
        int id = 0;
        //Recorriendo la lista 
        for (Distribuidora d : lista) {
            //Comprobar si ya existe la distribuidora 
            if (d.getNomnre().equalsIgnoreCase(distribuidora)) {
                existe = 1;
                //Guardamos el id de la distribuidora encontrada 
                id = d.getId();
            }
        }

        if (existe == 1) {
            //Si existe, traemos la distribuidora con el id guaradado 
            disExiste = control.traerDistribuidora(id);
            return disExiste;
        } else {
            //Su no existe creamos una nueva distribuidora 
            disNoExiste.setNomnre(distribuidora);
            String num = disNoExiste.buscarNumDistribuidora(distribuidora);
            disNoExiste.setNumero(num);
            crearDistribuidora(disNoExiste);
            return disNoExiste;
        }
    }

    //----------------------------------Metodos CRUD de ventas----------------------------------
    public void crearVenta(Venta venta) {
        control.crearVenta(venta);
    }

    public ArrayList<Venta> traerVentas() {
        return control.traerVentas();
    }

    //Metodo para registar Ventas 
    public boolean registarVenta(String nombreProducto, int cantidadVendida) {
        //Validando que el producto exista 
        if (control.comprobarProducto(nombreProducto)) {
            //Obteneidno el id del producto 
            int id = control.traerIdProducto(nombreProducto);
            //Creando el producto encontrado 
            Producto producto = traerProducto(id);

            //Llamando al metodo venta 
            venta(producto, cantidadVendida);
            //Validando que los ejemplares sea mayor o igual a la contidad vendida 
            if (producto.getEjempleares() >= cantidadVendida) {
                //Obteniendo la nueva cantidad de ejemplares depues de la venta 
                int cantidadEjemplaresNueva = producto.getEjempleares() - cantidadVendida;

                //Si los ejemplares nuevos son 0 
                if (cantidadEjemplaresNueva == 0) {
                    //Elimando el producto 
                    control.eliminarProducto(id);
                } else {
                    //Editando el producto con los ejemplares actualizados 
                    producto.setEjempleares(cantidadEjemplaresNueva);
                    control.editarProduto(producto);
                }
            }
            return true;
        } else {
           return false;
        }
    }

    //Metodo que hace la logica de evntas 
    public void venta(Producto producto, int cantidadVendida) {
        //Creando la lista y variables para almacenar los datos 
        listaVentas = traerVentas();
        Venta v = new Venta();
        Venta ven;
        int i = 0;
        int id;
        // Busca en la lista de ventas un producto con el mismo nombre que el producto actual
        while (i < listaVentas.size() && !listaVentas.get(i).getNomProducto().equalsIgnoreCase(producto.getNombre())) {

            i++;
        }

        // Si se encontró una venta con el mismo producto en la lista
        if (i < listaVentas.size()) {
            id = listaVentas.get(i).getId();// Obtiene el ID de la venta encontrada

            // Trae la venta desde la base de datos usando el ID
            ven = control.traerVenta(id);
            // Calcula la nueva cantidad vendida sumando la cantidad actual y la nueva cantidad
            int cantidadVendidaNueva = ven.getCantidadVendida() + cantidadVendida;
            // Actualiza la cantidad vendida en la venta existente
            ven.setCantidadVendida(cantidadVendidaNueva);
            // Llama al método para editar la venta en la base de datos
            control.editarVenta(ven);
        } else {

            // Si no se encontró una venta con el mismo producto, crea una nueva venta
            // Establece los detalles de la nueva venta
            v.setNomProducto(producto.getNombre());
            v.setCantidadVendida(cantidadVendida);
            v.setPrecioVenta(producto.getPrecioVenta());
            // Llama al método para crear una nueva venta en la base de datos
            control.crearVenta(v);
        }

    }

    //Metodo de infrome de ventas 
    public String[] informeDeVentas() {
        String[] registroVentas = new String[3]; // Arreglo que almacenará el resultado

        listaVentas = traerVentas(); // Trae la lista de ventas desde la base de datos

        double ingresos = 0; // Variable para almacenar el total de ingresos
        int mayor = 0; // Variable para el producto más vendido
        int menor = Integer.MAX_VALUE; // Variable para el producto menos vendido
        String masVendido = null, menosVendido = null; // Nombres de los productos más y menos vendidos

        if (listaVentas.isEmpty()) {
            for (int i = 0; i < registroVentas.length; i++) {
                registroVentas[i] = "---";
            }
        } else {
            // Recorre la lista de ventas
            for (Venta venta : listaVentas) {
                ingresos += venta.getPrecioVenta(); // Suma el precio de venta al total de ingresos

                // Comprueba si esta venta tiene una cantidad vendida mayor que el valor actual de "mayor"
                if (venta.getCantidadVendida() > mayor) {
                    mayor = venta.getCantidadVendida(); // Actualiza "mayor" con la nueva cantidad
                    masVendido = venta.getNomProducto(); // Actualiza "masVendido" con el nombre del producto
                }

                // Comprueba si esta venta tiene una cantidad vendida menor que el valor actual de "menor"
                if (venta.getCantidadVendida() < menor) {
                    menor = venta.getCantidadVendida(); // Actualiza "menor" con la nueva cantidad
                    menosVendido = venta.getNomProducto(); // Actualiza "menosVendido" con el nombre del producto
                }
            }
            String ingresosS = String.valueOf(ingresos); // Convierte el total de ingresos a string

            registroVentas[0] = ingresosS; // Almacena el total de ingresos en el arreglo
            registroVentas[1] = masVendido; // Almacena el producto más vendido en el arreglo
            registroVentas[2] = menosVendido; // Almacena el producto menos vendido en el arreglo
        }

        return registroVentas; // Devuelve el arreglo con la información recopilada
    }

    //-----------------Metodo para gusrdar datos -----------------
    public void guardarDatos(String nombre, double precioNeto, double precioVenta, int ejemplares, Date fechaDeEntrega, Date fechaExpiracion, String distribuidora) {
        // Si la distribuidora ya existe en la base de datos
        if (control.comprobarDistribuidora(distribuidora)) {

            // Obtiendo el ID de la distribuidora existente
            int id = control.traerIdDistribuidora(distribuidora);

            // Obtiendo la distribuidora desde la base de datos usando el ID
            Distribuidora distri = control.traerDistribuidora(id);

            // Crea una nueva instancia de Producto
            Producto produc = new Producto();

            // Configura los detalles del producto
            produc.guardarDatos(nombre, precioNeto, precioVenta, ejemplares, fechaDeEntrega, fechaExpiracion, distri);

            // Crea el producto en la base de datos
            control.crearProducto(produc);

            // Agrega el producto a la lista de productos de la distribuidora
            distri.getListaProductos().add(produc);

            // Actualiza la distribuidora en la base de datos
            control.editarDistribuidora(distri);

        } else {// Si la distribuidora no existe en la base de datos

            // Crea una nueva instancia de Distribuidora
            Distribuidora dis = new Distribuidora();

            // Crea una nueva instancia de Producto
            Producto produc = new Producto();

            // Configura el nombre de la distribuidora
            dis.setNomnre(distribuidora);

            // Configura el número de la distribuidora
            String numDistribuidora = dis.buscarNumDistribuidora(distribuidora);
            dis.setNumero(numDistribuidora);

            // Configura los detalles del producto
            produc.guardarDatos(nombre, precioNeto, precioVenta, ejemplares, fechaDeEntrega, fechaExpiracion, dis);

            // Guarda tanto el producto como la distribuidora en la base de datos
            control.guardar(produc, dis);

        }

    }

}
