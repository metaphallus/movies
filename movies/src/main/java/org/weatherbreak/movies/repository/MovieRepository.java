package org.weatherbreak.movies.repository;

import org.weatherbreak.movies.entity.Movie;

import java.util.List;

public interface MovieRepository {

    long addMovie(Movie movie);

    Movie getMovie(long movieId);

    List<Movie> getMovies();

    List<Movie> getMoviesByName(String movieName);
}
