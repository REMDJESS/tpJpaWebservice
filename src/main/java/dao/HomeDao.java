package dao;

import domain.Home;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class HomeDao implements IDao<Home> {
    private EntityManager em;
    private EntityTransaction et;

    public HomeDao() {
        em = singleton.EntityManager.getInstance();
        et = em.getTransaction();
    }
    public void create(Home entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Home find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Home update(Home entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Collection<Home> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
