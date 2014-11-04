package com.aksoft.mango.service;

import com.aksoft.mango.repository.UserRepository;
import com.aksoft.mango.to.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Random;

/**
 * Created by PMG on 2014-11-04.
 */
@Service
public class UserService {

    private final Random random = new Random();

    @Inject
    private UserRepository userRepository;

    public User findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    public User addRandomUser() {
        User user = createRandomUser();
        return userRepository.save(user);
    }

    private User createRandomUser() {
        User user = new User();
        user.setFirstName(randomString());
        user.setLastName(randomString());
        return user;
    }

    private String randomString() {
        return random.longs().iterator().next().toString();
    }
}
