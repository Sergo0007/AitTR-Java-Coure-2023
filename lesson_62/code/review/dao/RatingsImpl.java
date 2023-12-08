package review.dao;

import review.model.Review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

//public class RatingsImpl implements Ratings{
//
//    private Collection<Review> reviews;
//
//    public RatingsImpl(){
//        this.reviews = new ArrayList<>();
//    }
//    @Override
//    public boolean add(Review review) {
//        return review != null && reviews.add(review);
//    }
//
//    @Override
//    public boolean remove(Long id) {
//        return reviews.removeIf(review -> review.getId() == id);
//    }

//    @Override
//    public boolean update(Long id, int newRating) {
//        reviews.stream()
            //    .filter(review -> review.getId() == id)
            //    .findFirst()
            //    .map(review -> review.setRating(newRating))
             //   .orElse(false);


   // }

//    @Override
//    public Iterable<Review> getReviewsByproduct(String product) {
//        return reviews.stream()
//                .filter(review -> review.getProduct().equals(product))
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public Iterable<Review> getReviewsByAuthor(String author) {
//        return reviews.stream()
//                .filter(review -> review.getAuthor().equals(author))
//                .collect(Collectors.toList());
//    }
//
//   // @Override
////    public double getAvgRatingByProduct(String product) {
////        return reviews.stream()
//
//   // }
//
//    @Override
//    public Iterable<Review> getReviewWithMaxLikes() {
//        return null;
//    }
//}
