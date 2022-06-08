package com.example.books.controller;

import com.example.books.model.Book;
import com.example.books.service.IBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/book")
public class BookController {

    private final IBookService iBookService;

    public BookController(IBookService iBookService) {
        this.iBookService = iBookService;
    }

    @GetMapping("/")
    public List<Book> findAllBook(){
        return iBookService.findAllBook();
    }

    @PostMapping("/")
    public Book createBook(@RequestBody Book book){
        return iBookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Optional<Book> findByIdBook(@PathVariable Integer id){
        return iBookService.findByIdBook(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id){
        iBookService.deleteBook(id);
    }

    @PutMapping("/")
    public Book updateBook(@RequestBody Book book){
        return iBookService.updateBook(book);
    }

}
