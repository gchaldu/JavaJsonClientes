package com.gchaldu.userGeneric;

import com.gchaldu.userGeneric.interfaces.Repository;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository<T> implements Repository<T> {

    private List<T> userList;

    public ClienteRepository() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void add(T obj) {
        this.userList.add(obj);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void update(Integer id, T obj) {

    }

    @Override
    public T find(Integer id) {
        return null;
    }

    public List<T> getUserList() {
        return userList;
    }
}
