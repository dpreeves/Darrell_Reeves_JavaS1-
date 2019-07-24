package com.trilogy.DarrellReevesU1Capstone.dao;

import com.trilogy.DarrellReevesU1Capstone.model.TShirt;

import java.util.List;

public interface TShirtDao {
    TShirt addTShirt(TShirt tShirt);
    TShirt getTShirt(int tShirtId);
    List<TShirt> getAllTShirts();
    void updateTShirt(TShirt tShirt);
    void deleteTShirt(int tShirtId);
    List<TShirt> getTShirtsByColor(String color);
    List<TShirt> getTShirtsBySize(String size);

}
