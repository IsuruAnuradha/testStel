package com.test.excersice.model.animal.fish;

public class Shark extends Fish {

    @Override
    public String getBodyColor(String color) {

        return "grey";
    }

    @Override
    public String getSize(String size) {
        return "large";
    }

    public void eat(){
        System.out.println("sharks eat other fishes");
    }
}


