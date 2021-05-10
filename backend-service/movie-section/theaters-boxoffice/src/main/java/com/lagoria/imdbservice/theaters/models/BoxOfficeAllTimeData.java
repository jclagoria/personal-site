package com.lagoria.imdbservice.theaters.models;

import java.util.List;

public class BoxOfficeAllTimeData {

    private List<BoxOfficeAllTimeDataDetail> items;
    private String errorMessage;

    public List<BoxOfficeAllTimeDataDetail> getItems() {
        return items;
    }

    public void setItems(List<BoxOfficeAllTimeDataDetail> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
