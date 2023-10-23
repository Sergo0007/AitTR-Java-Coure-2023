package homework.book;
//       Создайте класс Book с полями: название - title автор - author год издания - year уникальный
//       номер - ISBN В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
//       который выводит информацию о книге.
//       Создайте класс Dictionary, который расширяет класс Book. Предложите для него набор полей и
//       переопределите метод display. В классе BookAppl в методе main создайте несколько словарей и
//       выведите информацию о них в консоль.

import homework.book.model.Book;
import homework.book.model.Dictionary;

import java.util.Scanner;

public class BookAppl {
    public static void main(String[] args) {


        Book[] books = new Book[1];
        books[0] = new Book("Three Musketeers", "Dumas", 1890, "1-4445-788-9");
        books[0].display();

        System.out.println("**************************************");

        Dictionary[] dictionaries = new Dictionary[1];
        dictionaries[0] = new Dictionary("English - Russian", "Sokolovski",
                2023, "2-7897-987-8", "English,Russian", "Translite");
        dictionaries[0].display();
        System.out.println();
        System.out.println("*************************************");

        System.out.println("В магазине 'Мир Книги' юбилей: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 или 2 и получите в подарок книгу");

        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println(books[0]);
        } else if (num == 2) {
            System.out.println(dictionaries[0]);
        } else {
            System.out.println("Твкого подарка нет");
        }

    }
}
