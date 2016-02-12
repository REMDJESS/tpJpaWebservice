package dao;

import java.util.Collection;

public interface IDao<T> {
    void create(T entity);
    void delete(Object entity_id);
    T find(Object entity_id);
    void update(T entity);
    Collection<T> findAll();
}
