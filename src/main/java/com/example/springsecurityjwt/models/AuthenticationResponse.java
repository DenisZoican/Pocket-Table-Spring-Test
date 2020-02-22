package com.example.springsecurityjwt.models;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationResponse {
    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public AuthenticationResponse() {
        this.jwt = null;
    }

    public String getJwt() {
        return jwt;
    }
}
