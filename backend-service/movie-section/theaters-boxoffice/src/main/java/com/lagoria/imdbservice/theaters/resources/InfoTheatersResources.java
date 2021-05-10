package com.lagoria.imdbservice.theaters.resources;

import com.lagoria.imdbservice.theaters.enums.ServiceNameEnum;
import com.lagoria.imdbservice.theaters.models.BoxOfficeAllTimeData;
import com.lagoria.imdbservice.theaters.models.BoxOfficeWeekendData;
import com.lagoria.imdbservice.theaters.models.NewMovieData;
import com.lagoria.imdbservice.theaters.services.IMDBService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiOperation("Service Get info about movies in theaters and info about BoxOffice")
@RequestMapping(path = "/v1/api/movies",  produces = MediaType.APPLICATION_JSON_VALUE)
public class InfoTheatersResources {

    IMDBService imdbService;

    public InfoTheatersResources(IMDBService imdbService) {
        this.imdbService = imdbService;
    }

    @GetMapping("/theaters")
    @ApiOperation("Get list of Movies in theaters")
    public NewMovieData getListOfMoviesInTheaters() {
        return imdbService
                .getListOfNewMovies(ServiceNameEnum
                        .IN_THEATERS.getServiceName());
    }

    @GetMapping("/comingsoon")
    @ApiOperation("Get list of movies in theaters soon(?)")
    public NewMovieData getListOfCommingSoonMovies() {
        return imdbService
                .getListOfNewMovies(ServiceNameEnum
                        .COMING_SOON.getServiceName());
    }

    @GetMapping("/boxofficeweekend")
    @ApiOperation("Get list of box office in the weekend of all movies in theaters")
    public BoxOfficeWeekendData getListBoxOfficeWeekend() {

        return imdbService
                .getListBoxOfficeWeekend(ServiceNameEnum
                        .BOX_OFFICE.getServiceName());
    }

    @GetMapping("/boxofficealltime")
    @ApiOperation("Get Historical List of box office of movies")
    public BoxOfficeAllTimeData getListOfBoxOfficeAllTime() {

        return imdbService
                .getListBoxOfficeAllTime(ServiceNameEnum
                        .BOX_OFFICE_ALL_TIME.getServiceName());
    }


}
