/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dineritoFeliz.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author malaf
 */
@Entity
public class Distribuidora implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nomnre;
    private String numero;
    
    @OneToMany(mappedBy = "distribuidora", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<Producto> listaProductos;
    

    public Distribuidora() {
    }

    public Distribuidora(int id, String nomnre, String numero, ArrayList<Producto> listaProductos) {
        this.id = id;
        this.nomnre = nomnre;
        this.numero = numero;
        this.listaProductos = listaProductos;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomnre() {
        return nomnre;
    }

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    String buscarNumDistribuidora(String distribuidora) {
    
        String dis = distribuidora.toLowerCase();
        
        Map <String,String> distribuidorasNums = new HashMap<>();
        distribuidorasNums.put("bimbo", "55 4746-9720");
        distribuidorasNums.put("barcel", "01 800 910 2030");
        distribuidorasNums.put("sabritas", "55 2582 4752");
        distribuidorasNums.put("gamesa", "961 615 3186");
        distribuidorasNums.put("lala", "55 5729 3200");
        distribuidorasNums.put("kellogg's", "55-5624-2105");
        distribuidorasNums.put("quaker", "81 8158 7100");
        distribuidorasNums.put("mccormick", "472 722 9000");
        
        return distribuidorasNums.get(dis);
    }

    public Object mostrarNombreNumero() {
        return nomnre + numero;
    }

   

    
   
    
    


    }
