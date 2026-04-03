package com.AML2B.JWT_DEMO.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.AML2B.JWT_DEMO.Service.AuthService;
import com.AML2B.JWT_DEMO.Model.User; // Make sure this import exists

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthService service;

    // Login endpoint
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password) {
        return service.login(username, password);
    }

    // Register endpoint
    @PostMapping("/register")
    public String register(@RequestParam String username,
                           @RequestParam String password) {
        System.out.println("REGISTER API HIT");
        return service.register(username, password);
    }

    // Get all registered users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // Simple hello endpoint
    @GetMapping("/hello")
    public String hello() {
        return "Hello! JWT Authentication Successful";
    }
}