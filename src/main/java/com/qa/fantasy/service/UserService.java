package com.qa.fantasy.service;

import com.qa.fantasy.domain.User;
import com.qa.fantasy.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    @Autowired
    public UserService(UserRepository repo) { this.repo = repo; }

    public User createUser(User user) { return this.repo.save(user); }
}
