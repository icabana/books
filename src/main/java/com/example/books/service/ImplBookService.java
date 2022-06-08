package com.example.books.service;

import com.example.books.model.Book;
import com.example.books.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImplBookService implements IBookService{

    private final IBookRepository iBookRepository;

    public ImplBookService(@Autowired IBookRepository iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    @Override
    public List<Book> findAllBook() {
        return iBookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return iBookRepository.save(book);
    }

    @Override
    public Optional<Book> findByIdBook(Integer id) {
        return iBookRepository.findById(id);
    }

    @Override
    public void deleteBook(Integer id) {
        iBookRepository.deleteById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return iBookRepository.save(book);
    }

}
