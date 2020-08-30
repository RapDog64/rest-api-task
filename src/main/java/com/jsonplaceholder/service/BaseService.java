package com.jsonplaceholder.service;

public interface BaseService<T> {

    T getById(int id);
}
