package functionalParadigm;

import java.util.function.UnaryOperator;

public class FunctionalExample {

    public static void main(String[] args) {
        UnaryOperator<Integer> calcValue3Times = value -> value*3;
        int value = 10;
        System.out.println("The result is :: "+calcValue3Times.apply(10));
    }
}

 // On the Functional Paradigm the instruction does not need to get executed at the moment of its declaration,
// it can be declared before its use and only get executed later on the code.
