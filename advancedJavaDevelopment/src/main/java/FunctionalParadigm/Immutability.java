package FunctionalParadigm;

import java.util.function.UnaryOperator;

public class Immutability {

    public static void main(String[] args) {
        int value = 20;
        UnaryOperator<Integer> returnsDouble = v -> v * 2;
        System.out.println(returnsDouble.apply(value));
    }
}
