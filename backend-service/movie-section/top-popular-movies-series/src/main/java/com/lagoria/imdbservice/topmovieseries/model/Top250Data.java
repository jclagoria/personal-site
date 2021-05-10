package com.lagoria.imdbservice.topmovieseries.model;

import java.util.List;

public class Top250Data {

    private List<Top250DataDetail> items;
    private String errorMessage;

    public List<Top250DataDetail> getItems() {
        return items;
    }

    public void setItems(List<Top250DataDetail> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
