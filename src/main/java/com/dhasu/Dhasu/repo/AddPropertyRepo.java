package com.dhasu.Dhasu.repo;

import com.dhasu.Dhasu.model.AddProperty;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by raj on 19/11/17.
 */
@Repository
@EnableMongoAuditing
public interface AddPropertyRepo extends MongoRepository<AddProperty,String> {

}
