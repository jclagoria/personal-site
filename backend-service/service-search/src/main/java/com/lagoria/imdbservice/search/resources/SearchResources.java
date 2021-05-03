package com.lagoria.imdbservice.search.resources;

import com.lagoria.imdbservice.search.model.SearchImdbModel;
import com.lagoria.imdbservice.search.services.ImdbSearchServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@Api("Service Search. Get info about movies or tv series or company or name of actors/actress/writers or episodes")
@RequestMapping(path = "/v1/api/search",  produces = MediaType.APPLICATION_JSON_VALUE)
public class SearchResources {

    ImdbSearchServices searchServices;

    public SearchResources(ImdbSearchServices searchServices) {
        this.searchServices = searchServices;
    }

    @ApiOperation("Get a list of movies based on input parameter")
    @GetMapping(path = "/movie")
    @ResponseBody
    public SearchImdbModel getSearchByMovies(@RequestParam String expresionSearch) {

        SearchImdbModel resultSearch = searchServices.getSearchImdbService("SearchMovie", expresionSearch);

        return resultSearch;
    }

    @ApiOperation("Get a list of Tv Series based on input parameter")
    @GetMapping(path = "/seriesTv")
    @ResponseBody
    public void getSearchBySeries(@RequestParam String expresionSearch) {

    }

    @ApiOperation("Get a list of Campany Name based on input parameter")
    @GetMapping(path = "/company")
    @ResponseBody
    public void getSearchByCompany(@RequestParam String expresionSearch) {

    }

    @ApiOperation("Get a list of Person by Name (Actors, Actresses, Directors, Writers and ...)")
    @GetMapping(path = "/name")
    @ResponseBody
    public void getSearchPeopleByName(@RequestParam String expressionSearch) {

    }

    @ApiOperation("Get a list of Episode based on input parameter (Actors, Actresses, Directors, Writers and ...)")
    @GetMapping(path = "/episode")
    @ResponseBody
    public void getSearchByEpisode(@RequestParam String expressionSearch) {

    }

}
