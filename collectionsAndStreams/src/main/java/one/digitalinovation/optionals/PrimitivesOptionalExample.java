package one.digitalinovation.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class PrimitivesOptionalExample {

    public static void main(String[] args) {
        System.out.println("***Integer Optional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Double Optional***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("***Long Optional***");
        OptionalLong.of(23L).ifPresent(System.out::println);

    }
}
