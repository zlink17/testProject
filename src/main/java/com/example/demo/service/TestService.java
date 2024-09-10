package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final String test;

    @Autowired
    public TestService(String test) {
        this.test = test;
    }
}
