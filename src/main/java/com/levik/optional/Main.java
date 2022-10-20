package com.levik.optional;

import com.levik.optional.repository.UserRepository;

public class Main {

    public static void main(String[] args) {
        var userRepository = new UserRepository();
        System.out.println(userRepository.getUserStatus(1));
    }
}
