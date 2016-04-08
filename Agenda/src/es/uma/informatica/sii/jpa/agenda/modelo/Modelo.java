/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.jpa.agenda.modelo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author francis
 */
public class Modelo {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public Modelo()
    {
        emf = Persistence.createEntityManagerFactory("AgendaPU");
        em=emf.createEntityManager();
    }
    
    public boolean aniadirContacto (Contacto c)
    {
        try{
           em.getTransaction().begin();
           em.persist(c);
           em.getTransaction().commit();
           return true; 
        }
        catch(RuntimeException e){
            return false;
        }
    }
    
    public void modificarContacto (Contacto c)
    {
        em.getTransaction().begin();
        em.getTransaction().commit();
    }
    
    public void eliminarContacto (Contacto c)
    {
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }
    
    public List<Contacto> getContactos()
    {        
        TypedQuery<Contacto> query = em.createQuery("SELECT c FROM Contacto c",Contacto.class);
        List<Contacto> res = query.getResultList();
        return res;
    }
    
    public void cerrar()
    {
        em.close();
        emf.close();
    }
    
    
}
