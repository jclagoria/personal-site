package com.lagoria.imdbservice.title.enums;

public enum ServiceNameIMDBEnum {

    TITLE("Title"),
    FULLCAST("FullCast"),
    POSTERS("Posters"),
    IMAGES("Images"),
    TRAILER("Trailer"),
    USERRATINGS("UserRatings"),
    SEASONEPISODES("SeasonEpisodes"),
    EXTERNALSITES("ExternalSites"),
    WIKIPEDIA("Wikipedia"),
    IMDBLIST("IMDBList");

    private final String nameService;

    ServiceNameIMDBEnum(String nameService) {
        this.nameService = nameService;
    }

    public String getNameService() {
        return nameService;
    }
}
