package com.lagoria.imdbservice.topmovieseries.model;

import java.util.List;

public class MostPopularData {

    public List<MostPopularDataDetail> items;
    public String errorMessage;

    public List<MostPopularDataDetail> getItems() {
        return items;
    }

    public void setItems(List<MostPopularDataDetail> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
