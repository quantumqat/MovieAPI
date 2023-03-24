package project.alexwinkler.movieapi.movieapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class reviewService {
    @Autowired
    private reviewRepo reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public review createReview(String reviewBody, String imdbId){
        review reviewNew = reviewRepository.insert(new review(reviewBody));

        mongoTemplate.update(movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(reviewNew))
                .first();

        return reviewNew;
    }
}
