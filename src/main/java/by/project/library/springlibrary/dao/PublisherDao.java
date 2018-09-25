package by.project.library.springlibrary.dao;

import by.project.library.springlibrary.domain.Publisher;

import java.util.List;

public interface PublisherDao {
    List<Publisher> getAll();
    Publisher get (long id);
    Publisher save (Publisher obj);
    void delete (Publisher object);

    List<Publisher> search(String... searchString);
}
