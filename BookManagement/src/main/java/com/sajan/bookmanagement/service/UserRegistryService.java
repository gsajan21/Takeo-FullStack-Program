package com.sajan.bookmanagement.service;

import com.sajan.bookmanagement.dao.UserDao;
import com.sajan.bookmanagement.model.User;

import java.util.Random;

public class UserRegistryService {
    public String userCreation (User user){


        UserDao userDAO = new UserDao();
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        user.setUserId(user.getUserName()+ "_" + randomNumber );
        return userDAO.saveUser(user);

    }

}
