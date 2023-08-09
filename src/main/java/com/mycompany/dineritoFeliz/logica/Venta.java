
package com.mycompany.dineritoFeliz.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Venta implements Serializable {
    //Atributo
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    private String NomProducto;
    private int cantidadVendida;
    private double precioVenta;

    //Constores 
    public Venta() {
    }

    public Venta(int id, String NomProducto, int cantidadVendida, double precioVenta) {
        this.id = id;
        this.NomProducto = NomProducto;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
    }

    //Metodos getters y setters 
    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
    }

    
    
    
    
}
