package by.project.library.springlibrary.dao;

import by.project.library.springlibrary.domain.Author;

import java.util.List;

public interface AuthorDao {
    List<Author> getAll();
    Author get (long id);
    Author save (Author obj);
    void delete (Author object);

    List<Author> search(String... searchString);
}
