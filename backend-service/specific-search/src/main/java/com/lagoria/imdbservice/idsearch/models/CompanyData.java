package com.lagoria.imdbservice.idsearch.models;

import java.util.List;

public class CompanyData {

    private String id;
    private String name;
    private List<MovieShort> items;
    private String errorMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MovieShort> getItems() {
        return items;
    }

    public void setItems(List<MovieShort> items) {
        this.items = items;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
