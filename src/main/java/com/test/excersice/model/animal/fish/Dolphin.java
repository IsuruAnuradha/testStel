package com.test.excersice.model.animal.fish;

import com.test.excersice.model.animal.Animal;

public class Dolphin extends Animal {

    Fish fish = new Fish();

    public void swim(){
        fish.swim();
    }

    @Override
    public void walk() {
        System.out.println("cant walk");
    }
}
