package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    
    public String test() throws InterruptedException {
        Thread.sleep(1000);
        return "test";
    }
    
}
