package com.lagoria.imdbservice.theaters.services;

import com.lagoria.imdbservice.theaters.configuration.ImdbProperties;
import com.lagoria.imdbservice.theaters.models.BoxOfficeAllTimeData;
import com.lagoria.imdbservice.theaters.models.BoxOfficeWeekendData;
import com.lagoria.imdbservice.theaters.models.NewMovieData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;

@Service
public class IMDBService {

    RestTemplate restTemplate;

    ImdbProperties imdbProperties;

    public IMDBService(RestTemplate restTemplate, ImdbProperties imdbProperties) {
        this.restTemplate = restTemplate;
        this.imdbProperties = imdbProperties;
    }

    public NewMovieData getListOfNewMovies(String nameOfService) {

        NewMovieData newMovieData = restTemplate
                .getForObject(getUrlServiceIMDB(nameOfService).toString(),
                        NewMovieData.class);

        return newMovieData;
    }

    public BoxOfficeWeekendData getListBoxOfficeWeekend(String nameOfService) {
        BoxOfficeWeekendData boxOfficeWeekend = restTemplate
                .getForObject(getUrlServiceIMDB(nameOfService).toString(),
                        BoxOfficeWeekendData.class);

        return  boxOfficeWeekend;
    }

    public BoxOfficeAllTimeData getListBoxOfficeAllTime(String nameOFService) {

        BoxOfficeAllTimeData boxOfficeAllTimeData = restTemplate
                .getForObject(getUrlServiceIMDB(nameOFService).toString(),
                        BoxOfficeAllTimeData.class);

        return boxOfficeAllTimeData;
    }

    private StringBuilder getUrlServiceIMDB(String nameOfService) {

        StringBuilder builderUrl = new StringBuilder();
        builderUrl.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch())
                .append("/API/").append(nameOfService).append("/")
                .append(imdbProperties.getApiKey());

        return builderUrl;
    }

}
