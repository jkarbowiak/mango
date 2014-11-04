package com.aksoft.mango.repository;

import com.aksoft.mango.to.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by PMG on 2014-11-04.
 */
public interface UserRepository extends MongoRepository<User, String> {

    // TODO Mongo uses 'test' db per default - change it

    User findByFirstName(String firstName);
}
