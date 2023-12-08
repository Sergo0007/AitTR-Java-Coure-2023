package practice.company_v1.dao;

import practice.company_v1.model.Employee;
import practice.company_v1.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl implements Company {
    //private Employee[] employees; // массив для хранения сотрудников
    // private int size; // текущее кол-во сотрудников в компании

    List<Employee> employees;//вместо массива делаем лист
    int capacity;//вместимость компании

    // конструктор
    //public CompanyImpl(int capacity){
    //   employees = new Employee[capacity]; // capacity - максимальный размер компании

    public CompanyArrayListImpl(int capacity) {
        employees = new ArrayList<>();//длину (размер) указывать не надо
        this.capacity = capacity;//ограничение по количеству сотрудников в компании
    }

    //O(n)
    @Override
    public boolean addEmployee(Employee employee) {
//        //не добавляем null не превышаем capacity не добавляем существующего
//        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null)  {
//            return false;
//        }

//        employees[size++] = employee;//++ - это постфиксная операция
        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee);//добавили в список сотрудника(элемент списка)
        return true;

    }

    @Override
    public Employee removeEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getId() == id) {
//                Employee victim = employees[i];
////
//                employees[i] = employees[--size];
//                employees[size] = null;
//                return victim;
//
//            }
//        }
//        return null;
        Employee victim = findEmployee(id);
        if (victim != null) {// нужно ли это проверять?
            employees.remove(victim);
            return victim;
        }
        return null;


    }

    //O(n)
    @Override
    public Employee findEmployee(int id) {
//        for (int i = 0; i < size; i++) {
//            if (employees[i].getId() == id) {//нашелся элемент массива у которого совпал id
//                return employees[i];//вернули найденный элемент массива типа Employee
//            }
//        }
//        return null;
        for (Employee e : employees) {// e - это employee из списка employees
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    //O(1)
    @Override
    public int quantity() {
        return employees.size();//вернули длину списка
    }

    //O(n)
    @Override
    public double totalSalary() {
        double res = 0;
//        for (int i = 0; i < size; i++) {
//            res += employees[i].calcSalary();
        for (Employee e : employees) {
            res += e.calcSalary();
        }
//
//
        return res;

    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    //     O(n)
    @Override
    public double totalSales() {
//        double res = 0;
//        for (int i = 0; i <size ; i++) {
//            if (employees[i] instanceof SalesManager){
//                SalesManager salesManager =(SalesManager) employees[i];
//                res += salesManager.getSalesValue();
//            }
//
//        }
        double res = 0;
        for (Employee e : employees) {
            if (e instanceof SalesManager) {
                // SalesManager salesManager = (SalesManager) e;
                //  res += salesManager.getSalesValue();
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;

    }

    // O(n)
    @Override
    public void printEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }

    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
//        int count = 0;
//        //считаем сколько будет элементов массива удовлетворяющих условию
//        for (int i = 0; i < size ; i++) {
//            if (employees[i].getHours() > hours){
//                count++;
//            }
//
//
//        }
//        Employee[] res = new Employee[count];//создаем массив размером count
//        //заполняем массив res
//        for (int i = 0,j = 0; j < res.length; i++) {
//            if (employees[i].getHours() > hours){
//                res[j++] = employees[i];
//            }
//
//        }
//        return res;// это возращаемый массив
        int count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count];//создаем массив размером count
        count = 0;
        for (Employee e : employees) {
            if (e.getHours() > hours) {
                res[count] = employees.get(count);
                count++;

            }
        }
        return res;

    }

    @Override
    public Employee[] findEmployeesSalaryRange(int miniSalary, int maxSalary) {
        //считаем сколько будет элементов массива удовлетворяющих условию
//        int count = 0;
//        for (int i = 0; i < size; i++) {
//            if (employees[i].calcSalary() > miniSalary && employees[i].calcSalary() < maxSalary) {
//                count++;
//            }
//
//        }
//        Employee[] res = new Employee[count];//создаем массив размером count
//        //заполняем массив res
//        for (int i = 0,j = 0; j < res.length; i++) {
//            if ( employees[i].calcSalary() > miniSalary && employees[i].calcSalary() < maxSalary){
//                res[j++] = employees[i];
//            }
//
//        }
//        return res;// это возращаемый массив
        //O(1)
        int count = 0;
        //O(n)
        for (Employee e : employees) {
            if (e.calcSalary() > miniSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        //O(1)
        Employee[] res = new Employee[count];
        count = 0;
        //O(n)
        for (Employee e : employees) {
            if (e.calcSalary() > miniSalary && e.calcSalary() < maxSalary){
                res[count] = e;
                count++;
            }
        }
        return res;
    }
}
