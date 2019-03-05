package com.test.excersice.model.animal.fish;

import com.test.excersice.model.animal.Animal;

public class Fish extends Animal {


    @Override
    public void walk() {
        System.out.println("cant walk");
    }

    public void swim(){
        System.out.println("fish can swim");
    }

    public String getBodyColor(String color){
        return color ;
    }

    public String getSize(String size){
        return size;
    }

}
