package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Book;

import java.util.List;

public interface BookDao {
    Book addBook(Book book);
    Book getBook(Integer book_id);
    List<Book> getAllBooks();
    List<Book> getBooksByAuthor(Integer author_id);
    void updateBook(Book book);
    void deleteBook(Integer book_id);
}
