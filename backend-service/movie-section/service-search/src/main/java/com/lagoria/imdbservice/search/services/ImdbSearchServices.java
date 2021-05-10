package com.lagoria.imdbservice.search.services;

import com.lagoria.imdbservice.search.configuration.ImdbProperties;
import com.lagoria.imdbservice.search.model.SearchImdbModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Service
public class ImdbSearchServices {

    RestTemplate restTemplate;

    ImdbProperties imdbProperties;

    public ImdbSearchServices(RestTemplate restTemplate, ImdbProperties imdbProperties) {
        this.restTemplate = restTemplate;
        this.imdbProperties = imdbProperties;
    }

    public SearchImdbModel getSearchImdbService(String urlSearch, String expresionSearch) {


        SearchImdbModel search = restTemplate.getForObject(
                getURLServiceIMDB(urlSearch, expresionSearch).toString(),
                SearchImdbModel.class);

        return search;
    }

    protected StringBuilder getURLServiceIMDB(String urlSearch, String expresionSearch) {

        StringBuilder builderUrl = new StringBuilder();
        builderUrl.append(imdbProperties.getUrlService())
                .append(imdbProperties.getLanguageSearch())
                .append("/API/").append(urlSearch).append("/")
                .append(imdbProperties.getApiKey()).append("/")
                .append(expresionSearch);

        return builderUrl;
    }
}