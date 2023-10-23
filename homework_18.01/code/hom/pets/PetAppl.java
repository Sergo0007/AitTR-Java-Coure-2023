package hom.pets;
//        Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями: порода, рост, вес.
//        Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
//        Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
//        Смоделируйте жизнь в этом доме в течение дня.


import hom.pets.model.Cat;
import hom.pets.model.Dog;
import hom.pets.model.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Dog[] dog = new Dog[2];
        dog[0] = new Dog(1, "псовые", 5, "Бар", "Овчарка", 40, 65);
        dog[1] = new Dog(2, "псовые", 4, "Бос", "Далматин", 23, 60);
        dog[0].voice();
        dog[1].game();


        for (int i = 0; i < dog.length; i++) {
            System.out.println(dog[i]);
        }
        System.out.println("__________________________");

        Cat[] cat = new Cat[3];
        cat[0] = new Cat(1, "Млекопитающие", 4, "Рыжий", "простая", 3, 23);
        cat[1] = new Cat(2, "Млекопитающие", 7, "Фунтик", "простая", 2, 15);
        cat[2] = new Cat(3, "Млекопитающие", 3, "Омон", "простая", 5, 25);
        cat[0].voice();
        cat[1].game();
        cat[2].hunter();


        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
        }

    }

}

