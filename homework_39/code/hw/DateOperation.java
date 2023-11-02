package hw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateOperation {


    public static int getAge(String birthDate) {
        LocalDate dayOfBirth = LocalDate.of(1976, 12, 30);//задаем дату рождения
        System.out.println(dayOfBirth);//печатаем
        LocalDate currentDate = LocalDate.now();//узнаем текущую дату
        System.out.println(currentDate);//печатаем
        long age = ChronoUnit.YEARS.between(dayOfBirth, currentDate);//получаем возраст
        System.out.println(age);//печатаем
        return (int) age;//через кастинг возвращаем возраст


    }
    public static String[] sortStringDates(String[] dates){
        return null;

    }


}