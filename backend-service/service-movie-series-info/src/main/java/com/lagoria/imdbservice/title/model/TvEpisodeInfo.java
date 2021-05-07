package com.lagoria.imdbservice.title.model;

public class TvEpisodeInfo {

    private String seriesId;
    private String seriesTitle;
    private String seriesFullTitle;
    private String seriesYear;
    private String seriesYearEnd;
    private String seasonNumber;
    private String episodeNumber;
    private String previousEpisodeId;
    private String nextEpisodeId;

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public String getSeriesFullTitle() {
        return seriesFullTitle;
    }

    public void setSeriesFullTitle(String seriesFullTitle) {
        this.seriesFullTitle = seriesFullTitle;
    }

    public String getSeriesYear() {
        return seriesYear;
    }

    public void setSeriesYear(String seriesYear) {
        this.seriesYear = seriesYear;
    }

    public String getSeriesYearEnd() {
        return seriesYearEnd;
    }

    public void setSeriesYearEnd(String seriesYearEnd) {
        this.seriesYearEnd = seriesYearEnd;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getPreviousEpisodeId() {
        return previousEpisodeId;
    }

    public void setPreviousEpisodeId(String previousEpisodeId) {
        this.previousEpisodeId = previousEpisodeId;
    }

    public String getNextEpisodeId() {
        return nextEpisodeId;
    }

    public void setNextEpisodeId(String nextEpisodeId) {
        this.nextEpisodeId = nextEpisodeId;
    }
}
