package com.sajan.test.service;

import com.sajan.test.entity.User;
import com.sajan.test.repository.UserRepo;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Optional<User> saveUser(User user) {
        Optional<User> byEmail = userRepo.findByEmail(user.getEmail());
        if (byEmail.isPresent()) {
            Optional.empty();
        } else{
            return Optional.of(userRepo.save(user));
        }
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> viewAllUser() {
        return Optional.empty();
    }

    @Override
    public Optional<User> getUserByID(Integer userId) {
        return Optional.empty();
    }
}
