package repository;

import model.Product;

import java.util.List;

public interface Repository <T>{
    List<T> list();
    T byId (Integer id);


    void save(T t);
    void delete(Integer id);

}
