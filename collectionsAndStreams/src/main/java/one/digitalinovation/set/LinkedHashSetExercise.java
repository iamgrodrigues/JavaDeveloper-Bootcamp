package one.digitalinovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExercise {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<>();

        numericalSequence.add(3);
        numericalSequence.add(88);
        numericalSequence.add(20);
        numericalSequence.add(44);
        numericalSequence.add(3);

        Iterator<Integer> iterator = numericalSequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        numericalSequence.remove(numericalSequence.stream().findFirst());

        System.out.println(numericalSequence);

        numericalSequence.add(23);

        System.out.println(numericalSequence);

        System.out.println("How many numbers does this LinkedHashSet have? " + numericalSequence.size());

        System.out.println("Is the LinkedHashSet empty? " + numericalSequence.isEmpty());
    }
}
