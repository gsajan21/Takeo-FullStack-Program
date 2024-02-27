package com.sajan.test.service;

import com.sajan.test.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> saveUser(User user);
    Optional<List<User>> viewAllUser();
    Optional<User> getUserByID(Integer userId);
}
