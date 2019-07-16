package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Repository
public class BookDaoJdbcTemplateImpl implements BookDao {

    private JdbcTemplate jdbcTemplate;
    private static final String INSERT_BOOK_SQL = "insert into book (book_id, isbn, publish_date, author_id, title, publisher_id, price) values (?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_BOOK_SQL = "select * from book where book_id = ?";
    private static final String SELECT_ALL_BOOKS_SQL = "select * from book";
    private static final String SELECT_BOOKS_BY_AUTHOR_SQL = "select * from books where author_id = ?";
    private static final String UPDATE_BOOK_SQL = "update book set isbn = ?, publish_date = ?, author_id = ?, title = ?, publisher_id = ?, price = ? where book_id = ?";
    private static final String DELETE_BOOK = "delete from book where book_id =?";

    @Autowired
    public BookDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Transactional
    public Book addBook(Book book){
        jdbcTemplate.update(
                INSERT_BOOK_SQL,
                book.getIsbn(),
                book.getPublish_date().toString(),
                book.getAuthor_id(),
                book.getTitle(),
                book.getPublisher_id(),
                book.getPrice()
        );

        Integer book_id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()",Integer.class);

        book.setBook_id(book_id);

        return book;
    }

    @Transactional
    public Book getBook(Integer book_id){
        try{
            return jdbcTemplate.queryForObject(SELECT_BOOK_SQL, this::mapRowToBook, book_id);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Transactional
    public List<Book> getAllBooks(){
        return jdbcTemplate.query(SELECT_ALL_BOOKS_SQL, this::mapRowToBook);
    }

    @Transactional
    public List<Book> getBooksByAuthor(Integer author_id){
        return jdbcTemplate.query(SELECT_BOOKS_BY_AUTHOR_SQL, this::mapRowToBook, author_id);
    }

    @Transactional
    public void updateBook(Book book){
        jdbcTemplate.update(
                UPDATE_BOOK_SQL,
                book.getBook_id(),
                book.getIsbn(),
                book.getPublish_date().toString(),
                book.getAuthor_id(),
                book.getTitle(),
                book.getPublisher_id(),
                book.getPrice(),
                book.getBook_id());
    }

    public void deleteBook(Integer book_id){
        jdbcTemplate.update(DELETE_BOOK, book_id);
    }

    private Book mapRowToBook(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setBook_id(rs.getInt("book_id"));
        book.setIsbn(rs.getString("isbn"));
        book.setPublish_date(rs.getDate("publish_date"));
        book.setAuthor_id(rs.getInt("author_id"));
        book.setTitle(rs.getString("title"));
        book.setPublisher_id(rs.getInt("publisher_id"));
        book.setPrice(rs.getDouble("price"));

        return book;
    }



}
