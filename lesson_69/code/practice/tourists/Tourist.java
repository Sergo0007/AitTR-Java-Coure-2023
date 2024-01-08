package practice.tourists;

import java.util.Arrays;

public class Tourist {
    //нужен турист и страны которые он посетил
    private String name;
    String[] countries;

    public Tourist(String name, String... countries) {//массив разной длины
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }


    public String[] getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "name='" + name + '\'' +
                ", countries=" + Arrays.toString(countries) +
                '}';
    }
}
