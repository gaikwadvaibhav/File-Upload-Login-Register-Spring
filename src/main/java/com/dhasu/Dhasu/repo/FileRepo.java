package com.dhasu.Dhasu.repo;

import com.dhasu.Dhasu.model.File;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by raj on 21/11/17.
 */
@Repository
@EnableMongoAuditing
public interface FileRepo extends MongoRepository<File, String> {
}
