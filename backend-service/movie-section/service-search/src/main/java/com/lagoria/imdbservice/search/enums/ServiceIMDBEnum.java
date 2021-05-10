package com.lagoria.imdbservice.search.enums;

public enum ServiceIMDBEnum {

    SEARCH_MOVIE("SearchMovie"),
    SEARCH_SERIES("SearchSeries"),
    SEARCH_COMPANY("SearchCompany"),
    SEARCH_NAME("SearchName"),
    SEARCH_EPISODE("SearchEpisode");

    private final String nameService;

    ServiceIMDBEnum(String nameService) {
        this.nameService = nameService;
    }

    public String getNameService() {
        return nameService;
    }
}
