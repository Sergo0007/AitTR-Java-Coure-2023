public class StudentAppl {
    //Задача 2. Создать класс Студент (Student) с приватными полями:
    public static void main(String[] args) {
        Student student = new Student(1, "Erik", "Moisen", 2008, "Teacher");
        Student student1 = new Student(2, "Jhon", "Nikolson", 2009, "Designer");

        student.display();
        student.indicator();
        student.study();

        System.out.println("_______________");

        student1.display();
        student1.beginning();
        student1.best();
    }
}

