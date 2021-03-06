package one.digitalinovation.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> capitalsTree = new TreeSet<>();

        capitalsTree.add("Porto Alegre");
        capitalsTree.add("Florianópolis");
        capitalsTree.add("Curitba");
        capitalsTree.add("São Paulo");
        capitalsTree.add("Rio de Janeiro");
        capitalsTree.add("Belo Horizonte");

        System.out.println(capitalsTree);

        System.out.println("Which is the first Capital in the tree? " + capitalsTree.first());

        System.out.println("Which is the last Capital in the tree? " + capitalsTree.last());

        System.out.println("Which Capital is lower/before the Capital Florianópolis? " + capitalsTree.lower("Florianópolis"));

        System.out.println("Which Capital is higher/after the Capital Florianópolis? " + capitalsTree.higher("Florianópolis"));

        System.out.println(capitalsTree);

        System.out.println("Which is the first Capital in the tree? " + capitalsTree.pollFirst());

        System.out.println("Which is the last Capital in the tree? " + capitalsTree.pollLast());

        System.out.println(capitalsTree);

        Iterator<String> iterator = capitalsTree.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String capital: capitalsTree) {
            System.out.println(capital);
        }

        /* System.out.println("----------- Exercises of Comparators Lecture -----------");

        System.out.println("----- natural numbers order by key -----");

        System.out.println(capitalsTree);

        Map<String, String> reversedTreeMap = (Map<String, String>) capitalsTree.descendingSet();

        System.out.println("----- reversed numbers order by key -----");

        System.out.println(reversedTreeMap); */
    }
}
