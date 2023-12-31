package practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {

    public static void main(String[] args) {
        //создадим мапу отражающую количество людей (население) в городах

        Map<String,Integer> usaCities = new TreeMap<>();//создали обтект типа Мар
        usaCities.put("Denver",600_000);
        usaCities.put("Boston",670_000);
        usaCities.put("Chicago",2_700_000);
        usaCities.put("Atlanta",470_000);
        usaCities.put("New York",8_500_000);
        usaCities.put("Dallas",1_300_000);
        usaCities.replace("Dallas",1_300_010);//обновили значение
        System.out.println("Map size = " + usaCities.size());
        System.out.println("Is empty: " + usaCities.isEmpty());

        //получение значения по ключу
        Integer num = usaCities.get("Chicago");
        System.out.println(num);
        int pop = usaCities.get("Atlanta");
        System.out.println(pop);

        //проверка ключа на наличие в mape
        System.out.println(usaCities.containsKey("Boston"));//ожидаем true
        System.out.println(usaCities.containsKey("Detroit"));////ожидаем false

        //обновим значение в мапе по ключу
        usaCities.put("Chicago",2_700_001);//изменили значение
        System.out.println(num);//это старое значение переменной
        System.out.println(usaCities.get("Chicago"));//вытаскиваем значение

        Collection<Integer> population = usaCities.values();//вытащили значения в коллекции
        int total = 0;
        for (Integer integer : population){
            total += integer;

            }
        System.out.println("Population: " + total);

        //распечатаем содержимое мапы
        System.out.println("-------Print map--------");
        Set<String> keys = usaCities.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + usaCities.get(key));

        }
        //еще другой способ
        System.out.println("-------Print Map another time------");
        Set<Map.Entry<String,Integer>> entries = usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());

        }
        //еще способ
        System.out.println("-------Print Map another time------");
        System.out.println(usaCities.entrySet());


        }
    }

