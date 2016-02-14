package singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EntityManager {
    
    private EntityManagerFactory emf;
    private static javax.persistence.EntityManager em;
    private static final String persistence_unit_name = "dev";
    
    private EntityManager(){
        emf = Persistence.createEntityManagerFactory(persistence_unit_name);
        em = emf.createEntityManager();

    }
    
    public static synchronized javax.persistence.EntityManager getInstance(){
        if(em == null)
            new EntityManager();
        return em;
    }
    
}
