package com.akhambir.controllers.interfaces;

import com.akhambir.model.User;
import com.akhambir.service.interfaces.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    public void addUser(String userName, String email, String password) {
        LOGGER.debug("UserController: addUser is called");

        User user = new User();
        //user.setUserName(userName);
        //user.setEmail(email);
        //user.setPassword(password); // TODO how about some security??
        userService.addUser(user);
    }

    public User findUserByName(String userName) {
        LOGGER.debug("UserController: findUserByName is called");
        return userService.findUserByName(userName);
    }

    @RequestMapping("/user")
    public User userTest() {
        return new User("email", "pass", "name", new ArrayList<>(), new ArrayList<>());
    }
}