package one.digitalinovation.optionals;

import java.util.Optional;

public class OptionalExercise {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("value is present");

        System.out.println("Optional value is present");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("value is NOT Present"));

        Optional<String> optionalIsPresent = Optional.of("isPresent = Optional Value");

        System.out.println(optionalIsPresent.isPresent());

        System.out.println("Optional value is present");
        if (optionalIsPresent.isPresent()) {
            String value = optionalIsPresent.get();
            System.out.println(value);
        }

        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Optional value that is not present");
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = value is NOT present"));

        Optional<String> optionalError = Optional.empty();

        System.out.println("Optional that triggers an error when the value is NOT present");
        System.out.println(optionalError.orElseThrow(IllegalStateException::new));

    }
}
