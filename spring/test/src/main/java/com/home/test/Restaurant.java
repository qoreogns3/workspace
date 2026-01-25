package com.home.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private Cook chef;

    @Autowired
    public Restaurant(Chef chef){
        this.chef = chef;
    }

    public void run(){
        chef.cook();
    }
}
