/**
 * Challenge
 *
 * Make a program that reads 6 values. You can get positives and/or negatives numbers
 * ignoring the null values. Then show the amount of positives number were given.
 *
 *
 * Input
 *
 * 6 positives and/or negatives numbers.
 *
 *
 * Output
 *
 * Print a message saying how many positives numbers were given just like is shown below on output example.
 * Don't forget to add the "Positives Values" message at the end.
 *
 *
 * ------------------------------------------
 * |input example      | output example     |
 * |-------------------|--------------------|
 * |    7              |                    |
 * |   -5              |                    |
 * |    6              |                    |
 * | -3.4              | 4 Positives Values |
 * |  4.6              |                    |
 * |   12              |                    |
 * ------------------------------------------
 *
 *
 * R:
 * */

package ArithmeticFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PositiveNumbers {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int positives = 0;

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Double values = Double.parseDouble(st.nextToken());
            if ( values > 0) {
                positives++;
            }
        }

        System.out.println(positives + " Positives Values");
    }
}
