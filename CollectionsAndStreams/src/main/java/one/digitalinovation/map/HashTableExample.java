package one.digitalinovation.map.teste;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<String, Integer> students = new Hashtable<>();

        students.put("Carlos", 21);
        students.put("Mariana", 33);
        students.put("Rafaela", 18);
        students.put("Pedro", 44);

        System.out.println(students);

        students.put("Pedro", 55);

        System.out.println(students);

        students.remove("Pedro");

        System.out.println(students);

        int studentAge = students.get("Mariana");

        System.out.println("How old is Mariana? " + studentAge);

        System.out.println("How many students are in the HashTable? " + students.size());

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        for (String key : students.keySet()) {
            System.out.println(key + " -- " + students.get(key));
        }

        System.out.println(students);

    }
}
