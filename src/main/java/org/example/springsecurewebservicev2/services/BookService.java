package org.example.springsecurewebservicev2.services;

import org.example.springsecurewebservicev2.dto.book.BookAndMoreDto;
import org.example.springsecurewebservicev2.dto.book.CreateBookDto;
import org.example.springsecurewebservicev2.dto.book.UpdateBookDto;

import java.util.List;

public interface BookService {
    List<BookAndMoreDto> getAllBooks();

    BookAndMoreDto getBookById(int id);

    void createBook(CreateBookDto createBookDto);

    void updateBook(int id, UpdateBookDto updateBookDto);

    void deleteBook(int id);

}
