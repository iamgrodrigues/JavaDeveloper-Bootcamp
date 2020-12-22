package one.digitalinovation.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<String, String> capitalsTree = new TreeMap<>();

        capitalsTree.put("RS", "Porto Alegre");
        capitalsTree.put("SC", "Florianópolis");
        capitalsTree.put("PR", "Curitiba");
        capitalsTree.put("SP", "São Paulo");
        capitalsTree.put("RJ", "Rio de Janeiro");
        capitalsTree.put("MG", "Belo Horizonte");

        capitalsTree.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        });

        System.out.println(capitalsTree);

        System.out.println("What is the UF of the first capital in the TreeMap? " + capitalsTree.firstKey());

        System.out.println("What is the UF of the last capital in the TreeMap? " + capitalsTree.lastKey());

        System.out.println("What is the UF lower/before the UF-SC in the TreeMap? " + capitalsTree.lowerKey("SC"));

        System.out.println("What is the UF higher/after the UF-SC in the TreeMap? " + capitalsTree.higherKey("SC"));

        System.out.println(capitalsTree);

        System.out.println(capitalsTree.firstEntry().getValue() + " - " + capitalsTree.firstEntry().getKey());

        System.out.println(capitalsTree.lastEntry().getValue() + " - " + capitalsTree.lastEntry().getKey());

        System.out.println("What is the capital lower/before the UF-SC in the TreeMap? "
                + capitalsTree.lowerEntry("SC").getValue() + " - " + capitalsTree.lowerEntry("SC").getKey());

        System.out.println("What is the capital higher/after the UF-SC in the TreeMap? "
                + capitalsTree.higherEntry("SC").getValue() + " - " + capitalsTree.higherEntry("SC").getKey());

        System.out.println(capitalsTree);

        Map.Entry<String, String> firstEntry = capitalsTree.pollFirstEntry();
        Map.Entry<String, String> lastEntry = capitalsTree.pollLastEntry();

        System.out.println("What is the first capital in the TreeMap? " + firstEntry.getValue() + " - " + firstEntry.getKey());

        System.out.println("What is the last capital in the TreeMap? " + lastEntry.getValue() + " - " + lastEntry.getKey());

        System.out.println(capitalsTree);

        Iterator<String> iterator = capitalsTree.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + " - " + capitalsTree.get(key));
        }

        for (String capital: capitalsTree.keySet()) {
            System.out.println(capital + " -- " + capitalsTree.get(capital));
        }

        for (Map.Entry<String, String> capital: capitalsTree.entrySet()) {
            System.out.println(capital.getKey() + " --- " + capital.getValue());
        }

        System.out.println("----------- Exercises of Comparators Lecture -----------");

        System.out.println("----- natural numbers order by key -----");

        System.out.println(capitalsTree);

        Map<String, String> reversedTreeMap = capitalsTree.descendingMap();

        System.out.println("----- reversed numbers order by key -----");

        System.out.println(reversedTreeMap);

    }
}
