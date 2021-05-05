package com.lagoria.imdbservice.title.model;

import java.util.List;

public class TitleDataImdb {

    private String id;
    private String title;
    private String originalTitle;
    private String fullTitle;
    private String year;
    private String releaseDate;
    private String runtimeMins;
    private String runtimeStr;
    private String plot; // IMDb Plot allways en, TMDb Plot translate
    private String plotLocal;
    private boolean plotLocalIsRtl;
    private String awards;
    private String image;
    private String type;
    private String directors;
    private List<StarShort> directorList;
    private String writers;
    private List<StarShort> writerList;
    private String stars;
    private List<StarShort> starList;
    private List<ActorShort> actorList;
    private FullCastData fullCast;
    private String genres;
    private List<KeyValueItem> genreList;
    private String companies;
    private List<CompanyShort> companyList;
    private String countries;
    private List<KeyValueItem> countryList;
    private String languages;
    private List<KeyValueItem> languageList;
    private String contentRating;
    private String iMDbRating;
    private String iMDbRatingVotes;
    private String metacriticRating;
    private RatingData ratings;
    private WikipediaData wikipedia;
    private PosterData posters;
    private ImageData images;
    private TrailerData trailer;
    private BoxOfficeShort boxOffice;
    private String tagline;
    private String keywords;
    private List<String> keywordList;
    private List<SimilarShort> similars;
    private TvSeriesInfo tvSeriesInfo;
    private TvEpisodeInfo tvEpisodeInfo;
    private String errorMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRuntimeMins() {
        return runtimeMins;
    }

    public void setRuntimeMins(String runtimeMins) {
        this.runtimeMins = runtimeMins;
    }

    public String getRuntimeStr() {
        return runtimeStr;
    }

    public void setRuntimeStr(String runtimeStr) {
        this.runtimeStr = runtimeStr;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPlotLocal() {
        return plotLocal;
    }

    public void setPlotLocal(String plotLocal) {
        this.plotLocal = plotLocal;
    }

    public boolean isPlotLocalIsRtl() {
        return plotLocalIsRtl;
    }

    public void setPlotLocalIsRtl(boolean plotLocalIsRtl) {
        this.plotLocalIsRtl = plotLocalIsRtl;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public List<StarShort> getDirectorList() {
        return directorList;
    }

    public void setDirectorList(List<StarShort> directorList) {
        this.directorList = directorList;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

    public List<StarShort> getWriterList() {
        return writerList;
    }

    public void setWriterList(List<StarShort> writerList) {
        this.writerList = writerList;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public List<StarShort> getStarList() {
        return starList;
    }

    public void setStarList(List<StarShort> starList) {
        this.starList = starList;
    }

    public List<ActorShort> getActorList() {
        return actorList;
    }

    public void setActorList(List<ActorShort> actorList) {
        this.actorList = actorList;
    }

    public FullCastData getFullCast() {
        return fullCast;
    }

    public void setFullCast(FullCastData fullCast) {
        this.fullCast = fullCast;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public List<KeyValueItem> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<KeyValueItem> genreList) {
        this.genreList = genreList;
    }

    public String getCompanies() {
        return companies;
    }

    public void setCompanies(String companies) {
        this.companies = companies;
    }

    public List<CompanyShort> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<CompanyShort> companyList) {
        this.companyList = companyList;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public List<KeyValueItem> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<KeyValueItem> countryList) {
        this.countryList = countryList;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public List<KeyValueItem> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<KeyValueItem> languageList) {
        this.languageList = languageList;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getiMDbRating() {
        return iMDbRating;
    }

    public void setiMDbRating(String iMDbRating) {
        this.iMDbRating = iMDbRating;
    }

    public String getiMDbRatingVotes() {
        return iMDbRatingVotes;
    }

    public void setiMDbRatingVotes(String iMDbRatingVotes) {
        this.iMDbRatingVotes = iMDbRatingVotes;
    }

    public String getMetacriticRating() {
        return metacriticRating;
    }

    public void setMetacriticRating(String metacriticRating) {
        this.metacriticRating = metacriticRating;
    }

    public RatingData getRatings() {
        return ratings;
    }

    public void setRatings(RatingData ratings) {
        this.ratings = ratings;
    }

    public WikipediaData getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(WikipediaData wikipedia) {
        this.wikipedia = wikipedia;
    }

    public PosterData getPosters() {
        return posters;
    }

    public void setPosters(PosterData posters) {
        this.posters = posters;
    }

    public ImageData getImages() {
        return images;
    }

    public void setImages(ImageData images) {
        this.images = images;
    }

    public TrailerData getTrailer() {
        return trailer;
    }

    public void setTrailer(TrailerData trailer) {
        this.trailer = trailer;
    }

    public BoxOfficeShort getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(BoxOfficeShort boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public List<String> getKeywordList() {
        return keywordList;
    }

    public void setKeywordList(List<String> keywordList) {
        this.keywordList = keywordList;
    }

    public List<SimilarShort> getSimilars() {
        return similars;
    }

    public void setSimilars(List<SimilarShort> similars) {
        this.similars = similars;
    }

    public TvSeriesInfo getTvSeriesInfo() {
        return tvSeriesInfo;
    }

    public void setTvSeriesInfo(TvSeriesInfo tvSeriesInfo) {
        this.tvSeriesInfo = tvSeriesInfo;
    }

    public TvEpisodeInfo getTvEpisodeInfo() {
        return tvEpisodeInfo;
    }

    public void setTvEpisodeInfo(TvEpisodeInfo tvEpisodeInfo) {
        this.tvEpisodeInfo = tvEpisodeInfo;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
