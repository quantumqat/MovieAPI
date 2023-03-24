package project.alexwinkler.movieapi.movieapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface reviewRepo extends MongoRepository<review, ObjectId> {
}
