package h_w.todo_v3.model;
//2

import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task>{

    //fields
    private int id; // идентификатор
    private String task; //содержание задачи
    private LocalDateTime time;

    //constructor


    public Task(int id, String task, LocalDateTime time) {
        this.id = id;
        this.task = task;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    //метод toString

    @Override
    public String toString() {
        return (id + 1) + " : " + task ;//сначала номер задачи, затем ее текст
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return id == task1.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Task o) {
        return 0;
    }
}

