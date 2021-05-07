package com.lagoria.imdbservice.topmovieseries.enums;

public enum ServiceIMDBEnum {

    TOP_250_MOVIES("Top250Movies"),
    TOP_250_TV("Top250TVs"),
    MOST_POPULAR_MOVIES("MostPopularMovies"),
    MOST_POPULAR_TV("MostPopularTVs");

    private final String nameService;

    ServiceIMDBEnum(String nameService) {
        this.nameService = nameService;
    }

    public String getNameService() {
        return nameService;
    }
}
