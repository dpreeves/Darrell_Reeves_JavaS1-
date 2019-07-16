package com.company.DarrellReevesU1M5Summative.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Book {
    private Integer book_id;
    private String isbn;
    private Date publish_date;
    private Integer author_id;
    private String title;
    private Integer publisher_id;
    private Double price;

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Integer publisher_id) {
        this.publisher_id = publisher_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return book_id.equals(book.book_id) &&
                Objects.equals(isbn, book.isbn) &&
                Objects.equals(publish_date, book.publish_date) &&
                author_id.equals(book.author_id) &&
                Objects.equals(title, book.title) &&
                publisher_id.equals(book.publisher_id) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_id, isbn, publish_date, author_id, title, publisher_id, price);
    }
}
