package com.levik.optional.repository;

import com.levik.optional.exception.UserNotFoundException;
import com.levik.optional.model.User;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class UserRepository {

    public static final String UNDEFINED = "Undefined";

    public Optional<User> getUserBad(int id) {
        Optional<User> user = Optional.empty();
        //logic query db or external service
        return user;
    }

    public String getUserStatus(int id) {
        Optional<String> userStatus = Query.empty(); // query db and get data could be empty
        return userStatus.orElse(UNDEFINED);
    }

    public User getFromCacheOrDb(int id) {
        return getFromCache(id)
                .orElseGet( () -> getFromDB(id).orElseThrow(() -> new UserNotFoundException("User with id " + id)));
    }

    Optional<User> getFromCache(int id) {
        System.out.println("search in cache with id " + id);
        return Optional.empty();
    }

    Optional<User> getFromDB(int id) {
        System.out.println("search in DB with id " + id);
        return Optional.empty();
    }

    public User findUser(int id) {
        return getFromDB(id).orElseThrow();
    }
}
