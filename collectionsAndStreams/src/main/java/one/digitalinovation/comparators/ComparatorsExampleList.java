package one.digitalinovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        students.add(new Students("Pedro", 19));
        students.add(new Students("Carlos", 23));
        students.add(new Students("Mariana", 21));
        students.add(new Students("João", 18));
        students.add(new Students("Thiago", 20));
        students.add(new Students("George", 22));
        students.add(new Students("Larissa", 21));

        System.out.println("----- insertion order -----");
        System.out.println(students);

        students.sort((first, second) -> first.getAge() - second.getAge());

        System.out.println("----- natural numbers order - age -----");
        System.out.println(students);

        students.sort((first, second) -> second.getAge() - first.getAge());

        System.out.println("----- reversed numbers order - age -----");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Students::getAge));

        System.out.println("----- natural numbers order - age (reference method) -----");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Students::getAge).reversed());

        System.out.println("----- reversed numbers order - age (reference method) -----");
        System.out.println(students);

        Collections.sort(students);

        System.out.println("----- natural numbers order - age (Comparable Interface) -----");
        System.out.println(students);

        Collections.sort(students, new StudentsByReversedAgeComparator());

        System.out.println("----- reversed numbers order - age (Comparator Interface) -----");
        System.out.println(students);

    }
}
