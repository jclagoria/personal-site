package com.lagoria.imdbservice.search.model;

import java.io.Serializable;
import java.util.List;

public class SearchImdbModel implements Serializable {

    private String searchType;
    private String expression;
    private List<ResultImdnModel> results;
    private String errorMessage;

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<ResultImdnModel> getResults() {
        return results;
    }

    public void setResults(List<ResultImdnModel> results) {
        this.results = results;
    }
}
