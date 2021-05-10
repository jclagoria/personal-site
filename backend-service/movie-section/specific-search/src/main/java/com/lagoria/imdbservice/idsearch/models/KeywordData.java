package com.lagoria.imdbservice.idsearch.models;

import java.util.List;

public class KeywordData {

    private String keyword;
    private List<MovieShort> items;
    private String errorMessage;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
