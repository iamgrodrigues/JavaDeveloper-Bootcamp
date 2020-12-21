package Consumers;

import java.util.function.Consumer;

public class Example {

    public static void main(String[] args) {

        Consumer<String> printAPhrase = System.out::println;
//        Consumer<String> printAPhrase = phrase -> System.out.println(phrase);
        printAPhrase.accept("Hello World");
    }
}
