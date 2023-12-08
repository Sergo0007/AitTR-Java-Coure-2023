package h_w.todo_v3.dao;

import h_w.todo_v3.model.Task;

public class ToDolistImpl implements Todolist{
    //fields
    private Task[] tasks;
    private int quantity;

    //constructor
    public ToDolistImpl(int capacity){
        tasks = new Task[capacity];
    }
    @Override
    public boolean addTask(Task task) {
        return false;
    }

    @Override
    public Task findTask(int taskNumber) {
        return null;
    }

    @Override
    public Task removeTask(int taskNumber) {
        return null;
    }

    @Override
    public void viewTask() {

    }

    @Override
    public int quantity() {
        return 0;
    }
}
