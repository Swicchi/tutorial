package com.tutorial.demo.repository;

import com.tutorial.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository  extends CrudRepository <Publisher,Long> {
}
