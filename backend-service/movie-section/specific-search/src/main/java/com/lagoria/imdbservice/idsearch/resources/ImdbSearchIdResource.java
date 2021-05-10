package com.lagoria.imdbservice.idsearch.resources;

import com.lagoria.imdbservice.idsearch.enums.ServiceIMDBEnum;
import com.lagoria.imdbservice.idsearch.models.CompanyData;
import com.lagoria.imdbservice.idsearch.models.KeywordData;
import com.lagoria.imdbservice.idsearch.models.NameData;
import com.lagoria.imdbservice.idsearch.services.ImdbSearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("Service Search. Get info about Actors or Directors and Company Info and search by keywords")
@RequestMapping(path = "/v1/api/searchBy",  produces = MediaType.APPLICATION_JSON_VALUE)
public class ImdbSearchIdResource {

    ImdbSearchService imdbSearchService;

    public ImdbSearchIdResource(ImdbSearchService imdbSearchService) {
        this.imdbSearchService = imdbSearchService;
    }

    @GetMapping("/idName")
    @ApiOperation("Get info about Actors/Directors by id.")
    public NameData getNameInfoById(@RequestParam String idName) {
        return imdbSearchService
                .getNameInfoById(
                        ServiceIMDBEnum.NAME.getServiceName(),
                        idName);
    }

    @GetMapping("/idCompany")
    @ApiOperation("Get info about Actors/Directors by id.")
    public CompanyData getCompanuNameInfoById(@RequestParam String idNameCompany) {

        return imdbSearchService.getCompanyinfoById(
                ServiceIMDBEnum.COMPANY.getServiceName(),
                idNameCompany);
    }

    @GetMapping("/idkeyword")
    @ApiOperation("Get info about the keyword by id.")
    public KeywordData getKeywordById(@RequestParam String idKeyword) {

        return imdbSearchService.getKeyWordInfoById(
                ServiceIMDBEnum.KEYWORD.getServiceName(),
                idKeyword);
    }

}
