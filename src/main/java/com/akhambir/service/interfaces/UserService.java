package com.akhambir.service.interfaces;

import com.akhambir.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void addUser(User user);
    User findUserByName(String userName);
}
