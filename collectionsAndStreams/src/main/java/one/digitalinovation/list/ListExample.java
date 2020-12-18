package one.digitalinovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main (String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Carlos");
        names.add("Pedro");
        names.add("Juliana");
        names.add("Anderson");
        names.add("Maria");
        names.add("João");

        System.out.println(names);

        names.set(2, "Larissa");

        Collections.sort(names);

        names.set(2, "Wesley");

        System.out.println(names);

        names.remove(4);

        System.out.println(names);

        names.remove("Pedro");

        System.out.println(names);

        String name = names.get(2);

        System.out.println(name);

        int position = names.indexOf("Carlos");

        System.out.println(position);

        int listSize = names.size();

        System.out.println(listSize);

        boolean containsAnderson = names.contains("Anderson");

        System.out.println(containsAnderson);

        boolean emptyList = names.isEmpty();

        System.out.println(emptyList);

        for (String itemName: names) {

            System.out.println("---> " + itemName);
        }

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println("------> " + iterator.next());
        }

        names.clear();

        emptyList = names.isEmpty();

        System.out.println(emptyList);

    }
}
