
package com.mycompany.dineritoFeliz.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    private double precioNeto;
    private double precioVenta;
    private int ejempleares; 
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaExpiracion;
    
    @ManyToOne
    private Distribuidora distribuidora;

    public Producto() {
    }

    public Producto(int id, double precioNeto, double precioVenta, int ejempleares, Date fechaEntrega, Date fechaExpiracion, Distribuidora distribuidora) {
        this.id = id;
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
    
    
    
}