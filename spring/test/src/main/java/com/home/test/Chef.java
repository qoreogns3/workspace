package com.home.test;

import org.springframework.stereotype.Component;

interface Cook{
    void cook();

}

@Component("a")
public class Chef implements Cook{
    public void cook(){
        System.out.println("요리중");
    }
}


class KoreanChef implements Cook{
    public void cook(){
        System.out.println("한식 요리 중");
    }
}

