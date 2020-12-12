package one.digitalinovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();

        customers.add("Juliana");
        customers.add("Pedro");
        customers.add("Carlos");
        customers.add("Larissa");
        customers.add("João");

        for (String customer: customers) {
            System.out.println("-->" + customer);
        }

        Iterator<String> iteratorCustomer = customers.iterator();

        while (iteratorCustomer.hasNext()) {
            System.out.println("---->" + iteratorCustomer.next());
        }

        System.out.println("Who is the first customer in the queue? " + customers.peek());

        System.out.println(customers.poll());

        customers.add("Daniel");

        System.out.println(customers);

        System.out.println("How many customer is still in the queue? " + customers.size());

        System.out.println("Is the queue empty? " + customers.isEmpty());

        System.out.println("Is Carlos in the queue? " + customers.contains("Carlos"));
    }
}
