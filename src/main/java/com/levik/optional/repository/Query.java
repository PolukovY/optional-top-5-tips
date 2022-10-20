package com.levik.optional.repository;

import java.util.Optional;

public class Query {

    public static <T> Optional<T> empty() {
        return helper(true);
    }

    public static <T> Optional<T> returnNull() {
        return helper(false);
    }

    public static <T> Optional<T> of(Object obj) {
        return (Optional<T>) Optional.ofNullable(obj);
    }

    private static <T> Optional<T> helper(boolean isEmpty) {
        if (isEmpty) {
            return Optional.empty();
        }

        return null;
    }
}
