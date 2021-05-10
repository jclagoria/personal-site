package com.lagoria.imdbservice.youtube.resources;

import com.lagoria.imdbservice.youtube.enums.ServiceNameImdbEnum;
import com.lagoria.imdbservice.youtube.model.YouTubeData;
import com.lagoria.imdbservice.youtube.model.YouTubePlaylistData;
import com.lagoria.imdbservice.youtube.model.YouTubeTrailerData;
import com.lagoria.imdbservice.youtube.services.ImdbYoutubeSerice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/api/videos",  produces = MediaType.APPLICATION_JSON_VALUE)
@Api("Service to get vidios about movies")
public class ImdbYoutubeResource {

    ImdbYoutubeSerice imdbYoutubeSerice;

    public ImdbYoutubeResource(ImdbYoutubeSerice imdbYoutubeSerice) {
        this.imdbYoutubeSerice = imdbYoutubeSerice;
    }

    @GetMapping("/trailer")
    @ApiOperation("Get trailer of movie by Id Title")
    public YouTubeTrailerData getYoutubeTrailerByIdTitle(@RequestParam String idTitleImdb) {

        return imdbYoutubeSerice.getYoutubeTrailer(
                ServiceNameImdbEnum.YOUTUBE_TRAILER.getNameService(),
                idTitleImdb);
    }

    @GetMapping
    @ApiOperation("Get a video of YOutube with Youtube Video ID or URL Youtube")
    public YouTubeData getYoutubeVideoByConditionSearch(@RequestParam String vidioYoutube) {

        return imdbYoutubeSerice.getYoutubeVideo(
                ServiceNameImdbEnum.YOUTUBE.getNameService(),
                vidioYoutube);
    }

    @GetMapping("/playlist")
    @ApiOperation("A valid YouTube Playlist Id or YouTube Playlist URL")
    public YouTubePlaylistData getYoutubePLayListByConditionSearch(@RequestParam String videioId) {

        return imdbYoutubeSerice.getYOutubeListByConditionSearch(
                ServiceNameImdbEnum.YOUTUBE_PLAYLIST.getNameService(),
                videioId);
    }

}
