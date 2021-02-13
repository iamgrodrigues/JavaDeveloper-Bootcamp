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

public class AgeInDays {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer ageInDays = Integer.parseInt(st.nextToken());
        Integer years = 0;
        Integer months= 0;

        while (ageInDays >= 365){
            ageInDays -= 365;
            years++;
        }
        while (ageInDays >= 30){
            ageInDays -= 30;
            months++;
        }

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(ageInDays + " dia(s)");
    }
}
