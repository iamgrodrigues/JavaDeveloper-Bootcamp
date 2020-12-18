package one.digitalinovation.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExercise {

    public static void main(String[] args) {

        HashSet<Integer> numericalSequence = new HashSet<>();

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

        System.out.println("How many numbers does this HashSet have? " + numericalSequence.size());

        System.out.println("Is the HashSet empty? " + numericalSequence.isEmpty());
    }
}
