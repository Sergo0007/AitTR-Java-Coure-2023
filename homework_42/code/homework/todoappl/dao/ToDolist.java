package homework.todoappl.dao;


import homework.todoappl.model.Task;

public interface ToDolist {
    // add Task
    boolean addTask(Task task);

    // remove Task
    Task removeTask(int taskNumber);

    // print list of Tasks
    void viewTasks();
    // TODO - задач списка
    // подумать над Task[] viewTasks();

    // quantity of tasks
    int quantity();

    // TODO - нужен ли в интерфейсе метод для выхода из меню?
    // Нет, не нужен

}
