package com.spring.boot.restAPI.SpringBootRestAPI.MovieRecommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecommendationsController {
    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return Arrays.asList(new Movie(1, "Intersteller", 8.8),
                new Movie(2, "John Wick", 7.3),
                new Movie(3, "Avengers", 9.2),
                new Movie(4, "Iron Man", 8.5),
                new Movie(5, "Captain America", 9.4)
        );
    }
}
