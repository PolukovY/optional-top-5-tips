package com.levik.optional.repository;

import com.levik.optional.model.User;

import java.util.Optional;

public class UserRepository {

    public Optional<User> getUserBad(int id) {
        Optional<User> user = Query.returnNull();
        //logic query db or external service
        return user;
    }
}
