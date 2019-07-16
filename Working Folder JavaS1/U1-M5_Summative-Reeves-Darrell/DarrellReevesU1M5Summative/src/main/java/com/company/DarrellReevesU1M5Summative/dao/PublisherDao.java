package com.company.DarrellReevesU1M5Summative.dao;

import com.company.DarrellReevesU1M5Summative.model.Publisher;

import java.util.List;

public interface PublisherDao {
    Publisher addPublisher(Publisher publisher);
    Publisher getPublisher(int publisher_id);
    List<Publisher> getAllPublishers();
    void updatePublisher(Publisher publisher);
    void deletePublisher(int publisher_id);
}
