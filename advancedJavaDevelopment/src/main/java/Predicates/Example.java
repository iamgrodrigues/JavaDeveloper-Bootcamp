package Predicates;

import java.util.function.Predicate;

public class Example {

    public static void main(String[] args) {

        Predicate<String> isValueEmpty = value -> value.isEmpty();
//        Predicate<String> isValueEmpty = value -> {
//            return value.isEmpty();
//        };
//        Predicate<String> isValueEmpty = String::isEmpty;
        System.out.println(isValueEmpty.test(""));
        System.out.println(isValueEmpty.test("Guilherme"));
    }
}
