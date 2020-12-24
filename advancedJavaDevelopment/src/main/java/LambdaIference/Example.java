package LambdaIference;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<Integer, Double> divisionBy2 = (var number) -> number / 2.0;

        System.out.println(divisionBy2.apply(500));
    }
}
