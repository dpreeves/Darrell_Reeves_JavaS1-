package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AuthorDaoJdbcTemplateImpl {
    private JdbcTemplate jdbcTemplate;
    private static final String INSERT_AUTHOR_SQL = "insert into author (first_name, last_name, street, city, state, postal_code, phone, email) values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_AUTHOR_SQL = "select * from author where author_id = ?";
    private static final String SELECT_ALL_AUTHORS_SQL = "select * from author";
    private static final String UPDATE_AUTHOR_SQL = "update author set first_name = ?, last_name = ?," +
            " street = ?, city = ?, state = ?, postal_code = ?, phone = ?, email = ? where author_id = ?";
    private static final String DELETE_AUTHOR_SQL = " delete from author where author_id = ?";

    @Autowired
    public AuthorDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public Author addAuthor(Author author){
        jdbcTemplate.update(INSERT_AUTHOR_SQL, author.getFirst_name(), author.getLast_name(), author.getStreet(), author.getCity(), author.getState(), author.getPostal_code(), author.getPhone(), author.getEmail());

        Integer author_id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        author.setAuthor_id(author_id);
        return author;
    }

    @Transactional
    public Author getAuthor(Integer author_id){
        try{
            return jdbcTemplate.queryForObject(SELECT_AUTHOR_SQL, this::mapRowToAuthor);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Transactional
    public List<Author> getAllAuthors(){
        return jdbcTemplate.query(SELECT_ALL_AUTHORS_SQL, this::mapRowToAuthor);
    }

    @Transactional
    public void updateAuthor(Author author){
        jdbcTemplate.update(UPDATE_AUTHOR_SQL,author.getAuthor_id(), author.getFirst_name(), author.getLast_name(), author.getStreet(), author.getCity(), author.getState(), author.getPostal_code(), author.getPhone(), author.getEmail());
    }

    @Transactional
    public void deleteAuthor(Integer author_id){
        jdbcTemplate.update(DELETE_AUTHOR_SQL, author_id);
    }

    private Author mapRowToAuthor(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setAuthor_id(rs.getInt("author_id"));
        author.setFirst_name(rs.getString("first_name"));
        author.setLast_name(rs.getString("last_name"));
        author.setStreet(rs.getString("street"));
        author.setCity(rs.getString("city"));
        author.setState(rs.getString("state"));
        author.setPostal_code(rs.getString("postal_code"));
        author.setPhone(rs.getString("phone"));
        author.setEmail(rs.getString("email"));

        return author;
    }

}