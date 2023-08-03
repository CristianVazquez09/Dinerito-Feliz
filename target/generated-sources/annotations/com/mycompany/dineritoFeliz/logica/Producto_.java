package com.mycompany.dineritoFeliz.logica;

import com.mycompany.dineritoFeliz.logica.Distribuidora;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-02T19:23:18", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Double> precioNeto;
    public static volatile SingularAttribute<Producto, Date> fechaExpiracion;
    public static volatile SingularAttribute<Producto, Distribuidora> distribuidora;
    public static volatile SingularAttribute<Producto, Date> fechaEntrega;
    public static volatile SingularAttribute<Producto, Integer> id;
    public static volatile SingularAttribute<Producto, Double> precioVenta;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Integer> ejempleares;

}