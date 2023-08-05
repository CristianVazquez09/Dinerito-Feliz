

package com.mycompany.dineritoFeliz;

import com.mycompany.dineritoFeliz.igu.Menu;
import com.mycompany.dineritoFeliz.logica.Controladora;
import com.mycompany.dineritoFeliz.logica.Distribuidora;
import com.mycompany.dineritoFeliz.logica.Producto;
import com.mycompany.dineritoFeliz.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author malaf
 */
public class DineritoFeliz {

    public static void main(String[] args) {
         Menu pantalla = new Menu();
         
         pantalla.setVisible(true);
         pantalla.setLocationRelativeTo(null);

         
         
         
//         Controladora c = new Controladora();
//            Distribuidora d= new Distribuidora();
//            
//            
//            ArrayList <Producto> lista = new ArrayList<>();
//            
//            d.setNomnre("bacerl");
//            d.setNumero("31313");
//            d.setListaProductos(lista);
//            
//            c.crearDistribuidora(d);
            
//            
//            lista.add(p);
//            lista.add(p2);
//            
//            d.setListaProductos(lista);
//            
//            c.editarDistribuidora(d);
            
            
            
            
      
//            lista.add(p);
//             d.setListaProductos(lista);
//            Controladora c = new Controladora();
            
//            c.crearDistribuidora(d);
//            c.crearProducto(p);
         
//            Producto pr = c.traerProducto(1);
//            
//            System.out.println("ID: "+pr.getId()+"Nombre: " +pr.getNombre()+ "Precio" + pr.getPrecioVenta()+ 
//                        "fecha"+pr.getFechaExpiracion());
//            ArrayList<Producto> lista = c.traerProductos();
//
//            for (Producto p : lista) {
//                System.out.println("Nombre :" +p.getNombre()+ "Precio: " + p.getPrecioVenta()+ 
//                        "fecha: "+p.getFechaExpiracion() + "Distribuidora: "+p.getDistribuidora().getNomnre());
//            
//        }
                 
//            Distribuidora d= c.traerDistribuidora(1);
//            
//            Producto p= new Producto();
//            Producto p2 = new Producto();
//            p.guardarDatos("Runners", 14.8, 15.50, 11, new Date(), new Date(), d);
//            p2.guardarDatos("Rancheritos", 14.8, 15.50, 11, new Date(), new Date(), d);
//            c.crearProducto(p);
//            c.crearProducto(p2);
//         
//         
//            d.getListaProductos().add(p);
//            d.getListaProductos().add(p2);
//            
//            c.editarDistribuidora(d);


//
//        ControladoraPersistencia c = new ControladoraPersistencia();
//        
//        if(c.comprobarProducto("marianita")){
//            System.out.println("Existe");
//        }
        
//        if(c.comprobarDistribuidora("lala")){
//            System.out.println("Existe");
//        }
//        
//        ArrayList<Producto> lista = c.traerProductos();
//        int id=0;
//        String nombre="marianitas";
//        for (Producto producto : lista) {
//            if(producto.getNombre().equalsIgnoreCase(nombre)){
//                System.out.println(producto.getId());
//                id=producto.getId();
//            }
//        }
//        
//        Producto nuevo = c.traerProducto(id);
//        
//        System.out.println(nuevo.getNombre());
        
//            String nombre="leche lala 100";
//            int id =0;
//        if (c.comprobarProducto(nombre)){
//            id=c.traerIdProducto(nombre);
//        }
//        System.out.println(id);
//        
//        Producto p = c.traerProducto(id);
//        
//        if(p.getEjempleares()>= 5){
//            int cantidadNueva = p.getEjempleares()-5;
//            
//            p.setEjempleares(cantidadNueva);
//            
//            c.editarProduto(p);
//        }
    }
}
