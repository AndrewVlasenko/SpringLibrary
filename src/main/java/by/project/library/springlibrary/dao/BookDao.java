package by.project.library.springlibrary.dao;

import by.project.library.springlibrary.domain.Book;

import java.util.List;

public interface BookDao extends GeneralDao<Book>{

    List<Book> findTopBooks (int limit);

}
