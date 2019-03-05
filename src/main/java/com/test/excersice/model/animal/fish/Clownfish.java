package com.test.excersice.model.animal.fish;

public class Clownfish extends Fish {
    @Override
    public String getBodyColor(String color) {

        return "orange";
    }

    @Override
    public String getSize(String size) {
        return "small";
    }

    public Boolean  makeJoke(){
      return true;
    }
}
