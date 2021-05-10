package com.lagoria.imdbservice.youtube.services;

import com.lagoria.imdbservice.youtube.configuration.ImdbProperties;
import com.lagoria.imdbservice.youtube.model.YouTubeData;
import com.lagoria.imdbservice.youtube.model.YouTubePlaylistData;
import com.lagoria.imdbservice.youtube.model.YouTubeTrailerData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImdbYoutubeSerice {

    ImdbProperties imdbProperties;

    RestTemplate restTemplate;

    public ImdbYoutubeSerice(ImdbProperties imdbProperties,
                             RestTemplate restTemplate) {
        this.imdbProperties = imdbProperties;
        this.restTemplate = restTemplate;
    }

    public YouTubeTrailerData getYoutubeTrailer(String serviceUsed, String conditionSearch) {

        StringBuilder urlService = getUrlServiceIMDB(serviceUsed);
        urlService.append("/").append(imdbProperties.getApiKey())
                .append("/").append(conditionSearch);


        YouTubeTrailerData youTubeTrailerData = restTemplate
                .getForObject(
                        urlService.toString(),
                        YouTubeTrailerData.class);

        return youTubeTrailerData;

    }

    public YouTubeData getYoutubeVideo(String serviceUsed, String conditionSearch) {

        StringBuilder urlService = getUrlServiceIMDB(serviceUsed);
        urlService.append("?").append("apiKey=").append(imdbProperties.getApiKey())
                .append("&v=").append(conditionSearch);

        YouTubeData youTubeData = restTemplate.getForObject(
                urlService.toString(),
                YouTubeData.class);

        return youTubeData;

    }

    public YouTubePlaylistData getYOutubeListByConditionSearch(String serviceUsed, String conditionSearch) {
        StringBuilder urlService = getUrlServiceIMDB(serviceUsed);
        urlService.append("?").append("apiKey=").append(imdbProperties.getApiKey())
                .append("&list=").append(conditionSearch);

        YouTubePlaylistData playList = restTemplate.getForObject(urlService.toString(), YouTubePlaylistData.class);

        return playList;
    }

    protected StringBuilder getUrlServiceIMDB(String serviceUsed) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append("/API/")
                .append(serviceUsed);

        return urlBuilder;
    }
}
