/**
 * Challenge
 *
 * Make a program that reads positive integer numbers, sort the values following these criteria:
 * Even numbers in ascending order first, then odd numbers in descending order.
 *
 *
 * Input
 *
 * The first input line will have only one positive integer number N (1 < N < 10000),
 * where N is the number of lines inputted.
 * The following input lines will have a non-negative integer number each.
 *
 *
 * Output
 *
 * Print all the input numbers following the order mentioned above.
 * Each number should be printed on different lines as example below:
 *
 *
 * ------------------------------------------
 * |input example      | output example     |
 * |-------------------|--------------------|
 * |       10          |        4           |
 * |        4          |        32          |
 * |       32          |        34          |
 * |       34          |        98          |
 * |       543         |        654         |
 * |       3456        |        3456        |
 * |       654         |        6789        |
 * |       567         |        567         |
 * |       87          |        543         |
 * |       6789        |        87          |
 * |       98          |                    |
 * ------------------------------------------
 *
 * */

package SortingAndFilters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SortingEvenAndOddNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer numbers = Integer.parseInt(br.readLine());
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();


        for (int i = 0; i < numbers; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer number = Integer.parseInt(st.nextToken());

            if (number % 2 == 0) {
                evenNumbers.add(number);
            }else {
                oddNumbers.add(number);
            }
        }

        evenNumbers.stream().sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);
        oddNumbers.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
