package com.revature.revagenda.controllers;

import com.revature.revagenda.models.User;
import com.revature.revagenda.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/health/ping")
    @ResponseStatus(HttpStatus.OK)
    public String ping() {
        return "pong!";
    }

    @PostMapping("/test")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void test(@RequestBody User user) {
        this.userService.registerUser(user);
    }

    // @GetMapping("/test")
    // @ResponseStatus(HttpStatus.OK)
    // public User getUser() {
    //
    // }




}
