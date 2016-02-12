package dao;

import java.util.Collection;

public interface IDao<T> {
    void create(T entity);
    void delete(T entity);
    T find(T entity);
    void update(T entity);
    Collection<T> findAll();
}
