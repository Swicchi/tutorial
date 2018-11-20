package com.tutorial.demo.repository;

import com.tutorial.demo.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository <Author,Long> {
}
