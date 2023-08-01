package com.mycompany.dineritoFeliz.logica;

import com.mycompany.dineritoFeliz.logica.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-08-01T07:15:45", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Distribuidora.class)
public class Distribuidora_ { 

    public static volatile SingularAttribute<Distribuidora, String> nomnre;
    public static volatile ListAttribute<Distribuidora, Producto> listaProductos;
    public static volatile SingularAttribute<Distribuidora, String> numero;
    public static volatile SingularAttribute<Distribuidora, Integer> id;

}