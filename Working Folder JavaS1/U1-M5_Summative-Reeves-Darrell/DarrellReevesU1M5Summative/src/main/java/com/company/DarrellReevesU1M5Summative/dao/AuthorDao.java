package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Author;

import java.util.List;

public interface AuthorDao {
    Author addAuthor(Author author);
    Author getAuthor(int author_id);
    List<Author> getAllAuthors();
    void updateAuthor(int author_id);
    void deleteAuthor(int author_id);
}
