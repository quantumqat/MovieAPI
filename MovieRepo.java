package project.alexwinkler.movieapi.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<movie, ObjectId> {
    Optional<movie> findMovieByImdbId(String imdbId);
}
