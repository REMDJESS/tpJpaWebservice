package singleton;

import javax.persistence.Persistence;

public final class EntityManager {
    
    private static javax.persistence.EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
    
    private EntityManager(){   
    }
    
    public static javax.persistence.EntityManager getInstance(){
        return em;
    }
    
}
