package com.lagoria.imdbservice.title.model;

import java.util.List;

public class SeasonEpisodeData {

    private String imDbId;
    private String title;
    private String fullTitle;
    private String type;
    private String year;
    private List<EpisodeShortDetail> episodes;
    private String errorMessage;

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

    public List<EpisodeShortDetail> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<EpisodeShortDetail> episodes) {
        this.episodes = episodes;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
