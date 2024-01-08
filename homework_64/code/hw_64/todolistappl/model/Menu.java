package hw_64.todolistappl.model;

import java.io.Serializable;

public enum Menu implements Serializable {
    ADD(1,"Add task"),LIST(2,"list of tasks"),REMOVE(3,"Remove task"),SAVE(4,"Save"),LOAD(5,"load"),EXIT(6,"Exit");

    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }
    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values();//put enum items into array
        for (int i = 0; i < menu.length; i++) {
            System.out.println((menu[i].menuItem) + " _ " + menu[i].action + " | ");

        }
        System.out.println();// new line
    }

}
