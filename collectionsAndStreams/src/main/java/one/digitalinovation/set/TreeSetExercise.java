package one.digitalinovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercise {

    public static void main(String[] args) {

        TreeSet<Integer> numericalSequence = new TreeSet<>();

        numericalSequence.add(3);
        numericalSequence.add(88);
        numericalSequence.add(20);
        numericalSequence.add(44);
        numericalSequence.add(3);

        Iterator<Integer> iterator = numericalSequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numericalSequence.remove(numericalSequence.first());

        System.out.println(numericalSequence);

        numericalSequence.add(23);

        System.out.println(numericalSequence);

        System.out.println("How many numbers does this TreeSet have? " + numericalSequence.size());

        System.out.println("Is the TreeSet empty? " + numericalSequence.isEmpty());
    }
}
