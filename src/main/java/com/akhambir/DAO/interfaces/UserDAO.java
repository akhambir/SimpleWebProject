package com.akhambir.DAO.interfaces;

import org.springframework.data.repository.CrudRepository;
import com.akhambir.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, String> {  // TODO как где имплементация

    User findUserByUserName();

}