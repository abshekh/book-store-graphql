package com.example.bookstoregraphql.service.datafetcher;

import java.util.List;
import com.example.bookstoregraphql.model.Book;
import com.example.bookstoregraphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * AllBooksDataFetcher
 */
@Component
public class AllBooksDataFetcher implements DataFetcher<List<Book>> {

  @Autowired
  BookRepository bookRepository;

  @Override
  public List<Book> get(DataFetchingEnvironment environment) {
    return bookRepository.findAll();
  }


}
