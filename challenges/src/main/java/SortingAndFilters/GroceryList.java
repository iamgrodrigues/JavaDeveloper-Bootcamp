/**
 * Challenge
 *
 * Pedro works late every day, so he has no much time for household chores.
 * To optimize his time, he does his grocery list in an app,
 * and he usually only adds an item in the list once he realizes that there is none in the house anymore.
 * The problem is, the app does not remove the duplicated items, as Pedro adds them more than once,
 * the list became bigger and bigger each time he adds something in the list.
 * Your job is to improve that app, adding a feature that removes the duplicate items
 * and sorts them alphabetically.
 *
 *
 * Input
 *
 * The first input line will have one positive integer number N (N < 100),
 * where N is the amount of case test that needs to be organized.
 * Each grocery list only have one line, that contains 1 to 1000 items
 * (all the items are in lowercase letters, and can be a compound word with 1 to 20 letters,
 * with no accent and separated by blank spaces)
 *
 *
 * Output
 *
 * The output must have the N lines, representing the grocery list, with no duplicated items,
 * and alphabetically ordered as shown in the example below:
 *
 *
 * --------------------------------------------------------------------------------------------------------
 * | input example                                            | output example                            |
 * |----------------------------------------------------------|-------------------------------------------|
 * |        2                                                 |                                           |
 * |        beef orange juice pickles orange pickles          |        beef juice orange pickles          |
 * |        orange pear orange pear pear                      |        orange pear                        |
 * |                                                          |                                           |
 * --------------------------------------------------------------------------------------------------------
 *
 **/

package SortingAndFilters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class GroceryList {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer lineNumbers = Integer.parseInt(br.readLine());

        for (int i = 0; i < lineNumbers; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            TreeSet<String> groceryList = new TreeSet<>();

            while (st.hasMoreTokens()) {
                groceryList.add(st.nextToken());
            }

            System.out.println(groceryList.stream().map(string -> string.concat(" ")).collect(Collectors.joining()));
        }
    }
}