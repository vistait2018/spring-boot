package com.vista.example1.sring5.repository;

import com.vista.example1.sring5.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}
