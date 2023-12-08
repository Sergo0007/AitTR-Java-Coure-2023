package h_w.todo_v3.dao;
//3

import h_w.todo_v3.model.Task;

public interface Todolist {

    //add task
    boolean addTask(Task task);
    Task findTask(int taskNumber);
    //remove task
    Task removeTask(int taskNumber);
    //print List of Tasks
    void viewTask();
    //TODO - список задач
    // quantity of tasks
    int quantity();
}
