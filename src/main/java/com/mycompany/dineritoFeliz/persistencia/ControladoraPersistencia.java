package com.mycompany.dineritoFeliz.persistencia;
import com.mycompany.dineritoFeliz.logica.Distribuidora;
import com.mycompany.dineritoFeliz.logica.Producto;
import com.mycompany.dineritoFeliz.logica.Venta;
import com.mycompany.dineritoFeliz.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    //Controlares de persistencia de cada clase 
    private ProductoJpaController productoJPA = new ProductoJpaController();
    private DistribuidoraJpaController distribuidoraJPA = new DistribuidoraJpaController();
    private VentaJpaController ventaJPA = new VentaJpaController();

    //Metodo que guarda un producto y distribuidora 
    public void guardar(Producto produc, Distribuidora dis) {

        distribuidoraJPA.create(dis);
        productoJPA.create(produc);

    }

    //--------------METODOS CRUD PARA PRODUCTO --------------------
    public void crearProducto(Producto producto) {
        productoJPA.create(producto);
    }

    public Producto traerProducto(int id) {
        return productoJPA.findProducto(id);

    }

    public ArrayList<Producto> traerProductos() {
        List lista = productoJPA.findProductoEntities();
        ArrayList<Producto> listaProductos = new ArrayList<>(lista);
        return listaProductos;
    }

    public void eliminarProducto(int id) {
        try {
            productoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarProduto(Producto producto) {
        try {
            productoJPA.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Metodo que comprueba si existe un producto 
    public boolean comprobarProducto(String nomProducto) {
        ArrayList<Producto> listaProductos = traerProductos();

        boolean existe = false;

        for (Producto listaD : listaProductos) {
            if (listaD.getNombre().equalsIgnoreCase(nomProducto)) {
                existe = true;
            }
        }
        return existe;
    }
    //Metodo que retorna el id de un producto por su nombre 
    public int traerIdProducto(String nomProducto) {

        ArrayList<Producto> listaProducto = traerProductos();
        int id = 0;
        for (Producto listaD : listaProducto) {
            if (listaD.getNombre().equalsIgnoreCase(nomProducto)) {
                id = listaD.getId();
            }
        }

        return id;
    }

    //----------------METODOS CRUD DE DISTRIBUIDORA -------------------
    public void crearDistribuidora(Distribuidora distribuidora) {
        distribuidoraJPA.create(distribuidora);
    }

    public Distribuidora traerDistribuidora(int id) {
        return distribuidoraJPA.findDistribuidora(id);
    }

    public ArrayList<Distribuidora> traerDistribuidoras() {
        List lista = distribuidoraJPA.findDistribuidoraEntities();
        ArrayList<Distribuidora> listaDistribuidoras = new ArrayList<>(lista);
        return listaDistribuidoras;
    }

    public void eliminarDistribuidora(int id) {
        try {
            distribuidoraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarDistribuidora(Distribuidora d) {
        try {
            distribuidoraJPA.edit(d);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Metodo que checa si existe la distribuidora por su nombre 
    public boolean comprobarDistribuidora(String distribuidora) {
        ArrayList<Distribuidora> listaDistribuidoras = traerDistribuidoras();

        boolean existe = false;

        for (Distribuidora listaD : listaDistribuidoras) {
            if (listaD.getNomnre().equalsIgnoreCase(distribuidora)) {
                existe = true;
            }
        }
        return existe;
    }
    //Metodo que retorna el id de la distribuidora por su nombre
    public int traerIdDistribuidora(String distribuidora) {

        ArrayList<Distribuidora> listaDistribuidoras = traerDistribuidoras();
        int id = 0;
        for (Distribuidora listaD : listaDistribuidoras) {
            if (listaD.getNomnre().equalsIgnoreCase(distribuidora)) {
                id = listaD.getId();
            }
        }

        return id;

    }
    
    //-----------Metodos CRUD de venta-------------
    public void crearVenta (Venta venta ){
        ventaJPA.create(venta);
    }
    
    public Venta traerVenta (int id){
        return ventaJPA.findVenta(id);
    }
    public ArrayList<Venta> traerVentas (){
        List<Venta> lista = ventaJPA.findVentaEntities();
        ArrayList<Venta>listaVentas = new ArrayList<>(lista);
        
        return listaVentas;
    }
    
    public void editarVenta (Venta venta){
        try {
            ventaJPA.edit(venta);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
