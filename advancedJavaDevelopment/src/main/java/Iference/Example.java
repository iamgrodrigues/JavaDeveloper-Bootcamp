package Iference;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class Example {

    public static void main(String[] args) throws IOException {
        connectAndPrintURLJavaOracle();
        printFullName("Guilherme","Rodrigues");
        printSum(10,5);
        printNumSum(5, 3, 4, 8);
        printNumMult(10, 5, 2);
    }

    private static void connectAndPrintURLJavaOracle() throws IOException {

        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(joining())
                .replaceAll(">", ">\n"));
/*
        //on Java 8 we still have to declare our variables like below (with types instead of only var)

        URL url = new URL("https://docs.oracle.com/javase/10/language/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining())
                .replaceAll(">", ">\n"));
*/
    }

    public static void printFullName(String name, String lastName) {
        var fullName = String.format("%s %s", name, lastName);
        System.out.println("The " + name + "'s fullname is: " + fullName);
    }

    public static void printSum (int a, int b){
        var sum = a+b;
        System.out.println("The sum of " + a + " + " + b + " is: " + sum);

    }

    public static void printNumSum (int... numbers) {
        int sum;
        if (numbers.length > 0) {
            sum = 0;
            for (var number : numbers) {
                sum += number;
            }

            System.out.println("The sum of the numbers "
                    + Arrays.toString(numbers) + " is: " + sum);
        }
    }

    public static void printNumMult (int... numbers) {
        int mult;
        if (numbers.length > 0) {
            mult = 1;
            for (var number = 0; number < numbers.length; number++) {
                mult *= numbers[number];
            }

            System.out.println("The multiplication of the numbers "
                    + Arrays.toString(numbers) + " is: " + mult);
        }
    }


/*
    var can be used on
        - Local variables initialized
        - For enhanced
        - For loop
        - Try with resource variable

    var can NOT be used on
        - Class declarations
        - As parameters
        - Variables uninitialized
*/
}


