package hm;

import java.util.ArrayList;

public class Alphabet {
    //Задача 3. Заполните структуру типа ArrayList символами латинского алфавита от A(65) до Z(...).
    public static void main(String[] args) {
//
        ArrayList<Character>alphabet = new ArrayList<>();
        //задаем параметры согласно таблице ASCII
        for (int i = 65; i <= 90; i++) {
            alphabet.add((char)i);//кастинг

        }
        for (char a : alphabet){//переборка символов и вывод на консоль алфавита
            System.out.print(a + ", ");
        }
    }
}
