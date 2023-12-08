package hw.movie.test;

import hw.movie.dao.MovieCollection;
import hw.movie.dao.MovieCollectionImpl;
import hw.movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionImplTest {

    MovieCollection movieCollection;

    static final LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        movieCollection = new MovieCollectionImpl(List.of(
                new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2,"B","B","B",now.minusYears(4)),
                new Movie(3,"C","C","C",now.minusYears(1)),
                new Movie(4,"D","D","D",now.minusYears(2)),
                new Movie(5,"E","E","E",now.minusYears(7))




                ));
    }

    @Test
    void addMovie() {
        assertFalse(movieCollection.addMovie(null));
        assertFalse(movieCollection.addMovie(new Movie(2, "B", "B", "B", now.minusYears(4)))
        );
    }

    @Test
    void removeMovie() {
        assertNotNull(movieCollection.removeMovie(5));
        assertNull (movieCollection.removeMovie(6));// удаляем отсутствующего
        assertEquals(4, movieCollection.totalQuantity());

    }

    @Test
    void findById() {
        assertNotNull(movieCollection.findById(1));
        assertNull(movieCollection.findById(6));


    }

    @Test
    void findByGenre() {
        Movie movie = movieCollection.findById(1);
        assertNotNull(movie);
        assertEquals("A",movie.getGenre());


    }

    @Test
    void findByDirector() {
        Movie movie = movieCollection.findById(2);
        assertNotNull(movie);
        assertEquals("B",movie.getDirector());
    }

    @Test
    void findMoviesCreateBetweenDates() {
    }

    @Test
    void totalQuantity() {
        assertEquals(5,movieCollection.totalQuantity());

    }

    @Test
    void iterator() {
    }
}