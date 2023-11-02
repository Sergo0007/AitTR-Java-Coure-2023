package practice.to_do_list;
//часть 2

//        Реализовать класс Task (int id, String task, int taskNumber). Геттеры и сеттеры, toString, equals.
//        Сделать класс Task сортируемым по номеру задачи.
import java.util.Objects;

public class Task implements Comparable<Task> {

    //field class
    private int id;
    private String task;
    private int taskNumber;

    //constructor

    public Task(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }
     //getters and setters
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

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public String toString() {// переопределяем метод для себя, ЭТО ПОЛИМОРФИЗМ
        return "Task{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task1 = (Task) o;

        if (id != task1.id) return false;
        if (taskNumber != task1.taskNumber) return false;
        return Objects.equals(task, task1.task);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (task != null ? task.hashCode() : 0);
        result = 31 * result + taskNumber;
        return result;
    }

    @Override
    public int compareTo(Task o) { //сравниваем текуший обьект с заданным
        return Integer.compare(this.getTaskNumber(),o.getTaskNumber());
    }
}
