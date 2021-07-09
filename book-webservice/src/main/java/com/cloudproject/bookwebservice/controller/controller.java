package com.cloudproject.bookwebservice.controller;

import com.cloudproject.bookwebservice.entity.Book;
import com.cloudproject.bookwebservice.service.BookService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable long id) {
        return bookService.findById(id).map(book -> new ResponseEntity<>(book, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.save(book), HttpStatus.OK);
    }

    @PutMapping("/books/updateAvailability/{id}/{incrementCount}")
    public ResponseEntity<Book> updateAvailableCopies(@PathVariable long id,@PathVariable int incrementCount) {
        Optional<Book> book = bookService.updateAvailableCopies(id, incrementCount);
        return book.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable long id) {
        return new ResponseEntity<>(bookService.deleteBook(id),HttpStatus.OK);
    }
}
