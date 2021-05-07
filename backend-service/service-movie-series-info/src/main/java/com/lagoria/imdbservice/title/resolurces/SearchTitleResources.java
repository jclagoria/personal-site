package com.lagoria.imdbservice.title.resolurces;

import com.lagoria.imdbservice.title.configurations.ImdbProperties;
import com.lagoria.imdbservice.title.enums.ServiceNameIMDBEnum;
import com.lagoria.imdbservice.title.model.*;
import com.lagoria.imdbservice.title.services.SearchTitleImdbService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Api("Service Search info about a Title. Get info about movies or tv series or cast or writer or posters.")
@RequestMapping(path = "/v1/api/search",  produces = MediaType.APPLICATION_JSON_VALUE)
public class SearchTitleResources {

    ImdbProperties imdbProperties;
    SearchTitleImdbService searchTitleImdbService;

    public SearchTitleResources(ImdbProperties imdbProperties,
                                SearchTitleImdbService searchTitleImdbService) {
        this.imdbProperties = imdbProperties;
        this.searchTitleImdbService = searchTitleImdbService;
    }

    @ApiOperation("Search info about a Title with unique ID.")
    @GetMapping(path = "/title")
    @ResponseBody
    public TitleDataImdb getInfoByTitle(@RequestParam String idTitleImdb, @RequestParam String searchOptions){

        Optional<String> optionalSearchOptions = Optional.ofNullable(searchOptions);

        return searchTitleImdbService
                .getTitleByIdImdb(ServiceNameIMDBEnum.TITLE.getNameService(),
                        idTitleImdb, optionalSearchOptions);
    }

    @ApiOperation("Get List of Cast in a movie")
    @GetMapping(path = "/fullCast")
    @ResponseBody
    public FullCastData getFullCastByIdTtitle(@RequestParam String idTitleImdb) {
        return searchTitleImdbService.getFullCastByIdTitleImdb(
                ServiceNameIMDBEnum.FULLCAST.getNameService(), idTitleImdb);
    }

    @ApiOperation("Get Poster of Movie.")
    @GetMapping(path = "/poster")
    @ResponseBody
    public PosterData getPosterByIdTitle(@RequestParam String idTitleImdb) {
        return searchTitleImdbService.getPosterByIdTitleImdb(
                ServiceNameIMDBEnum.POSTERS.getNameService(), idTitleImdb);
    }

    @ApiOperation("Get Images about a Movie.")
    @GetMapping(path = "/images")
    @ResponseBody
    public ImageData getImageDataByIdTitle(@ApiParam("Unique Id for the Movie/Series Title.") @RequestParam String idTitleImdb,
                                           @ApiParam("can Short (default) or Full. Short parameter contains 48 images. Full parameter (tt only) contains all available images.")
                                           @RequestParam String option){

        return searchTitleImdbService.getImagenByIdTitleImdb(
                ServiceNameIMDBEnum.IMAGES.getNameService(),
                idTitleImdb, option);
    }

    @ApiOperation("Get Trailer for a movie o series according to th Unique Id")
    @GetMapping(path = "/trailer")
    @ResponseBody
    public TrailerData getTrailerDataByIdTitle(@RequestParam String idTitleImdb) {

        return searchTitleImdbService.getTraileByIdTitle(
                ServiceNameIMDBEnum.TRAILER.getNameService(),
                idTitleImdb);
    }

    @ApiOperation("Get User Raiting for a movie o series according to th Unique Id")
    @GetMapping(path = "/userRatings")
    @ResponseBody
    public UserRatingData getUserRatingByIdTitle(@RequestParam String idTitleImdb) {

        return searchTitleImdbService.getUserRaitngByIdTitle(
                ServiceNameIMDBEnum.USERRATINGS.getNameService(),
                idTitleImdb);
    }

    @ApiOperation("Get Seasion Episode of a series according to the Unique Id")
    @GetMapping(path = "/seasonEpisodes")
    @ResponseBody
    public SeasonEpisodeData getSeasonEpisodeByIdTitelAndSeasonNumber(
            @RequestParam String idTitleImdb, @RequestParam String seasonNUmber) {

        return searchTitleImdbService
                .getSeasonEpisodByTitleAndEpisodeNumber(
                        ServiceNameIMDBEnum.SEASONEPISODES.getNameService(),
                        idTitleImdb,
                        seasonNUmber);
    }

    @ApiOperation("Get external sites about movies or series according to the Unique Id")
    @GetMapping(path = "/externalSites")
    @ResponseBody
    public ExternalSiteData getExternalSiteDataByIdTitle(@RequestParam String idTitleImdb) {

        return searchTitleImdbService
                .getExternalSitesByTitleAndEpisodeNumber(
                        ServiceNameIMDBEnum.EXTERNALSITES.getNameService(),
                        idTitleImdb);
    }

    @ApiOperation("Get Info form Wikipedia about a movies or series accordign to the Unique Id")
    @GetMapping(path = "/wikipedia")
    @ResponseBody
    public WikipediaData getWikipediaDataByIdTitle(@RequestParam String idTitleImdb) {

        return searchTitleImdbService.getWikipediDataByIdTitle(
                ServiceNameIMDBEnum.WIKIPEDIA.getNameService(),
                idTitleImdb);
    }

    @ApiOperation("Get List of Movies/Series accordign to the Unique Id")
    @GetMapping(path = "/IMDBList")
    @ResponseBody
    public IMDbListData getImdbListData(@RequestParam String idTitleImdb) {

        return searchTitleImdbService.getIMDBListByIdTitle(
                ServiceNameIMDBEnum.IMDBLIST.getNameService(),
                idTitleImdb);
    }

}
