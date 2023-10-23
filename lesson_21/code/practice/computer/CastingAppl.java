package practice.computer;

import practice.computer.model.Computer1;
import practice.computer.model.Laptop1;
import practice.computer.model.Smartphone1;

public class CastingAppl {
    public static void main(String[] args) {
        Computer1 lap1 = new Laptop1("i5", 16, 512, "Asus", 3, 2.5);
        System.out.println(lap1);
        if (lap1 instanceof Laptop1) {
            Laptop1 laptop1 = (Laptop1) lap1;//down casting ftom Computer to Laptop
            laptop1.setHours(4.5);
            System.out.println(laptop1);
        }

        System.out.println(lap1);
        Computer1 smart1 = new Smartphone1("Snapdragon", 6, 120, "Xiaomi", 48, 0.200, 1234567898);
        if (lap1 instanceof Smartphone1) {

            Smartphone1 smartphone1 = (Smartphone1) smart1;
            System.out.println(smartphone1.getImei());
        }
        if (lap1 instanceof Smartphone1) {
            Smartphone1 smartphone2 = (Smartphone1) lap1;
            System.out.println(smartphone2);
        }else {
            System.out.println("Lap1 not a Smartphone");
        }

    }
}
