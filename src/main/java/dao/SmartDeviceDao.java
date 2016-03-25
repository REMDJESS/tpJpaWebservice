
package dao;

import domain.*;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class SmartDeviceDao implements IDao<SmartDevice> {
    private EntityManager em;
    private EntityTransaction et;
    
    public SmartDeviceDao(){
        em = singleton.EntityManager.getInstance();
        et = em.getTransaction();
    }
    
    public void create(SmartDevice entity) {
        if(entity != null){
            et.begin();
            em.persist(entity);
            et.commit();
        }
    }

    public SmartDevice delete(Object id) {
        SmartDevice sd = em.getReference(SmartDevice.class, id);
        if(sd != null)
        {
            et.begin();
            em.remove(sd);
            et.commit();
            //em.clear();
        }
        return sd;
    }

    public SmartDevice find(Object id) {
        return (SmartDevice)(em.find(SmartDevice.class, id));     }

    public SmartDevice update(SmartDevice entity) {
        if(entity != null)
        {
            et.begin();
            em.merge(entity);
            et.commit();
        }
        return entity;
    }

    public Collection<SmartDevice> findAll(){
        TypedQuery<SmartDevice> TQ = em.createNamedQuery("device.find.all", SmartDevice.class);
        return TQ.getResultList();
    }
    
}
