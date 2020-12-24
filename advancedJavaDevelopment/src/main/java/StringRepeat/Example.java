package StringRepeat;

public class Example {
    public static void main(String[] args) {
        String name = "Guilherme";

        System.out.println(name.repeat(10));

/*
        // Before Java-11 to repeat a string we would have to code something like below:

        String name = "Guilherme";
        String aux = "";

        for (int i = 0; i < 10; i++) {
            aux += name;
        }

        System.out.println(aux);
 */
    }
}
