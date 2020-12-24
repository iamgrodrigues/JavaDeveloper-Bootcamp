package FunctionalParadigm;

import java.util.function.BiPredicate;

public class FunctionPure {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isGreater =
                (parameter, comparisonValue) -> parameter > comparisonValue;

        System.out.println(isGreater.test(13, 12));
        System.out.println(isGreater.test(13, 12));
    }
}
