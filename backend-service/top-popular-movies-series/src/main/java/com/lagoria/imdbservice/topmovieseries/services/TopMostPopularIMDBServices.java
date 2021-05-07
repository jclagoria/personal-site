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

    public Top250Data getTop250Movies(String serviceUsed) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/").append(serviceUsed)
                .append("/").append(imdbProperties.getApiKey());

        Top250Data top250Movies = restTemplate.getForObject(urlBuilder.toString(), Top250Data.class);

        return top250Movies;
    }

    public Top250Data getTop250Series(String serviceUsed) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/").append(serviceUsed)
                .append("/").append(imdbProperties.getApiKey());

        Top250Data top250Series = restTemplate.getForObject(urlBuilder.toString(), Top250Data.class);

        return top250Series;

    }

    public MostPopularData getMostPopularMovies(String serviceUsed) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/").append(serviceUsed)
                .append("/").append(imdbProperties.getApiKey());

        MostPopularData mostPopularMovies = restTemplate.getForObject(urlBuilder.toString(),
                MostPopularData.class);

        return mostPopularMovies;
    }

    public MostPopularData getMostPopularTV(String serviceUsed) {

        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch()).append("/API/").append(serviceUsed)
                .append("/").append(imdbProperties.getApiKey());

        MostPopularData mostPopularTv = restTemplate.getForObject(urlBuilder.toString(),
                MostPopularData.class);

        return mostPopularTv;
    }

}
