package com.example.resttemplate.resource;

import com.example.resttemplate.model.Student;
import com.example.resttemplate.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    private UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public String test(@PathVariable("id") int id) {
        return userService.getUserDetail(id);
    }
}
