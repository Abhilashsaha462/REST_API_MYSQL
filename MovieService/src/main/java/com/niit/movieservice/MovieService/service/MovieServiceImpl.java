package com.niit.movieservice.MovieService.service;

import com.niit.movieservice.MovieService.model.Movie;
import com.niit.movieservice.MovieService.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository)
    {
        this.movieRepository=movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Movie updateMovie(Movie movie, String movieName) {
        if(movieRepository.findById(movieName).isEmpty())
        {
            return null;
        }
        return movieRepository.save(movie);
    }

    @Override
    public boolean deleteMovieByMoviename(String movieName) {
        movieRepository.deleteById(movieName);
        return true;
    }

    @Override
    public List<Movie> findByMovieName(String movieName) {
        return movieRepository.findByMovieName(movieName);
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }
}
