package com.h2.firstapih2.service;

import com.h2.firstapih2.model.User;

import java.util.List;


public interface UserService {


    List<User> getUsers();

    User saveUser(User user);

    User getUser(Long userId);

    User modifyUser(Long id, User userToModify);

    boolean deleteUser(Long id);
}
