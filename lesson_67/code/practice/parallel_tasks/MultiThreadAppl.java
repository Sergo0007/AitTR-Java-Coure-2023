package practice.parallel_tasks;

import practice.MyTaskImplements;

public class MultiThreadAppl {

private static final int MAX = 10;
private static final int SIZE = 3;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started");//это начал работать 1-й thread


//        MyTaskImplements task = new MyTaskImplements("Parallel task",MAX);
//        task.run();//это запуск второго thread
        practice.MyTaskImplements task1 = new MyTaskImplements("Parallel One ", MAX);//создали задачу
        MyTaskExtends task2 = new MyTaskExtends("Parallel two ",MAX);
        Thread thread1 = new Thread(task1);//создали новый поток и передали ему эту задачу
        Thread thread2 = new Thread(task2);//создали еще один новый поток и передали ему эту задачу

        thread1.start();//поток запустили
        thread2.start();

        MyTaskImplements[] tasks = new MyTaskImplements[SIZE];//создаем массив параллельных задач


        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyTaskImplements(" name # " + i,MAX);

        }
        //создаем массив потоков
        Thread[]threads = new Thread[SIZE];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);

        }
        for (int i = 0; i <threads.length ; i++) {
            threads[i].start();
            //threads[i].join();// так делать не надо

        }
        // thread.start(); поток запущен
        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = " + i);//докладывает main
            try {
                Thread.sleep(10); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        thread1.join();//присоединение к идущим процессам
        thread2.join();
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();

        }
        System.out.println("Main thread finished.");
    }
}
