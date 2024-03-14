package com.revature.revagenda.services;

import com.revature.revagenda.models.User;
import com.revature.revagenda.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        this.userRepository.save(user);
    }


}
