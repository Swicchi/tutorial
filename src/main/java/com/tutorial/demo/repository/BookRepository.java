package com.tutorial.demo.repository;

import com.tutorial.demo.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository <Book,Long> {
}
