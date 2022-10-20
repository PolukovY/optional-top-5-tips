package com.levik.optional;

import com.levik.optional.repository.UserRepository;

public class Main {

    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        System.out.println(userRepository.getUserBad(1).isEmpty());
    }
}
