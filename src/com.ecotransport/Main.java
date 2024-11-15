package com.ecotransport;

import com.ecotransport.dao.UserDAO;
import com.ecotransport.model.User;

public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        // Adding a new user
        User user = new User();
        user.setName("John Doe");
        user.setContactInfo("123456789");
        user.setEmail("john@example.com");
        userDAO.addUser(user);

        // Fetching user by ID
        User fetchedUser = userDAO.getUserById(1);
        if (fetchedUser != null) {
            System.out.println("User found: " + fetchedUser.getName());
        } else {
            System.out.println("User not found.");
        }
    }
}

