package com.lagoria.imdbservice.theaters.models;

import java.util.List;

public class BoxOfficeWeekendData {

    private List<BoxOfficeWeekendDataDetail> items;
    private String ErrorMessage;

    public List<BoxOfficeWeekendDataDetail> getItems() {
        return items;
    }

    public void setItems(List<BoxOfficeWeekendDataDetail> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }
}
