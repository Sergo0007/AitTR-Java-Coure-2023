package practice.family_budget.model;



public enum Menu {
    BUDGET(1,"Budget"),
    LOAD(2,"Load data"),
    STORE(3,"Stores"),
    PERSONS(4, "Persons"),
    PERIOD(5,"Period"),
    CHECK(6,"Check budget"),
    REMOVE(7,"remove purchase"),
    EXIT(8,"Exit");
    //field
    private int menuItem;
    private String action;

    Menu(int menuItem, String action) {
        this.menuItem = menuItem;
        this.action = action;
    }
    public static void printMenu(){
        Menu[] menu = Menu.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i].menuItem + " - " + menu[i].action + " | ");

        }
        System.out.println();
    }
}
