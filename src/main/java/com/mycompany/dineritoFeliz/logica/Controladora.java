/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dineritoFeliz.logica;

import com.mycompany.dineritoFeliz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author malaf
 */
public class Controladora {

    ControladoraPersistencia control = new ControladoraPersistencia();

    //---------------Metodos CRUD de productos 
    public void crearProducto(Producto producto) {
        control.crearProducto(producto);
    }
    
    public Producto traerProducto(int id) {
        return control.traerProducto(id);
    }

    public ArrayList<Producto> traerProductos() {
        return control.traerProductos();

    }
    
    public void eliminarProducto (int id){
        control.eliminarProducto(id);
    }
    
    public void editarProducto (Producto producto){
        control.editarProduto(producto);
    }

    //----------------Metodos CRUD de distribuidora----------------
    public void crearDistribuidora(Distribuidora distribuidora) {
        control.crearDistribuidora(distribuidora);
    }
    
 
    public Distribuidora traerDistribuidora(int id) {
        return control.traerDistribuidora(id);
    }
    
    public void editarDistribuidora(Distribuidora d) {
        control.editarDistribuidora(d);
    }
    
    public void eliminarDistribuidora (int id){
        control.eliminarDistribuidora(id);
    }
    
    

    public void guardarDatos(String nombre, double precioNeto, double precioVenta, int ejemplares, Date fechaDeEntrega, Date fechaExpiracion, String distribuidora) {

        if (control.comprobarDistribuidora(distribuidora)) {
            int id = control.traerIdDistribuidora(distribuidora);
            Distribuidora distri = control.traerDistribuidora(id);
            //Guardando producto
            Producto produc = new Producto();

            produc.guardarDatos(nombre, precioNeto, precioVenta, ejemplares, fechaDeEntrega, fechaExpiracion, distri);
            control.crearProducto(produc);
            //guaradando el producto en la lista de la distribuidora
            distri.getListaProductos().add(produc);

            control.editarDistribuidora(distri);

        } else {
            Distribuidora dis = new Distribuidora();
            Producto produc = new Producto();

            dis.setNomnre(distribuidora);
            String numDistribuidora = dis.buscarNumDistribuidora(distribuidora);
            dis.setNumero(numDistribuidora);

            produc.guardarDatos(nombre, precioNeto, precioVenta, ejemplares, fechaDeEntrega, fechaExpiracion, dis);

            control.guardar(produc, dis);

        }

    }


    public void registarVenta(String nombreProducto, int cantidadVendida) {
        
        if (control.comprobarProducto(nombreProducto)) {
            
            int id = control.traerIdProducto(nombreProducto);
            Producto producto = traerProducto(id);
            if (producto.getEjempleares() >= cantidadVendida) {

                int cantidadEjemplaresNueva = producto.getEjempleares() - cantidadVendida;

                if (cantidadEjemplaresNueva == 0) {
                    control.eliminarProducto(id);
                } else {
                    producto.setEjempleares(cantidadEjemplaresNueva);
                    control.editarProduto(producto);
                }

            }
        }
    }

    public void ModificarProducto(Producto producto, String nombre, double precioNeto, double precioVenta, int ejemplares, Date fechaDeEntrega, Date fechaExpiracion, String distribuidora) {
        //Buscando la distribuidora
        Distribuidora distri = buscarDistribuidora(distribuidora);
        
        //Guardando los nuevos datos dek producto 
        producto.guardarDatos(nombre,precioNeto,precioVenta,ejemplares,fechaDeEntrega,fechaExpiracion,distri);
        //Editando el producto 
        control.editarProduto(producto);
        
        //Agregando el producto modifica a la lista de la distribuidora correspondiente 
        distri.getListaProductos().add(producto);
        
        //Guardando los cambios de distribuidora 
        control.editarDistribuidora(distri);
    }

    //Metodo para buscar distribuidora 
    private Distribuidora buscarDistribuidora(String distribuidora) {
        //Creando una lista de las distribuidoras de la base de datos 
        ArrayList<Distribuidora> lista = control.traerDistribuidoras();
        //Creando dos distribuidora en caso de que exista o no 
        Distribuidora disExiste;
        Distribuidora disNoExiste= new Distribuidora();
        int existe=0;
        int id=0;
        //Recorriendo la lista 
        for (Distribuidora d : lista) {
            //Comprobar si ya existe la distribuidora 
            if(d.getNomnre().equalsIgnoreCase(distribuidora)){
                existe =1;
                //Guardamos el id de la distribuidora encontrada 
                id=d.getId();
            }
        }
        
        if(existe==1){
            //Si existe, traemos la distribuidora con el id guaradado 
            disExiste=control.traerDistribuidora(id);
            return disExiste;
        } else {
            //Su no exixte creamos una nueva distribuidora 
            disNoExiste.setNomnre(distribuidora);
            String num=disNoExiste.buscarNumDistribuidora(distribuidora);
            disNoExiste.setNumero(num);
            crearDistribuidora(disNoExiste);
            return disNoExiste;
        }
    }

}
