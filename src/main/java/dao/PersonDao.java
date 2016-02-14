package dao;

import domain.Person;
import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.*;

public class PersonDao implements IDao<Person> {

    private EntityManager em;
    private EntityTransaction et;

    public PersonDao() {
        em = singleton.EntityManager.getInstance();
        et = em.getTransaction();
    }

    public void create(Person entity) {
        if(entity != null);
        {
            et.begin();
            em.persist(entity);
            et.commit();
            //em.clear();
        }
    }

    public void delete(Object id)
    {
                Person p = em.getReference(Person.class, id);
                if(p != null)
                {
                    et.begin();
                    em.remove(p);
                    et.commit();
                    //em.clear();
                }
    }

    public Person find(Object id) {  
        return (Person)(em.find(Person.class, id));
    }

    public void update(Person entity) {
        if(entity != null)
        {
            et.begin();
            em.merge(entity);
            et.commit();
            //em.clear();
        }
    }

    public Collection<Person> findAll() {
        CriteriaBuilder criteria = em.getCriteriaBuilder();
        CriteriaQuery<Person> query = criteria.createQuery(Person.class);
        Root<Person> pers = query.from(Person.class);
        CriteriaQuery<Person> q = query.select(pers);
	return em.createQuery(q).getResultList();
    }
}
