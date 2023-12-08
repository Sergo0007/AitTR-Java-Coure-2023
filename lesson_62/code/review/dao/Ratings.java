package review.dao;

import review.model.Review;

public interface Ratings {

    boolean add(Review review);

    boolean remove(Long id);

    boolean update(Long id, int newRating);

    Iterable<Review> getReviewsByproduct(String product);

    Iterable<Review> getReviewsByAuthor(String author);

    double getAvgRatingByProduct(String product);

    Iterable<Review> getReviewWithMaxLikes();

}
