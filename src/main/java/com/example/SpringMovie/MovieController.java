package com.example.SpringMovie;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static javafx.scene.input.DataFormat.URL;

@Controller
public class MovieController {

    @RequestMapping(path="/mediumPopularName", method=RequestMethod.GET)
    public String MediumPopularName () {
        return "mediumPopularName";  //this must return the name of the template
    }

    @RequestMapping(path = "/nowPlaying", method = RequestMethod.GET)
    public String nowPlaying () {
        return "nowPlaying";
    }

    public static List<Movie> getMovies(String url){
        // "https://api.themoviedb.org/3/movie/now_playing"
        return restTemplate.getForObject(url, List.class ); ///this is a helper method


    }


}
