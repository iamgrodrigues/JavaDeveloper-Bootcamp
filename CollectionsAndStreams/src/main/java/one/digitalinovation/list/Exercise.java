package one.digitalinovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();

        friends.add("Juliana");
        friends.add("Pedro");
        friends.add("Carlos");
        friends.add("Larissa");
        friends.add("João");

        for (String friend: friends) {
            System.out.println(friend);
        }

        friends.set(2, "Roberto");

        friends.get(1);
        friends.remove(3);
        friends.remove("João");

        System.out.println("How many friends is still in the list? " + friends.size());

        System.out.println("Is Juliana in the list? " + friends.contains("Juliana"));

        System.out.println(friends);

        List<String> newFriends = new ArrayList<>();

        newFriends.add("Ismael");
        newFriends.add("Rodrigo");

        friends.addAll(newFriends);

        Collections.sort(friends);

        System.out.println(friends);

        System.out.println("Is the list empty? " + friends.isEmpty());

    }
}
