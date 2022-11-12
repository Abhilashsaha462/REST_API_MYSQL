package com.niit.movieservice.MovieService.repository;

import com.niit.movieservice.MovieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

    List<Movie> findByMovieName(String movieName);

    List<Movie> findByGenre(String genre);



}
