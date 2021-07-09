package com.cloudproject.bookwebservice.repository;

import com.cloudproject.bookwebservice.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
