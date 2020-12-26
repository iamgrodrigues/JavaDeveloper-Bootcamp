/**
 * Challenge
 *
 * Make a program that reads a number, and returns the even numbers till that number including the number itself.
 *
 *
 * Input
 *
 * 1 integer value N, where N > 0.
 *
 *
 * Output
 *
 * Print all the even numbers till that numbers.
 *
 *
 * ------------------------------------------
 * |input example      | output example     |
 * |-------------------|--------------------|
 * |                   |         2          |
 * |         6         |         4          |
 * |                   |         6          |
 * ------------------------------------------
 *
 * */

package arithmeticFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EvenNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer number = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= number; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);;
            }
        }
    }
}
