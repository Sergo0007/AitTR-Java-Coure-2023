package hw_57;

import java.util.HashMap;
import java.util.Map;

public class LNAppl {
    public static void main(String[] args) {
//        В этом примере мы создаем объект charCountMap типа HashMap, который реализует интерфейс Map.
//        Затем мы перебираем все символы в предложении Л.Н. Толстого и добавляем только буквы в
//        charCountMap с помощью метода put(). Если буква уже есть в charCountMap, мы увеличиваем его значение на 1.
//        Если буквы нет в charCountMap, мы добавляем ее со значением 1. Наконец, мы выводим charCountMap,
//        который содержит количество повторяющихся букв в предложении.

        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов,";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = sentence.toCharArray();
        for (char c : strArray) {
            if (Character.isLetter(c)) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        System.out.println("Количество повторяющихся букв в предложении Л.Н. Толстого:");
        System.out.println(charCountMap);

    }
}
