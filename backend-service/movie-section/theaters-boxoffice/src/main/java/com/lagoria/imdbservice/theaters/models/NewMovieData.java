package com.lagoria.imdbservice.theaters.models;

import java.util.List;

public class NewMovieData {

    private List<NewMovieDataDetail> items;
    private String errorMessage;

    public List<NewMovieDataDetail> getItems() {
        return items;
    }

    public void setItems(List<NewMovieDataDetail> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
