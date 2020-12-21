package Iterations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        String[] names = {"João", "João", "Paulo", "Oliveira", "Instrutor", "Java"};
        Integer[] numbers = {1, 2, 3, 4, 5};
//        printFilteredNames(names);
//        printAllNames(names);
        printTheDoubleOfEachListItem(numbers);
        List<String> professions = new ArrayList<>();
        professions.add("Designer Manager");
        professions.add("Product Owner");
        professions.add("Scrum Master");
        professions.add("Developer Manager");

        professions.stream()
                .filter(profession -> profession.endsWith("Manager"))
                .forEach(System.out::println);

    }

    public static void printFilteredNames(String... names) {
        String namesToBePrinted = "";
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("João")) {
                namesToBePrinted += "" + names[i];
            }
        }

        System.out.println("Names from for: " + namesToBePrinted);

        String namesToBePrintedFromStream = Stream.of(names)
                .filter(name -> name.equals("João"))
                .collect(Collectors.joining());

        System.out.println("Names from Stream: " + namesToBePrintedFromStream);


//        String resutlNames = Stream.of(names)
//                .filter(name -> name.equals("João"))
//                .collect(Collectors.joining());
//
//        System.out.println(resutlNames);
    }

    public static void printAllNames(String... names) {
        for (String name : names) {
            System.out.println("Printed by for: " + name);
        }

        Stream.of(names).forEach(name -> System.out.println("Printed by forEach: " + name));
    }

    public static void printTheDoubleOfEachListItem(Integer... numbers) {
        for (Integer number: numbers) {
            System.out.println(number*2);
        }
        Stream.of(numbers).map(number -> number * 2).forEach(System.out::println);
    }
}
