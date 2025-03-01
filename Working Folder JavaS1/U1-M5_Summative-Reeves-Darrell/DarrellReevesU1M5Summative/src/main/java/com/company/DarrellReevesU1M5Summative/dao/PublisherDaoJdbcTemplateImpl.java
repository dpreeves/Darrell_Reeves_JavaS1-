package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PublisherDaoJdbcTemplateImpl {
        private JdbcTemplate jdbcTemplate;
        private static final String INSERT_PUBLISHER_SQL = "insert into publisher (name, street, city, state, postal_code, phone, email) values (?, ?, ?, ?, ?, ?, ?)";
        private static final String SELECT_PUBLISHER_SQL = "select * from publisher where publisher_id = ?";
        private static final String SELECT_ALL_PUBLISHERS = "select * from publisher";
        private static final String UPDATE_PUBLISHER_SQL = "update publisher set name = ?," +
                " street = ?, city = ?, state = ?, postal_code = ?, phone = ?, email = ? where publisher_id = ?";
        private static final String DELETE_PUBLISHER_SQL = " delete from publisher where publisher_id = ?";

        @Autowired
        public PublisherDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){
            this.jdbcTemplate = jdbcTemplate;
        }

        @Transactional
        public Publisher addPublisher(Publisher publisher){
            jdbcTemplate.update(INSERT_PUBLISHER_SQL, publisher.getName(), publisher.getStreet(), publisher.getCity(), publisher.getState(), publisher.getPostal_code(), publisher.getPhone(), publisher.getEmail());

            Integer publisher_id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

            publisher.setPublisher_id(publisher_id);
            return publisher;
        }


        public Publisher getPublisher(Integer publisher_id){
            try{
                return jdbcTemplate.queryForObject(SELECT_PUBLISHER_SQL, this::mapRowToPublisher);
            } catch (EmptyResultDataAccessException e){
                return null;
            }
        }


        public List<Publisher> getAllPublishers(){
            return jdbcTemplate.query(SELECT_ALL_PUBLISHERS, this::mapRowToPublisher);
        }


        public void updatePublisher(Publisher publisher){
            jdbcTemplate.update(UPDATE_PUBLISHER_SQL, publisher.getPublisher_id(), publisher.getName(), publisher.getStreet(), publisher.getCity(), publisher.getState(), publisher.getPostal_code(), publisher.getPhone(), publisher.getEmail());
        }


        public void deletePublisher(Integer publisher_id){
            jdbcTemplate.update(DELETE_PUBLISHER_SQL, publisher_id);
        }

        private Publisher mapRowToPublisher(ResultSet rs, int rowNum) throws SQLException {
            Publisher publisher = new Publisher();
            publisher.setPublisher_id(rs.getInt("publisher_id"));
            publisher.setName(rs.getString("name"));
            publisher.setStreet(rs.getString("street"));
            publisher.setCity(rs.getString("city"));
            publisher.setState(rs.getString("state"));
            publisher.setPostal_code(rs.getString("postal_code"));
            publisher.setPhone(rs.getString("phone"));
            publisher.setEmail(rs.getString("email"));

            return publisher;
        }

    }

