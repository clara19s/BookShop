package com.example.bookshop.repository;

import com.example.bookshop.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends  JpaRepository<Book, Long> {
}
