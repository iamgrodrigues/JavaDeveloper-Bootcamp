package one.digitalinovation.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {

    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        students.add("Pedro");
        students.add("Thayse");
        students.add("Marcelo");
        students.add("Carla");
        students.add("Juliana");
        students.add("Thiago");
        students.add("Rafael");

        System.out.println("How many students does the list have? " + students.stream().count());

        System.out.println("which is the longest student name in the list? "
                + students.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("which is the smallest student name in the list? "
                + students.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("What are the names that contains the letter 'r'? "
                + students.stream().filter((student) ->
                student.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("New list with 'Names - amount of letters' "
                + students.stream().map((student) ->
                student.concat(" - ").concat(String.valueOf(student.length()))).collect(Collectors.toList()));

        System.out.println("The first three names of the list "
                + students.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Navigate and Return all the names in the list and repeat the list "
                + students.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Navigate and Return all the names in the list ");
        students.stream().forEach(System.out::println);

        System.out.println("Is there any name that contains the letter 'w'? "
                + students.stream().allMatch((element) -> element.toLowerCase().contains("w")));

        System.out.println("is there any name with the lowercase letter 'a' on it? "
                + students.stream().anyMatch((element) -> element.contains("a")));

        System.out.println("is there any name without the lowercase letter 'a' on it? "
                + students.stream().noneMatch((element) -> element.contains("a")));

        System.out.println("If the list is not empty, which is the first name of the list? ");
        students.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Method Chaining: ");
        System.out.println(students.stream()
                .peek(System.out::println)
                .map((student) ->
                        student.concat(" - ").concat(String.valueOf(student.length())))
                .peek(System.out::println)
                .filter((student) ->
                        student.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
//                .collect(Collectors.joining(", ")));
//                .collect(Collectors.toSet()));
//                .collect(Collectors.groupingBy((student) -> student.substring(student.indexOf("-") + 1))));
    }
}
