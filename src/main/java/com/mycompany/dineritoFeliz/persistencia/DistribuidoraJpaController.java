/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dineritoFeliz.persistencia;

import com.mycompany.dineritoFeliz.logica.Distribuidora;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.dineritoFeliz.logica.Producto;
import com.mycompany.dineritoFeliz.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author malaf
 */
public class DistribuidoraJpaController implements Serializable {

    public DistribuidoraJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
     public DistribuidoraJpaController() {
        emf= Persistence.createEntityManagerFactory("DineritoFelizPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Distribuidora distribuidora) {
        if (distribuidora.getListaProductos() == null) {
            distribuidora.setListaProductos(new ArrayList<Producto>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArrayList<Producto> attachedListaProductos = new ArrayList<Producto>();
            for (Producto listaProductosProductoToAttach : distribuidora.getListaProductos()) {
                listaProductosProductoToAttach = em.getReference(listaProductosProductoToAttach.getClass(), listaProductosProductoToAttach.getId());
                attachedListaProductos.add(listaProductosProductoToAttach);
            }
            distribuidora.setListaProductos(attachedListaProductos);
            em.persist(distribuidora);
            for (Producto listaProductosProducto : distribuidora.getListaProductos()) {
                Distribuidora oldDistribuidoraOfListaProductosProducto = listaProductosProducto.getDistribuidora();
                listaProductosProducto.setDistribuidora(distribuidora);
                listaProductosProducto = em.merge(listaProductosProducto);
                if (oldDistribuidoraOfListaProductosProducto != null) {
                    oldDistribuidoraOfListaProductosProducto.getListaProductos().remove(listaProductosProducto);
                    oldDistribuidoraOfListaProductosProducto = em.merge(oldDistribuidoraOfListaProductosProducto);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Distribuidora distribuidora) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Distribuidora persistentDistribuidora = em.find(Distribuidora.class, distribuidora.getId());
            ArrayList<Producto> listaProductosOld = persistentDistribuidora.getListaProductos();
            ArrayList<Producto> listaProductosNew = distribuidora.getListaProductos();
            ArrayList<Producto> attachedListaProductosNew = new ArrayList<Producto>();
            for (Producto listaProductosNewProductoToAttach : listaProductosNew) {
                listaProductosNewProductoToAttach = em.getReference(listaProductosNewProductoToAttach.getClass(), listaProductosNewProductoToAttach.getId());
                attachedListaProductosNew.add(listaProductosNewProductoToAttach);
            }
            listaProductosNew = attachedListaProductosNew;
            distribuidora.setListaProductos(listaProductosNew);
            distribuidora = em.merge(distribuidora);
            for (Producto listaProductosOldProducto : listaProductosOld) {
                if (!listaProductosNew.contains(listaProductosOldProducto)) {
                    listaProductosOldProducto.setDistribuidora(null);
                    listaProductosOldProducto = em.merge(listaProductosOldProducto);
                }
            }
            for (Producto listaProductosNewProducto : listaProductosNew) {
                if (!listaProductosOld.contains(listaProductosNewProducto)) {
                    Distribuidora oldDistribuidoraOfListaProductosNewProducto = listaProductosNewProducto.getDistribuidora();
                    listaProductosNewProducto.setDistribuidora(distribuidora);
                    listaProductosNewProducto = em.merge(listaProductosNewProducto);
                    if (oldDistribuidoraOfListaProductosNewProducto != null && !oldDistribuidoraOfListaProductosNewProducto.equals(distribuidora)) {
                        oldDistribuidoraOfListaProductosNewProducto.getListaProductos().remove(listaProductosNewProducto);
                        oldDistribuidoraOfListaProductosNewProducto = em.merge(oldDistribuidoraOfListaProductosNewProducto);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = distribuidora.getId();
                if (findDistribuidora(id) == null) {
                    throw new NonexistentEntityException("The distribuidora with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Distribuidora distribuidora;
            try {
                distribuidora = em.getReference(Distribuidora.class, id);
                distribuidora.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The distribuidora with id " + id + " no longer exists.", enfe);
            }
            ArrayList<Producto> listaProductos = distribuidora.getListaProductos();
            for (Producto listaProductosProducto : listaProductos) {
                listaProductosProducto.setDistribuidora(null);
                listaProductosProducto = em.merge(listaProductosProducto);
            }
            em.remove(distribuidora);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Distribuidora> findDistribuidoraEntities() {
        return findDistribuidoraEntities(true, -1, -1);
    }

    public List<Distribuidora> findDistribuidoraEntities(int maxResults, int firstResult) {
        return findDistribuidoraEntities(false, maxResults, firstResult);
    }

    private List<Distribuidora> findDistribuidoraEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Distribuidora.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Distribuidora findDistribuidora(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Distribuidora.class, id);
        } finally {
            em.close();
        }
    }

    public int getDistribuidoraCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Distribuidora> rt = cq.from(Distribuidora.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
