package com.test.excersice;

import com.test.excersice.model.animal.Animal;
import com.test.excersice.model.animal.bird.parrot.Parrot;
import com.test.excersice.model.animal.fish.Clownfish;
import com.test.excersice.model.animal.fish.Dolphin;
import com.test.excersice.model.animal.fish.Fish;
import com.test.excersice.model.animal.fish.Shark;
import com.test.excersice.model.animal.bird.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExcersiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcersiceApplication.class, args);

		Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Butterfly(),
                new Dolphin(),
		};

		int canfly = 0 ;
		int canwalk = 0 ;

		for (int i = 0; i < animals.length ; i++) {

			try {
				if(animals[i] instanceof Bird) {
					Class s = animals[i].getClass().getMethod("fly").getDeclaringClass();
					if(s.equals(Bird.class)){
						canfly++;
					}
				}
				if(animals[i] instanceof Animal) {
					Class s = animals[i].getClass().getMethod("walk").getDeclaringClass();
					if(s.equals(Animal.class)){
						canwalk++;
					}
				}


			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(	"Animal count Who can fly: "+canfly);
		System.out.println(	"Animal count Who can walk: "+canwalk);
		}


	}
