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
        et.begin();
        em.persist(entity);
        et.commit();
        //em.clear();
    }

    public void delete(Object entity_id) {
        et.begin();
        em.remove(this.find(entity_id));
        et.commit();
        //em.clear();
    }

    public Person find(Object entity_id) {
        return em.find(Person.class, ((Integer)entity_id).longValue());
    }

    public void update(Person entity) {
        et.begin();
        em.merge(entity);
        et.commit();
        //em.clear();
    }

    public Collection<Person> findAll() {
        CriteriaBuilder criteria = em.getCriteriaBuilder();
        CriteriaQuery<Person> query = criteria.createQuery(Person.class);
        Root<Person> pers = query.from(Person.class);
        CriteriaQuery<Person> q = query.select(pers);
	return em.createQuery(q).getResultList();
    }
}
