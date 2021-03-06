package com.qa.fantasy.rest;

import com.qa.fantasy.domain.User;
import com.qa.fantasy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) { this.userService = userService; }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) { return this.userService.createUser(user); }
}
