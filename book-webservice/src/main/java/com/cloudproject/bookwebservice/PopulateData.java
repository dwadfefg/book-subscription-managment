package com.cloudproject.bookwebservice;

import com.cloudproject.bookwebservice.entity.Book;
import com.cloudproject.bookwebservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PopulateData implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        bookRepository.save(new Book(1,"Operating System concepts","obdi",4,4));
    }
}
