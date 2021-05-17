package com.tonytor.marvelhero.services;

import java.util.List;

public interface IService<T> {
    T get(int id);
    List<T> getAll();
    T create(T obj);
    T update(int id, T obj);
    void delete(int id);
}
