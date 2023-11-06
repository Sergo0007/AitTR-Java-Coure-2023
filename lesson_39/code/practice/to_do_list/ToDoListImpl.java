package practice.to_do_list;
//часть 4
//ToDoListImpl - создать, реализовать методы.

public class ToDoListImpl implements ToDoList {
    //fields of class

    private Task[] tasks;
    private int size;

    public ToDoListImpl(int capacity) {
        tasks = new Task[capacity];
        size = 0;

    }


    @Override
    public boolean add(Task task) {
        return false;

    }

    @Override
    public void viewAll() {

    }

    @Override
    public void delete(int taskNumber) {

    }

    @Override
    public void exit() {

    }
}