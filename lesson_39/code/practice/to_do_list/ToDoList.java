package practice.to_do_list;
// часть 3
//Интерфейс ToDoList должен соответствовать функциям меню.

public interface ToDoList {
    boolean add(Task task);
    void viewAll();
    void delete(int taskNumber);
    void exit();//скорее всего exit не нужно здесь писать,так как главные функции: добавить, просмотреть все или
    //удалить

}
