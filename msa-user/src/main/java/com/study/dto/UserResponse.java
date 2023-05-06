package com.study.dto;


import com.study.domain.User;

public class UserResponse {
    private final Long id;
    private final String name;


    protected UserResponse(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getName());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}