package com.AML2B.JWT_DEMO.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.AML2B.JWT_DEMO.Model.User;

@Service
public class AuthService {

    // In-memory user store
    private List<User> users = new ArrayList<>();

    // Register new user
    public String register(String username, String password) {
        // Optional: check if username exists
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                return "Username already exists!";
            }
        }

        users.add(new User(username, password));
        return "User Registered Successfully";
    }

    // Login (simple check)
    public String login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return "Login Successful";
            }
        }
        return "Invalid Credentials";
    }

    // Get all users
    public List<User> getAllUsers() {
        return users;
    }
}