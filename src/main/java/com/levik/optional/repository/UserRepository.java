package com.levik.optional.repository;

import com.levik.optional.model.User;

import java.util.Optional;

public class UserRepository {

    public static final String UNDEFINED = "Undefined";

    public Optional<User> getUserBad(int id) {
        Optional<User> user = Optional.empty();
        //logic query db or external service
        return user;
    }

    public String getUserStatus(int id) {
        Optional<String> userStatus = Optional.empty(); // query db and get data could be empty
        String status = UNDEFINED;
        if (userStatus.isPresent()) {
            status = userStatus.get();
        }
        return status;
    }
}
