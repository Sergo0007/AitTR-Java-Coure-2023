package practice.string_builder;

public class StringPerformanceTest {

    private static  final int N_ITERATION = 100_000;
    private static final String WORD = "Word";

    public static void main(String[] args) {
        //String
        String str = "";//иницилизация пустой строки
        long t1 = System.currentTimeMillis();//засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
            str = str + WORD;
        }
        long t2 = System.currentTimeMillis();//втоая засечка времени
        System.out.println(t2 - t1);//столько времени прошло в миллисекундах


            //StringBuilder
         StringBuilder stringBuilder = new StringBuilder();
          t1 = System.currentTimeMillis();//засекаем время
        for (int i = 0; i < N_ITERATION; i++) {
             stringBuilder.append(WORD);
        }
          str = stringBuilder.toString();
          t2 = System.currentTimeMillis();//втоая засечка времени
        System.out.println(t2 - t1);//столько времени прошло в миллисекундах

    }


    }

