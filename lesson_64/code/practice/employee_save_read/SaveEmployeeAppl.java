package practice.employee_save_read;

import com.sun.source.doctree.SeeTree;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl {
    public static void main(String[] args) {


        Address address1 = new Address("berlin", "Hans", 13, 3);
        Address address2 = new Address("berlin", "Hans", 11, 1);
        Employee e1 = new Employee(1, "Peter", LocalDate.of(1996, 05, 20), 2500, address1);
        Employee e2 = new Employee(2, "Yan", LocalDate.of(1906, 05, 01), 2600, address2);
        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        //делаем новый обьект из класса ObjectoutputStream

        {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./dest/employees.dat"));
                oos.writeObject(employees);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }


}
