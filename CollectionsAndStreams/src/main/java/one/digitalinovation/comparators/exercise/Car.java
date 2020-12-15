package one.digitalinovation.comparators.exercise;

public class Car implements Comparable<Car> {

    private final String model;
    private final Integer year;

    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return model + " - " + year;
    }

    @Override
    public int compareTo(Car o) {
        return this.getYear() - o.getYear();
    }
}
