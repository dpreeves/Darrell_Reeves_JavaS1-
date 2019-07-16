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

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoTest {
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
    public void addGetDeleteBook(){

        Author author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Smith");
        author.setStreet("101 main street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@smith.com");
        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author.getAuthor_id());
        book.setTitle("Best Book");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(5.99);
        book = bookDao.addBook(book);

        Book book1 = bookDao.getBook(book.getBook_id());

        assertEquals(book, book1);

        bookDao.deleteBook(book.getBook_id());

        book1 = bookDao.getBook(book.getBook_id());

        assertNull(book1);


    }

    @Test
    public void getAllBooks(){
        Author author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Smith");
        author.setStreet("101 main street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@smith.com");
        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author.getAuthor_id());
        book.setTitle("Best Book");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(5.99);
        book = bookDao.addBook(book);


        book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author.getAuthor_id());
        book.setTitle("Best Book1");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(15.99);
        book = bookDao.addBook(book);

        List<Book> bookList = bookDao.getAllBooks();

        assertEquals(bookList.size(), 2);
    }

    @Test
    public void updateBook(){
        Author author = new Author();
        author.setFirst_name("Mike");
        author.setLast_name("Smith");
        author.setStreet("101 main street");
        author.setCity("Charlotte");
        author.setState("NC");
        author.setPostal_code("28232");
        author.setPhone("7045551234");
        author.setEmail("mike@smith.com");
        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author.getAuthor_id());
        book.setTitle("Best Book");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(5.99);
        book = bookDao.addBook(book);

        book.setTitle("Best New Book");
        book.setPrice(7.99);
        bookDao.updateBook(book);

        Book book1 = bookDao.getBook(book.getBook_id());
        assertEquals(book1, book);
    }

    @Test
    public void getBooksByAuthor(){
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

        Author author1 = new Author();
        author1.setFirst_name("Mike");
        author1.setLast_name("Jones");
        author1.setStreet("101 south street");
        author1.setCity("Charlotte");
        author1.setState("NC");
        author1.setPostal_code("28232");
        author1.setPhone("7045551234");
        author1.setEmail("mike@jones.com");
        authorDao.addAuthor(author1);

        Publisher publisher = new Publisher();
        publisher.setName("Smith Publishing");
        publisher.setStreet("101 north main street");
        publisher.setCity("Charlotte");
        publisher.setState("NC");
        publisher.setPostal_code("28212");
        publisher.setPhone("7043331234");
        publisher.setEmail("info@smith.com");
        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author.getAuthor_id());
        book.setTitle("Best Book");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(5.99);
        book = bookDao.addBook(book);


        book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author.getAuthor_id());
        book.setTitle("Best Book1");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(15.99);
        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("123456");
        book.setPublish_date(Date.valueOf(LocalDate.of(2010, 1, 5)));
        book.setAuthor_id(author1.getAuthor_id());
        book.setTitle("Best Book2");
        book.setPublisher_id(publisher.getPublisher_id());
        book.setPrice(1.99);
        book = bookDao.addBook(book);

        List<Book> bookList = bookDao.getBooksByAuthor(author.getAuthor_id());
        assertEquals(bookList.size(), 2);

        bookList = bookDao.getBooksByAuthor(author1.getAuthor_id());
        assertEquals(bookList.size(), 1);
    }

}
