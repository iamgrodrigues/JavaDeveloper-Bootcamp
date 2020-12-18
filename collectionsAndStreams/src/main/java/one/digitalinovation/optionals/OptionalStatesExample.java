package one.digitalinovation.optionals;

import java.util.Optional;

public class OptionalStatesExample {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Value is Present");

        System.out.println("Optional value that is present");
        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("value is NOT present"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Optional value that is not present");
        optionalNull.ifPresentOrElse(System.out::println,
                () -> System.out.println("null = value is NOT present"));

        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Optional value that is not present");
        optionalEmpty.ifPresentOrElse(System.out::println,
                () -> System.out.println("empty = value is NOT present"));

        Optional<String> optionalNullError = Optional.of(null);

        System.out.println("Optional value that triggers a NullPointerException Error");
        optionalNullError.ifPresentOrElse(System.out::println,
                () -> System.out.println("error = value is NOT present"));
    }
}
