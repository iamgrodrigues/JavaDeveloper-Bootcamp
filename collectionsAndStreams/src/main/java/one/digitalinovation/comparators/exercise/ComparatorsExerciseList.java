package one.digitalinovation.comparators.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExerciseList {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Gol", 1995));
        cars.add(new Car("Palio", 2000));
        cars.add(new Car("Fusca", 1977));
        cars.add(new Car("Golf", 2005));
        cars.add(new Car("Polo", 2000));
        cars.add(new Car("Uno", 1997));

        Collections.sort(cars);

        System.out.println("----- natural numbers order - year (Comparable Interface) -----");
        System.out.println(cars);

        Collections.sort(cars, new CarsByReversedYearComparator());

        System.out.println("----- reversed numbers order - year (Comparator Interface) -----");
        System.out.println(cars);

        cars.sort((first, second) -> first.getYear() - second.getYear());

        System.out.println("----- natural numbers order - year (lambda Expression) -----");
        System.out.println(cars);

        cars.sort((first, second) -> second.getYear() - first.getYear());

        System.out.println("----- reversed numbers order - year (lambda Expression) -----");
        System.out.println(cars);

        cars.sort(Comparator.comparingInt(Car::getYear));

        System.out.println("----- natural numbers order - year (reference method) -----");
        System.out.println(cars);

        cars.sort((Comparator.comparingInt(Car::getYear).reversed()));

        System.out.println("----- reversed numbers order - year (reference method) -----");
        System.out.println(cars);
    }
}
