package com.javamentor.rest.service;

import com.javamentor.rest.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    List<User> showAllUsers();
    User updateUser(User user);
    void deleteUser(long id);
    User getUserById(long id);
    User getUserByName(String name);
}
