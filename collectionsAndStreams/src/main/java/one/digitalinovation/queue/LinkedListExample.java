package one.digitalinovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedList<>();

        bankQueue.add("Pamela");
        bankQueue.add("Patricia");
        bankQueue.add("Roberto");
        bankQueue.add("Flavio");
        bankQueue.add("Anderson");

        System.out.println(bankQueue);

        String customerToBeAttended = bankQueue.poll();

        System.out.println(customerToBeAttended);

        System.out.println(bankQueue);

        String firstCustomer = bankQueue.peek();

        System.out.println(firstCustomer);

        System.out.println(bankQueue);

        for (String customer: bankQueue) {
            System.out.println(customer);
        }

        Iterator<String> iteratorBankQueue = bankQueue.iterator();

        while (iteratorBankQueue.hasNext()) {
            System.out.println("---> " + iteratorBankQueue.next());
        }

        System.out.println(bankQueue.size());

        System.out.println(bankQueue.isEmpty());

        bankQueue.clear();

        String  firstCustomerOrError = bankQueue.element();

        System.out.println(firstCustomerOrError);

        System.out.println(bankQueue);

    }
}
