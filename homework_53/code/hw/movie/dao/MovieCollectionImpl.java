package hw.movie.dao;
//3

import hw.movie.model.Movie;

import java.time.LocalDate;
import java.util.*;

public class MovieCollectionImpl implements MovieCollection {

    private Collection<Movie> movies;

    public MovieCollectionImpl() {
        movies = new ArrayList<>();

    }
    public MovieCollectionImpl(List<Movie> list){
        this();
        for (Movie m : list){
            movies.add(m);
        }
    }

    @Override
    public boolean addMovie(Movie movie) {
        if (movie == null){
            return false;
        }
         if (findById(movie.getImdb()) != null){
             return false;
         }
         if (movies.contains(movie)){
             return false;
         }
         movies.add(movie);
         return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim = findById(imdb); //поиск фильма по imdb
        if (victim != null) {
            movies.remove(victim); //удаление фильма из списка
            return victim; //возвращает удаленный фильм
        }

        return null;//возвращает null, если фильм не был найден
    }

    @Override
    public Movie findById(long imdb) {
        for (Movie m : movies) {
            if(m.getImdb() == imdb) {
                return m; //возвращает фильм, если он найден по imdb
            }
        }
        return null; //возвращает null, если фильм не был найден

    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getGenre().equals(genre)) {
                movies.add(m);
            }
        }
        return foundByGenre; //возвращает пустой список

    }

    @Override
    public Iterable<Movie> findByDirector(String director) {
        List<Movie> foundByDirector = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getDirector().equals(director)) {
                movies.add(m);
            }
        }
        return foundByDirector;

    }

    @Override
    public Iterable<Movie> findMoviesCreateBetweenDates(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public int totalQuantity() {
        return movies.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}
