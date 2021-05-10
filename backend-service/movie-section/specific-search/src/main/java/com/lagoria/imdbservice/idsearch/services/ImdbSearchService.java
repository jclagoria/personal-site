package com.lagoria.imdbservice.idsearch.services;

import com.lagoria.imdbservice.idsearch.configuration.ImdbProperties;
import com.lagoria.imdbservice.idsearch.models.CompanyData;
import com.lagoria.imdbservice.idsearch.models.KeywordData;
import com.lagoria.imdbservice.idsearch.models.NameData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImdbSearchService {

    ImdbProperties imdbProperties;

    RestTemplate restTemplate;

    public ImdbSearchService(ImdbProperties imdbProperties, RestTemplate restTemplate) {
        this.imdbProperties = imdbProperties;
        this.restTemplate = restTemplate;
    }

    public NameData getNameInfoById(String urlSearch, String expresionSearch) {

        NameData nameData = restTemplate
                .getForObject(getURLServiceIMDB(
                        urlSearch,expresionSearch).toString(),
                        NameData.class);
        return nameData;
    }

    public CompanyData getCompanyinfoById(String urlSearch, String expresionSearch) {

        CompanyData companyData = restTemplate
                .getForObject(getURLServiceIMDB(urlSearch, expresionSearch).toString(),
                        CompanyData.class);

        return companyData;
    }

    public KeywordData getKeyWordInfoById(String urlSearch, String expresionSearch) {

        KeywordData keywordData = restTemplate.getForObject(
                getURLServiceIMDB(urlSearch, expresionSearch).toString(),
                KeywordData.class);

        return keywordData;
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
