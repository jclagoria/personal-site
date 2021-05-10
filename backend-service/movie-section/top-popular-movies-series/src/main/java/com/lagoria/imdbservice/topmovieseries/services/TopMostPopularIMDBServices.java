package com.lagoria.imdbservice.topmovieseries.services;

import com.lagoria.imdbservice.topmovieseries.configurations.ImdbProperties;
import com.lagoria.imdbservice.topmovieseries.model.MostPopularData;
import com.lagoria.imdbservice.topmovieseries.model.Top250Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TopMostPopularIMDBServices {

    ImdbProperties imdbProperties;

    RestTemplate restTemplate;

    public TopMostPopularIMDBServices(RestTemplate restTemplate,
                                      ImdbProperties imdbProperties) {
        this.restTemplate = restTemplate;
        this.imdbProperties = imdbProperties;
    }

    public Top250Data getTop250Data(String serviceUsed) {
        Top250Data top250Movies = restTemplate.getForObject(
                getServiceURLIMDB(serviceUsed).toString(),
                Top250Data.class);

        return top250Movies;
    }

    public MostPopularData getMostPopularData(String serviceUsed) {
        MostPopularData mostPopularMovies = restTemplate.getForObject(
                getServiceURLIMDB(serviceUsed).toString(),
                MostPopularData.class);

        return mostPopularMovies;
    }

    protected StringBuilder getServiceURLIMDB(String serviceUsed) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/").append(serviceUsed)
                .append("/").append(imdbProperties.getApiKey());

        return urlBuilder;
    }

}
