package com.trilogy.DarrellReevesU1Capstone.viewmodel;

import java.math.BigDecimal;
import java.util.Objects;

public class GameViewModel {

    private int gameId;
    private String title;
    private String esrbRating;
    private String description;
    private BigDecimal price;
    private String studio;
    private int quantity;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEsrbRating() {
        return esrbRating;
    }

    public void setEsrbRating(String esrbRating) {
        this.esrbRating = esrbRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameViewModel that = (GameViewModel) o;
        return gameId == that.gameId &&
                quantity == that.quantity &&
                title.equals(that.title) &&
                esrbRating.equals(that.esrbRating) &&
                description.equals(that.description) &&
                price.equals(that.price) &&
                studio.equals(that.studio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, title, esrbRating, description, price, studio, quantity);
    }
}
