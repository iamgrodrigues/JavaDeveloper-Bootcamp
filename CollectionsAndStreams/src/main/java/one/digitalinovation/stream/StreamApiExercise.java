package one.digitalinovation.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamApiExercise {

    public static void main(String[] args) {

        List<Friend> friends = new ArrayList<>();

        friends.add(new Friend("Matt", 32, "Persian"));
        friends.add(new Friend("Leonardo", 35, "Brazilian"));
        friends.add(new Friend("Shuhey", 30, "Japanese"));
        friends.add(new Friend("Mika", 40, "Persian"));
        friends.add(new Friend("Matt", 35, "Persian"));
        friends.add(new Friend("Matt", 35, "Persian"));
    }
}
