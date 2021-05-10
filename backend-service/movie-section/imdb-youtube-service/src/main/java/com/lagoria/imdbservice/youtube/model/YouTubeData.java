package com.lagoria.imdbservice.youtube.model;

import java.util.List;

public class YouTubeData {

    private String videoId;
    private String title;
    private String description;
    private String duration;
    private String uploadDate;
    private String image;
    private List<YouTubeDataItem> videos;
    private String errorMessage;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<YouTubeDataItem> getVideos() {
        return videos;
    }

    public void setVideos(List<YouTubeDataItem> videos) {
        this.videos = videos;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}