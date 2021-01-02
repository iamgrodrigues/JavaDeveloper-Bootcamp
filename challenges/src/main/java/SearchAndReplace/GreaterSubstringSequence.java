package SearchAndReplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterSubstringSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word1;
        String word2;

        while (br.lines() != null) {

            word1 = br.readLine();
            word2 = br.readLine();

            greaterSubstringSequence(word1, word2);
        }

        br.close();
    }

    private static void greaterSubstringSequence(String s1, String s2) {

        int maxSize = 0;

        if (s2.length() > s1.length()) {
            String s3 = s2;
            s2 = s1;
            s1 = s3;
        }

        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < i + 1; j++) {
                if (s1.contains(s2.substring(j, s2.length() - i + j))) {
                    maxSize = (maxSize > s2.length() - i) ? maxSize : s2.length() - i ;
                }
            }
        }

        System.out.println(maxSize);
    }
}
