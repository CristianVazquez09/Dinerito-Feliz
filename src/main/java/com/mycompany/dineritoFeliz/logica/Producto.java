
package com.mycompany.dineritoFeliz.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author malaf
 */
@Entity
public class Producto implements Serializable   {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;
    private double precioNeto;
    private double precioVenta;
    private int ejempleares; 
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaExpiracion;
    
    @ManyToOne
    @JoinColumn(name = "distribuidora_id")
    private Distribuidora distribuidora;

    public Producto() {
    }

    public Producto(int id,String nombre, double precioNeto, double precioVenta, int ejempleares, Date fechaEntrega, Date fechaExpiracion, Distribuidora distribuidora) {
        this.id = id;
        this.nombre=nombre;
        this.precioNeto = precioNeto;
        this.precioVenta = precioVenta;
        this.ejempleares = ejempleares;
        this.fechaEntrega = fechaEntrega;
        this.fechaExpiracion = fechaExpiracion;
        this.distribuidora = distribuidora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getEjempleares() {
        return ejempleares;
    }

    public void setEjempleares(int ejempleares) {
        this.ejempleares = ejempleares;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Distribuidora getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(Distribuidora distribuidora) {
        this.distribuidora = distribuidora;
    }

    void guardarDatos(String nombre, double precioNeto, double precioVenta, int ejemplares, Date fechaDeEntrega, Date fechaExpiracion, Distribuidora dis) {
        this.nombre=nombre;
        this.precioNeto=precioNeto;
        this.precioVenta= precioVenta;
        this.ejempleares=ejemplares;
        this.fechaEntrega=fechaDeEntrega;
        this.fechaExpiracion=fechaExpiracion;
        this.distribuidora=dis;
    }
    
    
    
}
