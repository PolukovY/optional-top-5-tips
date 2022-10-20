package com.levik.optional.model;

import java.util.List;

public record User(String username, List<String> roles) {
}
