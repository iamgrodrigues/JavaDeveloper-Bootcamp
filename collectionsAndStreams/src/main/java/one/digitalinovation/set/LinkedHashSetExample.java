package one.digitalinovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numericalSequence = new LinkedHashSet<>();

        numericalSequence.add(16);
        numericalSequence.add(2);
        numericalSequence.add(8);
        numericalSequence.add(4);
        numericalSequence.add(1);

        System.out.println(numericalSequence);

        numericalSequence.remove(4);

        System.out.println(numericalSequence);

        System.out.println("How many numbers does this sequence have? " + numericalSequence.size());

        Iterator<Integer> iterator = numericalSequence.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer number: numericalSequence) {
            System.out.println(number);
        }

        System.out.println("Is the Numerical Sequence empty? " + numericalSequence.isEmpty());
    }
}
