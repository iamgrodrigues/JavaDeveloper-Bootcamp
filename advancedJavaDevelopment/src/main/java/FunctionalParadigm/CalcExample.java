package FunctionalParadigm;

public class CalcExample {

    public static void main(String[] args) {

        // Imperative Paradigm
        int value = 10;
        int calc = value * 3;
        System.out.println("The result is :: "+calc);
        // On the Imperative Paradigm the instruction gets executed at the moment of its declaration.

//        // Functional Paradigm
//        UnaryOperator<Integer> calc = value -> value*3;
//        int value = 10;
//        System.out.println("The result is :: "+calc.apply(10));
//        // On the Functional Paradigm the instruction does not need to get executed at the moment of its declaration,
//        // it can be declared before its use and only get executed later on the code.
    }
}

