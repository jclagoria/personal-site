package com.lagoria.imdbservice.title.model;

import java.util.List;

public class PosterData {

    public String imDbId;
    public String title;
    public String fullTitle;
    public String type;
    public String year;
    public List<PosterDataItem> posters;
    public List<PosterDataItem> backdors;
    public String errorMessage;

    public String getImDbId() {
        return imDbId;
    }

    public void setImDbId(String imDbId) {
        this.imDbId = imDbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<PosterDataItem> getPosters() {
        return posters;
    }

    public void setPosters(List<PosterDataItem> posters) {
        this.posters = posters;
    }

    public List<PosterDataItem> getBackdors() {
        return backdors;
    }

    public void setBackdors(List<PosterDataItem> backdors) {
        this.backdors = backdors;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}