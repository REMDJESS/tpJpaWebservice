package dao;

import java.util.Collection;

public interface IDao<T> {
    void create(T entity);
    void delete(Object id);
    T find(Object id);
    T update(T entity);
    Collection<T> findAll();
}
