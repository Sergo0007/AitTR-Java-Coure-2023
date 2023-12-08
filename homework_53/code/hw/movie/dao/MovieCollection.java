package hw.movie.dao;
//2

import hw.movie.model.Movie;

import java.time.LocalDate;

public interface MovieCollection extends Iterable<Movie> {
    boolean addMovie(Movie movie);
    Movie removeMovie(long imdb);

    Movie findById(long imdb);
    Iterable<Movie> findByGenre(String genre);
    Iterable<Movie> findByDirector(String director);
    Iterable<Movie> findMoviesCreateBetweenDates(LocalDate from,LocalDate to);
    int totalQuantity();



}
