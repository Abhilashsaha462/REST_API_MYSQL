package com.niit.movieservice.MovieService.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Movie {
    @Id
    private String movieName;
    private String genre;
    private String releasedate;

    public Movie() {
    }

    public Movie(String movieName, String genre, String releasedate) {
        this.movieName = movieName;
        this.genre = genre;
        this.releasedate = releasedate;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", genre='" + genre + '\'' +
                ", releasedate='" + releasedate + '\'' +
                '}';
    }
}
