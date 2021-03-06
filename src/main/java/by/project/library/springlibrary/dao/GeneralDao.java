package by.project.library.springlibrary.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> getAll();
    T get (long id);
    T save (T obj);
    void delete (T object);

    List<T> search(String... searchString);

}
