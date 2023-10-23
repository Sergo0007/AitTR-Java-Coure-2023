package home.pets;

import home.pets.model.Cat1;
import home.pets.model.Dog1;
import home.pets.model.Pet1;

public class PetAppl1 {
    public static void main(String[] args) {


        Cat1 cat = new Cat1(1, "cat ", 2, "Murka", "brit", 5, 30);
        Dog1 dog = new Dog1(2, "dog ", 3, "Redy", "pudel", 6, 40);

        cat.display();
        cat.voice();
        dog.display();
        dog.voice();

    }
}

