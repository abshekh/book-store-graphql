package com.example.bookstoregraphql.repository;

import com.example.bookstoregraphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookRepository
 */
@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
