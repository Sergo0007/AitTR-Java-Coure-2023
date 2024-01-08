package hw_64.todolistappl.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Comparable<Task>, Serializable {

    private String task;// содержание задачи
    private LocalDate date;//дата создания задачи

    public Task(String task, LocalDate date) {
        this.task = task;
        this.date = date;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", date=" + date +
                '}';
    }


    @Override
    public int compareTo(Task o) {
        return this.date.compareTo(o.date);// сортируем задачи по дате создания
    }
}
