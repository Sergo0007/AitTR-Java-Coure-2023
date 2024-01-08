package hw_63.library;

import java.util.Objects;

public class Library {

    private String name;
    private int rating;
    private String review;
    private int likes;

    public Library(String name, int rating, String review, int likes) {
        this.name = name;
        this.rating = rating;
        this.review = review;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return rating == library.rating && likes == library.likes && Objects.equals(name, library.name) && Objects.equals(review, library.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, review, likes);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                ", likes=" + likes +
                '}';
    }
}
