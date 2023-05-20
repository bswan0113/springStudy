package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

@Component
public class Morning implements Greeting{
    @Override
    public void greeting() {
        System.out.println("morning");
    }
}
