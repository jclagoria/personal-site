package com.lagoria.imdbservice.topmovieseries.resources;

import com.lagoria.imdbservice.topmovieseries.enums.ServiceIMDBEnum;
import com.lagoria.imdbservice.topmovieseries.model.MostPopularData;
import com.lagoria.imdbservice.topmovieseries.model.Top250Data;
import com.lagoria.imdbservice.topmovieseries.services.TopMostPopularIMDBServices;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiOperation("Service to provide List of top and popular movies and series and tv programs.")
@RequestMapping(path = "/v1/api",  produces = MediaType.APPLICATION_JSON_VALUE)
public class PopularMoviesTVResources {

    TopMostPopularIMDBServices imdbServices;

    public PopularMoviesTVResources(TopMostPopularIMDBServices imdbServices) {
        this.imdbServices = imdbServices;
    }

    @GetMapping("/top25/movies")
    @ApiOperation("Get a list Of 250 Movies")
    @ResponseBody
    public Top250Data getTop250Movies() {

        return imdbServices
                .getTop250Data(
                        ServiceIMDBEnum.TOP_250_MOVIES.getNameService());
    }

    @GetMapping("/top25/series")
    @ApiOperation("Get a list Of 250 Series")
    @ResponseBody
    public Top250Data getTop250Series() {

        return imdbServices
                .getTop250Data(
                        ServiceIMDBEnum.TOP_250_TV.getNameService());
    }

    @GetMapping("/mostPopular/movies")
    @ApiOperation("Get a list Of Most Populars Movies")
    @ResponseBody
    public MostPopularData getMostPopularMovies() {

        return imdbServices
                .getMostPopularData(
                        ServiceIMDBEnum.MOST_POPULAR_MOVIES
                                .getNameService());
    }

    @GetMapping("/mostPopular/tv")
    @ApiOperation("Get a list Of Most Populars Tv")
    @ResponseBody
    public MostPopularData getMostPopularTv() {

        return imdbServices
                .getMostPopularData(
                        ServiceIMDBEnum.MOST_POPULAR_TV
                                .getNameService());
    }

}
