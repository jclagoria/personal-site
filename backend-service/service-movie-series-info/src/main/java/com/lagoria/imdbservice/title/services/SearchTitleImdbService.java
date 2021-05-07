package com.lagoria.imdbservice.title.services;

import com.lagoria.imdbservice.title.configurations.ImdbProperties;
import com.lagoria.imdbservice.title.model.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Optional;

@ApiIgnore
@Service
public class SearchTitleImdbService {

    RestTemplate restTemplate;

    ImdbProperties imdbProperties;

    public SearchTitleImdbService(RestTemplate restTemplate,
                                  ImdbProperties imdbProperties) {
        this.restTemplate = restTemplate;
        this.imdbProperties = imdbProperties;
    }

    public TitleDataImdb getTitleByIdImdb(String serviceUsed,
                                          String idTitle, Optional<String> expressionOptions) {

        StringBuilder urlBuilder = getUrlServiceIMDB(serviceUsed, idTitle);

        if(expressionOptions.isPresent()) {
            urlBuilder.append("/").append(expressionOptions.orElseGet(()-> ""));
        }

        TitleDataImdb titleData = restTemplate.getForObject(urlBuilder.toString(), TitleDataImdb.class);

        return titleData;

    }

    public FullCastData getFullCastByIdTitleImdb(String serviceUsed, String idTitle) {

        FullCastData fullCastImdb = restTemplate.getForObject(
                getUrlServiceIMDB(serviceUsed, idTitle).toString(),
                FullCastData.class);

        return fullCastImdb;
    }

    public PosterData getPosterByIdTitleImdb(String serviceUsed, String idTitle) {

        PosterData posterDataImdb = restTemplate.getForObject(
                getUrlServiceIMDB(serviceUsed, idTitle).toString(),
                PosterData.class);

        return posterDataImdb;
    }

    public ImageData getImagenByIdTitleImdb(String serviceUsed, String idTitle, String optionImage) {

        StringBuilder urlBuilder = getUrlServiceIMDB(serviceUsed, idTitle);
        urlBuilder.append("/").append(optionImage);

        ImageData imagenDataImdb = restTemplate.getForObject(urlBuilder.toString(), ImageData.class);
        return imagenDataImdb;
    }

    public TrailerData getTraileByIdTitle(String serviceUsed, String idTitle) {

        TrailerData trailerDataImdb = restTemplate
                .getForObject(getUrlServiceIMDB(serviceUsed, idTitle).toString(),
                        TrailerData.class);

        return trailerDataImdb;
    }

    public UserRatingData getUserRaitngByIdTitle(String serviceUsed, String idTitle) {

        UserRatingData userRatingImdb = restTemplate
                .getForObject(getUrlServiceIMDB(serviceUsed, idTitle).toString(),
                        UserRatingData.class);

        return userRatingImdb;
    }

    public SeasonEpisodeData getSeasonEpisodByTitleAndEpisodeNumber(String serviceUsed,
                                                                    String idTitle,
                                                                    String episodeNUmber) {

        StringBuilder urlBuilder = getUrlServiceIMDB(serviceUsed, idTitle);
        urlBuilder.append("/").append(episodeNUmber);

        SeasonEpisodeData seasonEpisodeData = restTemplate.getForObject(
                urlBuilder.toString(), SeasonEpisodeData.class);

        return seasonEpisodeData;
    }

    public ExternalSiteData getExternalSitesByTitleAndEpisodeNumber(String serviceUsed,
                                                                    String idTitle) {

        ExternalSiteData seasonEpisodeData = restTemplate.getForObject(
                getUrlServiceIMDB(serviceUsed, idTitle).toString(),
                ExternalSiteData.class);

        return seasonEpisodeData;
    }

    public WikipediaData getWikipediDataByIdTitle(String serviceUsed,
                                                  String idTitle) {

        WikipediaData wikipediaData = restTemplate.getForObject(
                getUrlServiceIMDB(serviceUsed, idTitle).toString()
                , WikipediaData.class);

        return wikipediaData;
    }

    public IMDbListData getIMDBListByIdTitle(String serviceUsed,
                                             String idTitle) {

        IMDbListData imDbListData = restTemplate.getForObject(
                getUrlServiceIMDB(serviceUsed, idTitle).toString(),
                IMDbListData.class);

        return imDbListData;
    }

    protected StringBuilder getUrlServiceIMDB(String serviceUsed,
                                           String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        return urlBuilder;
    }
}