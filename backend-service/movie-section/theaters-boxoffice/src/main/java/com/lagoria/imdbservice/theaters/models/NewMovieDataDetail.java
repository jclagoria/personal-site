package com.lagoria.imdbservice.theaters.models;

import java.util.List;

public class NewMovieDataDetail {

    private String id;
    private String title;
    private String fullTitle;
    private String year;
    private String releaseState;
    private String image;
    private String runtimeMins;
    private String runtimeStr;
    private String plot;
    private String contentRating;
    private String imDbRating;
    private String imDbRatingCount;
    private String metacriticRating;
    private String genres;
    private List<KeyValueItem> genreList;
    private String directors;
    private List<StarShort> directorList;
    private String Stars;
    private List<StarShort> starList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReleaseState() {
        return releaseState;
    }

    public void setReleaseState(String releaseState) {
        this.releaseState = releaseState;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRuntimeMins() {
        return runtimeMins;
    }

    public void setRuntimeMins(String runtimeMins) {
        this.runtimeMins = runtimeMins;
    }

    public String getRuntimeStr() {
        return runtimeStr;
    }

    public void setRuntimeStr(String runtimeStr) {
        this.runtimeStr = runtimeStr;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public void setImDbRating(String imDbRating) {
        this.imDbRating = imDbRating;
    }

    public String getImDbRatingCount() {
        return imDbRatingCount;
    }

    public void setImDbRatingCount(String imDbRatingCount) {
        this.imDbRatingCount = imDbRatingCount;
    }

    public String getMetacriticRating() {
        return metacriticRating;
    }

    public void setMetacriticRating(String metacriticRating) {
        this.metacriticRating = metacriticRating;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public List<KeyValueItem> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<KeyValueItem> genreList) {
        this.genreList = genreList;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public List<StarShort> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<StarShort> directorList) {
        this.directorList = directorList;
    }

    public String getStars() {
        return Stars;
    }

    public void setStars(String stars) {
        Stars = stars;
    }

    public List<StarShort> getStarList() {
        return starList;
    }

    public void setStarList(List<StarShort> starList) {
        this.starList = starList;
    }
}
