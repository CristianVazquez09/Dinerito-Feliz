/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dineritoFeliz.logica;

import com.mycompany.dineritoFeliz.persistencia.ControladoraPersistencia;

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
}
