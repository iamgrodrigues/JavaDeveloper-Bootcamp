package one.digitalinovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExercise {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ana", 30));
        students.add(new Student("Paulo", 16));
        students.add(new Student("Bruna", 32));
        students.add(new Student("José", 17));

        students.stream().forEach(student -> {
            System.out.println(student.getName() + " - " + student.getAge());
        });

        System.out.println("How many students are in the list? "
                + students.stream().count());

        System.out.println("Students that are 18+ years old: ");
        students.stream().filter(student -> student.getAge()>18)
                .forEach(student -> System.out.println(student.getName()));

        System.out.println("Students that are 18+ years old on a separated list: "
                + students.stream().filter(student -> student.getAge()>18)
                .map(student -> student.getName()).collect(Collectors.toList()));

        System.out.println("What are the students with the letter 'b' on their names? "
                + students.stream().filter(student -> student.getName().toLowerCase().contains("b"))
                .map(student -> student.getName()).collect(Collectors.toList()));

        System.out.println("Is there any name that contains the letter 'd'? "
                + students.stream().anyMatch((student) -> student.getName().contains("d")));

        System.out.println("What is the oldest student in the list? "
                + students.stream().max(Comparator.comparing(student -> student.getAge()))
                .get().getName());

        System.out.println("The youngest student in a new the list? "
                + students.stream().min(Comparator.comparing(student -> student.getAge()))
                .stream().map(student -> student.getName()).collect(Collectors.toList()));

//        var names = students.stream().map(student -> {
//            System.out.println(student.getName());
//            return student.getName();
//        });


    }
}
