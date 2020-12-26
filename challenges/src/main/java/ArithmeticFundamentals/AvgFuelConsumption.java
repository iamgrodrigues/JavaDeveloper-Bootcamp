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

package ArithmeticFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AvgFuelConsumption {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer distanceRidden = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Float usedFuel = Float.parseFloat(st.nextToken());

        Float avgFuelConsumption = distanceRidden/usedFuel;

        System.out.printf("%.3f", avgFuelConsumption).println(" km/l");
    }
}
