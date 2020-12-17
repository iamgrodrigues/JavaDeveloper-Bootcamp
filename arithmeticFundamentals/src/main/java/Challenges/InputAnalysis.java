/**
 * Challenge
 *
 * Make a program that reads 5 integer numbers, and returns the amount of
 * even numbers
 * odd numbers
 * positive numbers
 * positive negatives.
 *
 *
 * Input
 *
 * 5 integer values.
 *
 *
 * Output
 *
 * Print a message saying as following:
 *
 *
 * ------------------------------------------
 * |input example      | output example     |
 * |-------------------|--------------------|
 * |       -5          | 3 even values      |
 * |        0          | 2 odd values       |
 * |       -3          | 1 positive values  |
 * |       -4          | 3 negative values  |
 * |       12          |                    |
 * ------------------------------------------
 *
 * */

package Challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputAnalysis {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int positives = 0;
        int negatives = 0;
        int evens = 0;
        int odds = 0;

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer values = Integer.parseInt(st.nextToken());
            if ( values > 0 ) {
                positives++;
            }//else if (values == 0){}          note: this part can be solved with only the else if clause,
//            else {                            no need on using else if and else...
//                negatives++;
//            }
            else if ( values < 0){
                negatives++;
            }

            if ( values % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        System.out.println(evens + " Even Values");
        System.out.println(odds + " Odd Values");
        System.out.println(positives + " Positives Values");
        System.out.println(negatives + " Negatives Values");
    }
}