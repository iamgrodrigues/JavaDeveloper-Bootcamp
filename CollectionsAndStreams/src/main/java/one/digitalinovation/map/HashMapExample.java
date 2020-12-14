package one.digitalinovation.map.teste;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> worldCupChanpions = new HashMap<>();

        worldCupChanpions.put("Brazil", 5);
        worldCupChanpions.put("Germany", 4);
        worldCupChanpions.put("Italy", 4);
        worldCupChanpions.put("Uruguay", 2);
        worldCupChanpions.put("Argentina", 2);
        worldCupChanpions.put("France", 2);
        worldCupChanpions.put("England", 1);
        worldCupChanpions.put("Spain", 1);

        System.out.println(worldCupChanpions);

        worldCupChanpions.put("Brazil", 6);

        System.out.println(worldCupChanpions);

        System.out.println("How many World Cups did Argentina win? " + worldCupChanpions.get("Argentina"));

        System.out.println("Did France win any World Cup? " + worldCupChanpions.containsKey("France"));

        worldCupChanpions.remove("France");

        System.out.println("Did France win any World Cup? " + worldCupChanpions.containsKey("France"));

        System.out.println("Is there any country that won 6 World Cups? " + worldCupChanpions.containsValue(6));

        System.out.println("How many countries have won The World Cup? " + worldCupChanpions.size());

        System.out.println(worldCupChanpions);

        for (Map.Entry<String, Integer> entry : worldCupChanpions.entrySet()) {

            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        for (String key : worldCupChanpions.keySet()) {
            System.out.println(key + " -- " + worldCupChanpions.get(key));
        }

        System.out.println(worldCupChanpions);

        System.out.println("Did United States win any World Cup? " + worldCupChanpions.containsKey("United States"));

        System.out.println("Is there any country that won 5 World Cups? " + worldCupChanpions.containsValue(5));

        System.out.println("How many countries have won The World Cup? " + worldCupChanpions.size());

        worldCupChanpions.clear();

        System.out.println("How many countries have won The World Cup? " + worldCupChanpions.size());

    }
}
