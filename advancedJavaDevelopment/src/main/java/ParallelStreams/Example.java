package ParallelStreams;

import java.util.stream.IntStream;

public class Example {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> factorial(num));
        long end = System.currentTimeMillis();
        System.out.println("Serial execution time :: " + (end-start));

        start = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> factorial(num));
        end = System.currentTimeMillis();
        System.out.println("Parallel execution time :: " + (end-start));

//        List<String> names = Arrays.asList("Guilherme", "Rodrigues", "Taisa", "Cristina");
//        names.parallelStream().forEach(System.out::println);
    }

    public static long factorial(long num){
        long fact = 1;

        for (long i = 2; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
