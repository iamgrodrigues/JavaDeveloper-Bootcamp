package one.digitalinovation.optionals;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Optional value");

        System.out.println(optionalString.isPresent());

        optionalString.ifPresentOrElse(System.out::println,
                () -> System.out.println("Value is NOT present"));

        if (optionalString.isPresent()) {
            String value = optionalString.get();

            System.out.println(value);
        }

        optionalString.map((value) -> value.concat("****")).ifPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));
    }

}
