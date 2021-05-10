package com.lagoria.imdbservice.title.model;

import java.util.List;

public class TvSeriesInfo {

    private String yearEnd;
    private String creators;
    private List<StarShort> creatorList;
    private List<String> seasons;

    public String getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(String yearEnd) {
        this.yearEnd = yearEnd;
    }

    public String getCreators() {
        return creators;
    }

    public void setCreators(String creators) {
        this.creators = creators;
    }

    public List<StarShort> getCreatorList() {
        return creatorList;
    }

    public void setCreatorList(List<StarShort> creatorList) {
        this.creatorList = creatorList;
    }

    public List<String> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<String> seasons) {
        this.seasons = seasons;
    }
}
