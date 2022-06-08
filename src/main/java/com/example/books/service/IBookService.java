package com.example.books.service;

import com.example.books.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

    List<Book> findAllBook();
    Book createBook(Book book);
    Optional<Book> findByIdBook(Integer id);
    void deleteBook(Integer id);
    Book updateBook(Book book);

}
