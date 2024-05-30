package com.gchaldu.userGeneric.interfaces;

public interface Repository<T> {
    void add(T obj);
    void remove(Integer id);
    void update(Integer id, T obj);
    T find(Integer id);
}
