package com.dhasu.Dhasu.repo;

import com.dhasu.Dhasu.model.User;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoAuditing
public interface UserRepo extends MongoRepository<User,String> {
    User findByEmail(String emailid);

}
