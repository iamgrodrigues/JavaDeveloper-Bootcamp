package Functions;

import java.util.function.Function;

public class Example {

    public static void main(String[] args) {
        Function<String, String> returnReversedName = text -> new StringBuilder(text).reverse().toString();
        Function<String, Integer> convertStringToIntegerAndDouble = string -> Integer.valueOf(string) * 2;
        System.out.println(returnReversedName.apply("Guilherme"));
        System.out.println(convertStringToIntegerAndDouble.apply("20"));
    }
}
