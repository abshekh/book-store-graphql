package com.example.bookstoregraphql.service.datafetcher;

import java.util.Optional;
import com.example.bookstoregraphql.model.Book;
import com.example.bookstoregraphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

/**
 * BookDataFetcher
 */
@Component
public class BookDataFetcher implements DataFetcher<Book> {

  @Autowired
  BookRepository bookRepository;

  @Override
  public Book get(DataFetchingEnvironment environment) {

    String isn = environment.getArgument("id");
    Optional<Book> optionalBook = bookRepository.findById(isn);
    Book book = null;

    if (optionalBook.isPresent()) {
      book = optionalBook.get();
    }

    return book;
  }


}
