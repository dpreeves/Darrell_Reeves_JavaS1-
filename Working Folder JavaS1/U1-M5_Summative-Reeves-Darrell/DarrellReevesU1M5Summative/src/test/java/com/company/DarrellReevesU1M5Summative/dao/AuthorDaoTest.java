package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Author;
import com.company.DarrellReevesU1M5Summative.model.Book;
import com.company.DarrellReevesU1M5Summative.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AuthorDaoTest {
    @Autowired
    BookDao bookDao;
    @Autowired
    AuthorDao authorDao;
    @Autowired
    PublisherDao publisherDao;

    @Before
    public void setUp() throws Exception {
        List<Book> bookList =bookDao.getAllBooks();
        for (Book book: bookList){
            bookDao.deleteBook(book.getBook_id());
        }

        List<Author> authorList = authorDao.getAllAuthors();
        for (Author author: authorList){
            authorDao.deleteAuthor(author.getAuthor_id());
        }
        List<Publisher> publisherList = publisherDao.getAllPublishers();
        for (Publisher publisher: publisherList){
            publisherDao.deletePublisher(publisher.getPublisher_id());
        }
    }

    @Test
    public void addGetDeleteAuthor(){
        Author author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Smith");
        author.setStreet("101 main street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@smith.com");
        authorDao.addAuthor(author);

        Author author1 = authorDao.getAuthor(author.getAuthor_id());

        assertEquals(author1, author);

        authorDao.deleteAuthor(author.getAuthor_id());

        author1 = authorDao.getAuthor(author.getAuthor_id());

        assertNull(author1);
    }

    @Test
    public void getAllAuthors(){
        Author author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Smith");
        author.setStreet("101 main street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@smith.com");
        authorDao.addAuthor(author);

        author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Jones");
        author.setStreet("101 south street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@jones.com");
        authorDao.addAuthor(author);

        List<Author> authorList = authorDao.getAllAuthors();
        assertEquals(authorList.size(), 2);
    }

    @Test
    public void update(){
        Author author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Smith");
        author.setStreet("101 main street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@smith.com");
        authorDao.addAuthor(author);

        author.setFirst_name("Mike");
        author.setLast_name("Jones");
        author.setStreet("101 south street");

        Author author1 = authorDao.getAuthor(author.getAuthor_id());

        assertEquals(author1, author);


    }
}
