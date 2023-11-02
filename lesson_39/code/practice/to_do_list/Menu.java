package practice.to_do_list;

//        Задача 1. Начать реализацию приложения "Список дел".
//
//        Использовать enum для организации меню (номер пункта, действие) приложения:
//        добавить запись
//        посмотреть все записи
//        удалить запись (по номеру)
//        выйти
//        Реализовать метод printMenu().

// часть 1
public enum Menu {
    ADD(1, "Add task"), VIEW_ALL(2, "View task"),
    DELETE(3, "Delete task by number"), EXIT(4, "Exit");

    private final int number;
    private final String action;

    Menu(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public  int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }

    public static void printMenu() {
        System.out.println("Menu: ");
        for (Menu menu : Menu.values()) {
            System.out.println(menu.getNumber() + ". " + menu.getAction());
        }
    }
}




