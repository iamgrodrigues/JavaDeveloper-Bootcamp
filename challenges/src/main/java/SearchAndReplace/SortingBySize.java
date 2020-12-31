package SearchAndReplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class SortingBySize {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer cases = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();

        for (int i = 0; i < cases; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                words.add(st.nextToken());
            }

            System.out.println(words.stream().sorted(Comparator.comparing(String::length).reversed()
                    .thenComparing(String::compareTo)).collect(Collectors.joining(" ")));
            words.clear();
        }
    }
}