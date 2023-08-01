

package com.mycompany.dineritoFeliz;

import com.mycompany.dineritoFeliz.igu.Menu;
import com.mycompany.dineritoFeliz.logica.Controladora;
import com.mycompany.dineritoFeliz.logica.Distribuidora;
import com.mycompany.dineritoFeliz.logica.Producto;
import java.time.Instant;
import java.util.Date;
import java.util.LinkedList;
/**
 *
 * @author malaf
 */
public class DineritoFeliz {

    public static void main(String[] args) {
//         Menu pantalla = new Menu();
//         
//         pantalla.setVisible(true);
//         pantalla.setLocationRelativeTo(null);
         //Producto p = new Producto();
         LinkedList <Producto> lista = new LinkedList<>();
         Producto p = new Producto(1, 143, 4653, 7, new Date(), new Date(), null);
         Producto p2 = new Producto(2, 143, 4653, 7, new Date(), new Date(), null);
         
         lista.add(p);
         lista.add(p2);
         Distribuidora d = new Distribuidora(1, "Gamesa", "81753513", lista);
         
         Controladora c = new Controladora();
         
         c.crearProducto(p);
         c.crearProducto(p2);
         
         c.crearDistribuidora(d);
                 
         
         
        
    }
}
