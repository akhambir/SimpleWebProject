package com.akhambir.service;

import com.akhambir.DAO.interfaces.UserDAO;
import com.akhambir.service.interfaces.UserService;
import com.akhambir.model.User;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    public void addUser(User user) {
        LOGGER.debug("UserServiceImpl: addUser is called");
        userDAO.save(user);
    }

    @Override
    public User findUserByName(String userName) {
        LOGGER.debug("UserServiceImpl: findByName is called");
        return userDAO.findOne(userName);
    }

}
