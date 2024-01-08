package hw_64.todolistappl.dao;

import hw_64.todolistappl.model.Task;

import java.util.List;

public interface ToDoList {
    //add task
    boolean addTask(Task task);
    Task removeTask(int taskNumber);
    void viewTasks();
    List<Task> getAllTasks();//взять весь список
    int quantity();


}
