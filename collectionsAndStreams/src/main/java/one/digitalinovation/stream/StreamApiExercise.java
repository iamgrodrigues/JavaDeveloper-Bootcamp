package one.digitalinovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExercise {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ana", 30));
        people.add(new Person("Paulo", 16));
        people.add(new Person("Bruna", 32));
        people.add(new Person("José", 17));

        people.stream().forEach(person -> {
            System.out.println(person.getName() + " - " + person.getAge());
        });

        System.out.println("How many students are in the list? "
                + people.stream().count());

        System.out.println("Students that are 18+ years old: ");
        people.stream().filter(person -> person.getAge()>18)
                .forEach(person -> System.out.println(person.getName()));

        System.out.println("Students that are 18+ years old on a separated list: "
                + people.stream().filter(person -> person.getAge()>18)
                .map(person -> person.getName()).collect(Collectors.toList()));

        System.out.println("What are the students with the letter 'b' on their names? "
                + people.stream().filter(person -> person.getName().toLowerCase().contains("b"))
                .map(person -> person.getName()).collect(Collectors.toList()));

        System.out.println("Is there any name that contains the letter 'd'? "
                + people.stream().anyMatch((person) -> person.getName().contains("d")));

        System.out.println("What is the oldest student in the list? "
                + people.stream().max(Comparator.comparing(person -> person.getAge()))
                .get().getName());

        System.out.println("The youngest student in a new the list? "
                + people.stream().min(Comparator.comparing(person -> person.getAge()))
                .stream().map(person -> person.getName()).collect(Collectors.toList()));

//        var names = students.stream().map(student -> {
//            System.out.println(student.getName());
//            return student.getName();
//        });


    }
}
