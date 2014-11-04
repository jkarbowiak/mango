package com.aksoft.mango.rest;

import com.aksoft.mango.service.UserService;
import com.aksoft.mango.to.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by PMG on 2014-11-04.
 */
@Controller
public class UserRestService {

    @Inject
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public User findByFirstName(@RequestParam("firstName")String firstName) {
        User user = userService.findByFirstName(firstName);
        return user;
    }

    @RequestMapping(value = "/user/random", method = RequestMethod.POST)
    @ResponseBody
    public User generateRandomUser() {
        return userService.addRandomUser();
    }
}
