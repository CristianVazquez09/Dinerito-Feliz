/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dineritoFeliz.persistencia;

import com.mycompany.dineritoFeliz.logica.Distribuidora;
import com.mycompany.dineritoFeliz.logica.Producto;

/**
 *
 * @author malaf
 */
public class ControladoraPersistencia {

    ProductoJpaController productoJPA = new ProductoJpaController();
    DistribuidoraJpaController distribuidoraJPA = new DistribuidoraJpaController();

    public void crearProducto(Producto producto) {
        productoJPA.create(producto);
    }

    public void crearDistribuidora(Distribuidora distribuidora) {
        distribuidoraJPA.create(distribuidora);
    }

    public void guardar(Producto produc, Distribuidora dis) {
        productoJPA.create(produc);
        distribuidoraJPA.create(dis);
    }
}
