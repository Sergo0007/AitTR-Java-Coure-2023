package hm;

import java.util.Arrays;
import java.util.Random;

public class GroupsAppl {
    public static void main(String[] args) {
        /*- Первоначально создаются массивы: массив студентов, group1 и group2, размер которых зависит от количества
      студентов. Общие правила для распределения студентов такие:
      group1 будет содержать студентов, пока не достигнет определенного количества, т.е.
      половины общего числа студентов. Group2 будет содержать оставшихся студентов.

       Далее, используя объект Random, генерируется случайное число.
       Если полученное число равно 0 и текущая позиция index1 меньше размера массива group1,
       студент добавляется в group1 и инкриминируется значение index1. В противном случае,
       если текущая позиция index2 меньше размера массива group2, студент добавляется в group2 и
       инкриминируется значение index2. Если и group1 и group2 уже заполнены, студент добавляется в
       group1 и инкриминируется значение index1.
        Таким образом, после выполнения цикла for студенты будут случайным образом распределены между group1 и
       group2 с примерно равным количеством студентов в каждой группе.
    */
        String[] students = {"A","B","C","F","G","D","E","H","T","O","U"};
        String[] group1 = new String[students.length / 2];
        String[] group2 = new String[students.length  - group1.length];

        Random random = new Random();
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < students.length; i++) {
            int index = random.nextInt(3);
            if (index == 0 && index1 < group1.length  ){
                group1[index1++] = students[i];
            } else if (index2 < group2.length ) {
                group2[index2++] = students[i];
            }else {
                group1[index1++] = students[i];

            }

        }
        System.out.println("Group 1: " + Arrays.toString(group1));
        System.out.println("Group 2: " + Arrays.toString(group2));
    }
}
