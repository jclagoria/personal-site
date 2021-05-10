package com.lagoria.imdbservice.youtube.enums;

public enum ServiceNameImdbEnum {

    YOUTUBE_TRAILER("YouTubeTrailer"),
    YOUTUBE("YouTube"),
    YOUTUBE_PLAYLIST("YouTubePlaylist");

    private String nameService;

    ServiceNameImdbEnum(String nameService) {
        this.nameService = nameService;
    }

    public String getNameService() {
        return nameService;
    }
}
