package com.margieblair.model;

public class Movie {
    private String movieId;
    private String name;

    public Movie() {
        //needs an empty constructor
    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getMovieId() {
        return movieId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
