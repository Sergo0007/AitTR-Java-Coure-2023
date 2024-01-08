package practice.parallel_tasks;


    public class MyTaskImplements implements Runnable{
        //fields
        String name;//имя задачи
        int max;//до скольки досчитать

        //constructor


        public MyTaskImplements(String name, int max) {
            this.name = name;
            this.max = max;
        }

        @Override
        public void run() {
            System.out.println(name + " task started.");//доклад о начале работы
            //считаем в цикле от 0 до мах
            for (int i = 0; i < max ; i++) {
                try {
                    Thread.sleep(10); // положили поток спать
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + "count " + i);//докладывает на каждом шаге цикла
            }
            System.out.println(name + " task finished.");



        }

    }
