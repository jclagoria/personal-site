package com.lagoria.imdbservice.youtube.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;

@Configuration
@ConfigurationProperties(prefix = "api.imdb")
@EnableConfigurationProperties
@ApiIgnore
public class ImdbProperties {

    private String urlService;
    private String languageSearch;
    private String apiKey;

    public String getUrlService() {
        return urlService;
    }

    public void setUrlService(String urlService) {
        this.urlService = urlService;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getLanguageSearch() {
        return languageSearch;
    }

    public void setLanguageSearch(String languageSearch) {
        this.languageSearch = languageSearch;
    }
}
