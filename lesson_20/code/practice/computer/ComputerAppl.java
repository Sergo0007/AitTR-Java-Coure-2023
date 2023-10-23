package practice.computer;

import practice.computer.model.Computer1;
import practice.computer.model.Laptop1;
import practice.computer.model.Smartphone1;

public class ComputerAppl {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Computer1[] shop = new Computer1[4];
        System.out.println(shop);
        shop[0] = new Computer1("i9",12,512,"HP");
        shop[1] = new Laptop1("i5", 16, 512, "Asus", 3, 2.5);
        shop[0].setRam(24);
        shop[2] = new Laptop1("i5", 16, 512, "Asus", 3, 2.5);
        shop[3] = new Smartphone1("dragon", 6, 120, "Xiaomi", 48, 0.300,12345678);

        for (int i = 0; i < shop.length; i++) {
            System.out.println(shop[i]);

        }

        Computer1 computer = new Computer1("i9", 12, 512, "HP");
        Computer1 laptop = new Laptop1("i5", 16, 512, "Asus", 3, 2.5);
//        computer.display(); //by display
//        System.out.println();
//        laptop.display();
//        System.out.println();
//        System.out.println(computer);
//        System.out.println(laptop);
    }
}
