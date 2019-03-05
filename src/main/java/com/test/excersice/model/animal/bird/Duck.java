package com.test.excersice.model.animal.bird;

public class Duck extends Bird {

    @Override
    public void sing() {
        System.out.println("says Quack Quack");
    }

    public void swim(){
        System.out.println("can swim");
    }
}
