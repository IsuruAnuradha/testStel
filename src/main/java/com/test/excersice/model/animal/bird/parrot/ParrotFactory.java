package com.test.excersice.model.animal.bird.parrot;

public class ParrotFactory {

    public Parrot factory(String name){

        if(name.toLowerCase().equals("cat")){
            return new ParrotWithCat();
        }
        if(name.toLowerCase().equals("dog")){

            return new ParrotWithDog();
        }
        if(name.toLowerCase().equals("rooster")){
            return  new ParrotWithRooster();
        }

        return  null;
    }
}
