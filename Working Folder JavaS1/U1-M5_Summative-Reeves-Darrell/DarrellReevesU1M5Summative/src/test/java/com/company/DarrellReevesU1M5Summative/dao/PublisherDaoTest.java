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

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PublisherDaoTest {
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
    public void addGetDeletePublisher(){
        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisher = publisherDao.addPublisher(publisher);

        Publisher publisher1 = publisherDao.getPublisher(publisher.getPublisher_id());
        assertEquals(publisher1, publisher);

        publisherDao.deletePublisher(publisher.getPublisher_id());
        publisher1 = publisherDao.getPublisher(publisher.getPublisher_id());
        assertNull(publisher1);

    }

    @Test
    public void getAllPublishers(){
        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setName("Jones Publishing");
        publisher.setStreet("101 south main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@jones.com");
        publisherDao.addPublisher(publisher);

        List<Publisher> publisherList = publisherDao.getAllPublishers();
        assertEquals(publisherList.size(), 2);
    }

    @Test
    public void updatePublisher(){
        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisherDao.addPublisher(publisher);


        publisher.setName("Jones Publishing");
        publisher.setStreet("101 south main street");
        publisherDao.updatePublisher(publisher);

        Publisher publisher1 = publisherDao.getPublisher(publisher.getPublisher_id());
        assertEquals(publisher1, publisher);
    }
}
