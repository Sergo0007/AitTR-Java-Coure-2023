package practice.company_v1;

import practice.company_v1.model.Employee;
import practice.company_v1.model.Manager;
import practice.company_v1.model.SalesManager;
import practice.company_v1.model.Worker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeAppl {
    public static void main(String[] args) {
        List<Employee> empl = new ArrayList<>();
        // Employee[] employees = new Employee[4];
        empl.add(new Manager(100, "John", "Smith", 45, 160, 5000, 5, 10, "Studium"));
        empl.add(new SalesManager(101, "Anna", "Black", 36, 160, 25000, 0.1, 7, "Uni"));
        empl.add(new SalesManager(102, "Thomas", "White", 28, 160, 30000, 0.1, 4, "Berufschule"));
        empl.add(new Worker(103, "Gans", "Bauer", 30, 80, 5, 6, "Studium"));

//       double total = totalSalary(employees); // вызываем метод для расчета зарплаты
//       System.out.println("Total salary: " + total);
//       double average = averageAge(employees);
//        System.out.println("Average age: " + average);
//       double totalSales = totalSales(employees); // вызываем метод для расчета зарплаты
//       System.out.println("Total sales: " + totalSales);

        Comparator<Employee> workExpience = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) o1.getWorkExperience() - o2.getWorkExperience();
            }
        };
        System.out.println("------Sorting by expience---------");
        empl.sort(workExpience);
        for (Employee employee : empl) {
            System.out.println(workExpience);
        }
        Comparator<Employee> education = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEducation().compareTo(o2.getEducation());
            }
        };
        System.out.println("_______Sorting by education________");
        empl.sort(education);
        for (Employee employee : empl) {
            System.out.println(employee);
        }


    }

    private static double totalSalary(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }

    private static double averageAge(Employee[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null) {
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }

    private static double totalSales(Employee[] empl) {
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }

}

