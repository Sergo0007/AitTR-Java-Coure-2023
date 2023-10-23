package practice.comp;

import practice.comp.mod.Computer;
import practice.comp.mod.Laptop;
import practice.comp.mod.Smartphone;

public class ComputerAppl {
    public static void main(String[] args) {


        Computer[] shop = new Computer[5];
        shop[0] = new Computer("i9", 12, 512, "HP");
        shop[1] = new Laptop("i5", 16, 512, "Asus", 3, 2.5);
        shop[2] = new Laptop("i5", 24, 1024, "Medion", 4.5, 2.5);
        shop[3] = new Smartphone("Snapdragon", 6, 120, "Xiaomi", 48, 0.200, 1234567898);
        printArray(shop);
        System.out.println("_____________________");
        Computer computer1 = new Computer("i9", 12, 512, "HP");
        boolean checker = shop[0].equals(computer1);
        System.out.println(checker);
        checker = shop[3].equals(computer1);
        System.out.println(checker);
        checker = shop[1].equals(shop[2]);
        System.out.println(checker);
        Smartphone smartphone1 = new Smartphone("Snapdragon", 6, 120, "Xiaomi", 48, 0.200, 1234567899);
        checker = smartphone1.equals(shop[3]);
        System.out.println(checker);











    }

    public static void printArray(Computer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);

            }
        }
    }


    }

