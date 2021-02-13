/**
 * Challenge
 *
 * Make a program that calculates the average fuel consumption of vehicle,
 * the distance ridden (km) and the total of fuel (l) used will be given.
 *
 *
 * Input
 *
 * An integer value X = distance ridden (km) and a real value y = fuel litters used (l) with one decimal.
 *
 *
 * Output
 *
 * Print the average fuel consumption with three decimals with the message " km/l' at the end.
 *
 *
 * ------------------------------------------------
 * |   input example   |     output example       |
 * |-------------------|--------------------------|
 * |                   |                          |
 * |         500       |      14.286 km/l         |
 * |         35.0      |                          |
 * |                   |                          |
 * ------------------------------------------------
 *
 * */

package JavaBasicProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grades {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer numericalGrade = Integer.parseInt(st.nextToken());

        if (numericalGrade == 0) {
            System.out.println("E");
        } else if (numericalGrade <= 35) {
            System.out.println("D");
        } else if (numericalGrade <= 60) {
            System.out.println("C");
        } else if (numericalGrade <= 85) {
            System.out.println("B");
        } else if (numericalGrade <= 100) {
            System.out.println("A");
        }
    }
}
