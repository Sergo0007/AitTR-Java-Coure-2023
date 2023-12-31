package hw_57;

import java.util.HashMap;
import java.util.Map;

public class LettersNumberAppl {
//    В этом примере мы создаем объект charCountMap типа HashMap, который реализует интерфейс Map.
//    Затем мы перебираем все символы в предложении Л.Н. Толстого и добавляем их в charCountMap с
//    помощью метода put(). Если символ уже есть в charCountMap, мы увеличиваем его значение на 1.
//    Если символа нет в charCountMap, мы добавляем его со значением 1. Наконец, мы выводим charCountMap,
//    который содержит количество повторяющихся букв в предложении.
//     В этом коде мы создаем объект charCountMap типа HashMap, который реализует интерфейс Map.
//    Затем мы создаем массив символов strArray, который содержит все символы в предложении.
//    Мы перебираем каждый символ в массиве strArray с помощью цикла for. Если символ уже есть в charCountMap,
//    мы увеличиваем его значение на 1 с помощью метода put(). Если символа нет в charCountMap,
//    мы добавляем его со значением 1. Наконец, мы выводим charCountMap, который содержит количество
//    повторяющихся букв в предложении.
//    Надеюсь, что это поможет вам понять код. Если у вас есть другие вопросы, я буду рад помочь.

    public static void main(String[] args) {
        String sentence ="В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] strArray = sentence.toCharArray();
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        System.out.println("Количество повторяющихся букв в предложении Л.Н. Толстого:");
        System.out.println(charCountMap);
    }
}
