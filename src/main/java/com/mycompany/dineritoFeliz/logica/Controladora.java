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
    
    public void crearProducto (Producto producto){
        control.crearProducto(producto);
    }
    
    public void crearDistribuidora(Distribuidora distribuidora){
        control.crearDistribuidora(distribuidora);
    }

    public void guardarDatos(String nombre, double precioNeto, double precioVenta, int ejemplares, Date fechaDeEntrega, Date fechaExpiracion, String distribuidora) {
        Distribuidora dis = new Distribuidora();
        dis.setNomnre(distribuidora);
        String numDistribuidora= dis.buscarNumDistribuidora(distribuidora);
        dis.setNumero(numDistribuidora);
        
        Producto produc = new Producto();
        produc.guardarDatos(nombre,precioNeto,precioVenta,ejemplares,fechaDeEntrega,fechaExpiracion,dis);
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(produc);
        
        dis.setListaProductos(listaProductos);
        
        control.guardar(produc,dis);
        
        
        
                
    }
}
