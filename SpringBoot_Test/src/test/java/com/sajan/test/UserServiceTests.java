package com.sajan.test;


import com.sajan.test.entity.User;
import com.sajan.test.repository.UserRepo;
import com.sajan.test.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTests {

    @Mock
    private UserRepo userRepo;
    @InjectMocks
    private UserServiceImpl  userService;

    private User user;
    @BeforeEach
    public void setUp(){
        User build = User.builder()
                .name("Sajan")
                .email("sajan@gmail.com")
                .password("enter")
                .build();
    }

    @DisplayName("Junit test for saveUser method")
    @Test
    public void givenUserObject_saveUser_returnUserObject(){

    }

}
