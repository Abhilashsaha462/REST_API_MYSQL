package com.niit.movieservice.MovieService.controller;

import com.niit.movieservice.MovieService.model.Movie;
import com.niit.movieservice.MovieService.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService)
    {
        this.movieService=movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie)
    {
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies()
    {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.FOUND);
    }

    @GetMapping("/movies/{movieName}")
    public ResponseEntity<?> getAllMoviesByMovieName(@PathVariable String movieName)
    {
        System.out.println("Received movie name is "+movieName);
        return new ResponseEntity<>(movieService.findByMovieName(movieName), HttpStatus.FOUND);
    }

    @GetMapping("/movies1/{genre}")
    public ResponseEntity<?> getAllMoviesByGenreType(@PathVariable String genre)
    {
        System.out.println("Received genretype is "+genre);
        return new ResponseEntity<>(movieService.findByGenre(genre), HttpStatus.FOUND);
    }

    @DeleteMapping("/movie/{movieName}")
    public ResponseEntity<?> deleteMovie(@PathVariable String movieName)
    {
        return new ResponseEntity<>(movieService.deleteMovieByMoviename(movieName), HttpStatus.OK);
    }

    @PutMapping("/movie1/{movieName}")
    public ResponseEntity<?> updateMovie(@RequestBody Movie movie,@PathVariable String movieName)
    {
        return new ResponseEntity<>(movieService.updateMovie(movie,movieName), HttpStatus.OK);
    }

}
