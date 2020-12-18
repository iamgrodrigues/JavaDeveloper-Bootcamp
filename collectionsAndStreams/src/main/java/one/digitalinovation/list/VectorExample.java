package one.digitalinovation.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<String> sports = new Vector<>();

        // Add 4 sports on vector
        sports.add("Soccer");
        sports.add("Basketball");
        sports.add("Table Tennis");
        sports.add("Handball");

        // Change the value of position 2
        sports.set(2, "Ping Pong");

        // Remove the position 2
        sports.remove(2);

        // Remove sport Handball
        sports.remove("Handball");

        // Print the first vector's item
        System.out.println(sports.get(0));

        // Navigate sports vector
        for (String sport: sports) {
            System.out.println(sport);
        }
    }
}
