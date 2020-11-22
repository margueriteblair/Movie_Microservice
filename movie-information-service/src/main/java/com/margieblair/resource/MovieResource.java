package main.java.com.margieblair.resource;


import main.java.com.margieblair.models.Movie;

@RequestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("modieId") String movieId) {
        return new Movie(movieId, "Test Name");
    }
}
