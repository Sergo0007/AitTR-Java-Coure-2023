package practice.month;

public enum Month {
    JAN("January",31),FEB("February",28),MAR("March",31),
    APR("April",30),MAY("May",31),JUN("June",30),Jul("July",31),
    AUG("August",31),SEP("September",30),OCT("October",31),
    NOV("November",30), DEC("December",31);
    //field class
    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }
//    Задайте emun Month, определите месяца, их наименования и количество в них дней.
//    Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
//    Пример: AUG + 6 month = FEB
//    Проверьте работу метода в приложении

    //method для увеличения количества месяцев
    public Month plusMonth(int quantity){
        int index = ordinal();// взяли текущий номер месяца
        index = index + quantity;//увеличили количество месяцев
        Month[] months = values();// все константы вносим в массив типа Month
//        int res = index % months.length;//вычислили номер месяца после прибавления quantity
//        return months[res]; ////возвращаем обьект типа Month, index которого = % 12
        return months[index % months.length];//возвращаем обьект типа Month, index которого = % 12

    }
}


