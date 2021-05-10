package com.lagoria.imdbservice.theaters.models;

public class BoxOfficeAllTimeDataDetail {

    private String id;
    private String rank;
    private String title;
    private String worldwideLifetimeGross;
    private String domesticLifetimeGross;
    private String domestic;
    private String foreignLifetimeGross;
    private String foreign;
    private String year;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWorldwideLifetimeGross() {
        return worldwideLifetimeGross;
    }

    public void setWorldwideLifetimeGross(String worldwideLifetimeGross) {
        this.worldwideLifetimeGross = worldwideLifetimeGross;
    }

    public String getDomesticLifetimeGross() {
        return domesticLifetimeGross;
    }

    public void setDomesticLifetimeGross(String domesticLifetimeGross) {
        this.domesticLifetimeGross = domesticLifetimeGross;
    }

    public String getDomestic() {
        return domestic;
    }

    public void setDomestic(String domestic) {
        this.domestic = domestic;
    }

    public String getForeignLifetimeGross() {
        return foreignLifetimeGross;
    }

    public void setForeignLifetimeGross(String foreignLifetimeGross) {
        this.foreignLifetimeGross = foreignLifetimeGross;
    }

    public String getForeign() {
        return foreign;
    }

    public void setForeign(String foreign) {
        this.foreign = foreign;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
