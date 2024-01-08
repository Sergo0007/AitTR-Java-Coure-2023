package hw_64.todolistappl.dao;

import hw_64.todolistappl.model.Task;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDolistImpl implements ToDoList, Serializable {//нужен для использования байтового потока IO

    @Override
    public boolean addTask(Task task) {
        return false;
    }

    @Override
    public Task removeTask(int taskNumber) {
        return null;
    }

    @Override
    public void viewTasks() {

    }

    @Override
    public List<Task> getAllTasks() {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

//    private List<Task> tasks;
//    private int quantity;
//    private LocalDate time;
//
//
//
//    public ToDolistImpl(int capacity){
//        tasks = new ArrayList<>();
//    }
//    public boolean addTask(Task task){
//        if (task == null){
//            return false;
//        }
//        tasks.add(task);//методом ArrayList добавляем в него таск
//        return true;
//    }
//    public void viewTsk(){
//        for (int i = 0; i < tasks.size(); i++) {
//            for (Task task : tasks){
//                System.out.println(tasks.indexOf(task)  + 1 + " : " + task);
//            }
//
//
//        }
//
//
//    }
//    public Task removeTask(int taskNumber){
//        Task removed = tasks.get(taskNumber);
//        tasks.remove(removed);
//        return removed;
 //   }
//    public void exit(){
//        System.out.println(0);
    }

