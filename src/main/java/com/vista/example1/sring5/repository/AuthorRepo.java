package com.vista.example1.sring5.repository;

import com.vista.example1.sring5.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
