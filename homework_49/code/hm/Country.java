package hm;

public class Country {
    //fields
    private String name;
    private double population;
    private String continent;

    //constructor

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;


    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
