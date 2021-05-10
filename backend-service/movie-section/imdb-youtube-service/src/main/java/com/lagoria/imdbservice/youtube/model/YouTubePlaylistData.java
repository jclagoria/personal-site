package com.lagoria.imdbservice.youtube.model;

import java.util.List;

public class YouTubePlaylistData {

    private String title;
    private String auhtor;
    private List<YouTubePlaylistDataItem> videos;
    private String errorMessage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuhtor() {
        return auhtor;
    }

    public void setAuhtor(String auhtor) {
        this.auhtor = auhtor;
    }

    public List<YouTubePlaylistDataItem> getVideos() {
        return videos;
    }

    public void setVideos(List<YouTubePlaylistDataItem> videos) {
        this.videos = videos;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
