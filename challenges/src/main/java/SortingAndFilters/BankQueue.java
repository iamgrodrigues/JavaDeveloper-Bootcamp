package SortingAndFilters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BankQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer queue = Integer.parseInt(br.readLine());

        for (int i = 0; i < queue; i++) {
            Integer clients = Integer.parseInt(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            List<Integer> queueCodes = new ArrayList<>();

            while (st2.hasMoreTokens()) {
                queueCodes.add(Integer.parseInt(st2.nextToken()));
            }

            List<Integer> sortedQueueCodes = new ArrayList<>();

            sortedQueueCodes.addAll(queueCodes);

            Collections.sort(sortedQueueCodes, Collections.reverseOrder());

            for (int j = 0; j < queueCodes.size(); j++) {
                if (queueCodes.get(j) != sortedQueueCodes.get(j)) {
                    clients--;
                }
            }

            System.out.println(clients);
        }
    }
}
