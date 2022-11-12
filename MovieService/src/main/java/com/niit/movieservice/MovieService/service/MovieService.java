package com.niit.movieservice.MovieService.service;

import com.niit.movieservice.MovieService.model.Movie;

import java.util.Date;
import java.util.List;


public interface MovieService {

    Movie saveMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie updateMovie(Movie movie, String movieName);

    boolean deleteMovieByMoviename(String movieName);

    List<Movie> findByMovieName(String movieName);

    List<Movie> findByGenre(String genre);

}
