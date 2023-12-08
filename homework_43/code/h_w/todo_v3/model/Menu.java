package h_w.todo_v3.model;
// side 1

public enum Menu {
    ADD(1, "Add task"), LIST(2, "View task"), FIND(3, "Find task"), REMOVE(4, "Remove task"), EXIT(5, "Exit");

    //fields
    private  int menuItem;
    private String action;

    //constructor
    Menu(int menuItem,String action){
        this.menuItem = menuItem;
        this.action = action;
    }
    //метод void - ничего не возвращает он печатает
    public static void printMenu(){
        Menu[] menu = Menu.values();// put enum items into array
        //поменяли for на foreach
        for (Menu item : menu) {//перебор всех элементов массива menu, где item - это переменная,
            // которая будет содержать каждый элемент перечисления по очереди.
            System.out.println(item.menuItem + " - " + item.action + " | ");

        }
        System.out.println();// new line
    }

}
