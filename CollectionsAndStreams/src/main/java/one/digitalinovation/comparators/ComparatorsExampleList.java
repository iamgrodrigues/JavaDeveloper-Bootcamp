package one.digitalinovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Pedro", 19));
        students.add(new Student("Carlos", 23));
        students.add(new Student("Mariana", 21));
        students.add(new Student("João", 18));
        students.add(new Student("Thiago", 20));
        students.add(new Student("George", 22));
        students.add(new Student("Larissa", 21));

        System.out.println("----- insertion order -----");
        System.out.println(students);

        students.sort((first, second) -> first.getAge() - second.getAge());

        System.out.println("----- natural numbers order - age -----");
        System.out.println(students);

        students.sort((first, second) -> second.getAge() - first.getAge());

        System.out.println("----- reversed numbers order - age -----");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge));

        System.out.println("----- natural numbers order - age (reference method) -----");
        System.out.println(students);

        students.sort(Comparator.comparingInt(Student::getAge).reversed());

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
