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

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/").append(serviceUsed)
                .append("/").append(imdbProperties.getApiKey()).append("/").append(idTitle);

        if(expressionOptions.isPresent()) {
            urlBuilder.append("/").append(expressionOptions.orElseGet(()-> ""));
        }

        TitleDataImdb titleData = restTemplate.getForObject(urlBuilder.toString(), TitleDataImdb.class);

        return titleData;

    }

    public FullCastData getFullCastByIdTitleImdb(String serviceUsed, String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        FullCastData fullCastImdb = restTemplate.getForObject(urlBuilder.toString(), FullCastData.class);

        return fullCastImdb;
    }

    public PosterData getPosterByIdTitleImdb(String serviceUsed, String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        PosterData posterDataImdb = restTemplate.getForObject(urlBuilder.toString(), PosterData.class);

        return posterDataImdb;
    }

    public ImageData getImagenByIdTitleImdb(String serviceUsed, String idTitle, String optionImage) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle)
                .append("/").append(optionImage);

        ImageData imagenDataImdb = restTemplate.getForObject(urlBuilder.toString(), ImageData.class);
        return imagenDataImdb;
    }

    public TrailerData getTraileByIdTitle(String serviceUsed, String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        TrailerData trailerDataImdb = restTemplate
                .getForObject(urlBuilder.toString(), TrailerData.class);

        return trailerDataImdb;
    }

    public UserRatingData getUserRaitngByIdTitle(String serviceUsed, String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        UserRatingData userRatingImdb = restTemplate
                .getForObject(urlBuilder.toString(), UserRatingData.class);

        return userRatingImdb;
    }

    public SeasonEpisodeData getSeasonEpisodByTitleAndEpisodeNumber(String serviceUsed,
                                                                    String idTitle,
                                                                    String episodeNUmber) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle)
                .append("/").append(episodeNUmber);

        SeasonEpisodeData seasonEpisodeData = restTemplate.getForObject(
                urlBuilder.toString(), SeasonEpisodeData.class);

        return seasonEpisodeData;
    }

    public ExternalSiteData getExternalSitesByTitleAndEpisodeNumber(String serviceUsed,
                                                                    String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        ExternalSiteData seasonEpisodeData = restTemplate.getForObject(
                urlBuilder.toString(), ExternalSiteData.class);

        return seasonEpisodeData;
    }

    public WikipediaData getWikipediDataByIdTitle(String serviceUsed,
                                                  String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        WikipediaData wikipediaData = restTemplate.getForObject(urlBuilder.toString()
                , WikipediaData.class);

        return wikipediaData;
    }

    public IMDbListData getIMDBListByIdTitle(String serviceUsed,
                                             String idTitle) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/")
                .append(serviceUsed).append("/").append(imdbProperties.getApiKey())
                .append("/").append(idTitle);

        IMDbListData imDbListData = restTemplate.getForObject(urlBuilder.toString(),
                IMDbListData.class);

        return imDbListData;
    }

}
