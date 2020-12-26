/**
 * Challenge
 *
 * Make a program that reads an integer number,
 * and returns the minimum possible numbers of banknotes that value can be decomposed.
 * The banknotes to be considered are 100, 50, 20, 10, 5, 2 e 1.
 * Print the net value and the banknotes used on this operation.
 *
 *
 * Input
 *
 * 1 integer value N ( 0 < N < 1000000 ).
 *
 *
 * Output
 *
 * Print the net value and the amount of banknotes used grouped by type as following example.
 *
 *
 * ------------------------------------------------
 * |   input example   |     output example       |
 * |-------------------|--------------------------|
 * |                   |  576                     |
 * |         576       |  5 banknotes of 100,00   |
 * |                   |  1 banknotes of  50,00   |
 * |                   |  1 banknotes of  20,00   |
 * |                   |  0 banknotes of  10,00   |
 * |                   |  1 banknotes of   5,00   |
 * |                   |  0 banknotes of   2,00   |
 * |                   |  1 banknotes of   1,00   |
 * ------------------------------------------------
 *
 * */

package arithmeticFundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BankNotesCount {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer netValue = Integer.parseInt(st.nextToken());

        System.out.println(netValue);

        int banknote100 = 0;
        int banknote50 = 0;
        int banknote20 = 0;
        int banknote10 = 0;
        int banknote5 = 0;
        int banknote2 = 0;
        int banknote1 = 0;

        while (netValue >= 100){
            netValue -= 100;
            banknote100++;
        }
        while (netValue >= 50){
            netValue -= 50;
            banknote50++;
        }
        while (netValue >= 20){
            netValue -= 20;
            banknote20++;
        }
        while (netValue >= 10){
            netValue -= 10;
            banknote10++;
        }
        while (netValue >= 5){
            netValue -= 5;
            banknote5++;
        }
        while (netValue >= 2){
            netValue -= 2;
            banknote2++;
        }
        while (netValue >= 1){
            netValue -= 1;
            banknote1++;
        }


        System.out.println(banknote100 + " banknotes of R$ 100,00");
        System.out.println(banknote50 + " banknotes of R$ 50,00");
        System.out.println(banknote20 + " banknotes of R$ 20,00");
        System.out.println(banknote10 + " banknotes of R$ 10,00");
        System.out.println(banknote5 + " banknotes of R$ 5,00");
        System.out.println(banknote2 + " banknotes of R$ 2,00");
        System.out.println(banknote1 + " banknotes of R$ 1,00");
    }
}
