package work.city;

import java.util.Objects;

public class City implements Comparable<City>{
    //field of class
    private String name;
    private int population;
    private String country;
    private double index;//какой-то рейтинг

    //constructor

    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }
    //get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) && Objects.equals(country, city.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(City o) {
        int res = this.name.compareTo(o.name);//сортировка по алфавиту по названию города
        if (res != 0) {
            return res;//если строки совпали вернули res
        }else{//когда строки (названия города)совпали то
            res = Integer.compare(this.population,o.population);
            return res;

        }
        //return this.name.compareTo(o.name);//если int больше нуля то при сортировке обьекты надо поменять местами

    }
}
