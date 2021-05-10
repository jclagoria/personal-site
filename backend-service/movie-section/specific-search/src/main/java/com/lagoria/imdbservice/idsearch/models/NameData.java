package com.lagoria.imdbservice.idsearch.models;

import java.util.List;

public class NameData {

    private String id;
    private String name;
    private String role;
    private String image;
    private String summary;
    private String birthDate;
    private String deathDate;
    private String awards;
    private String height;
    private List<KnownFor> knownFors;
    private List<CastMovie> castMovies;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public List<KnownFor> getKnownFors() {
        return knownFors;
    }

    public void setKnownFors(List<KnownFor> knownFors) {
        this.knownFors = knownFors;
    }

    public List<CastMovie> getCastMovies() {
        return castMovies;
    }

    public void setCastMovies(List<CastMovie> castMovies) {
        this.castMovies = castMovies;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
