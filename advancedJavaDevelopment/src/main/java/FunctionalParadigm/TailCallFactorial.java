package FunctionalParadigm;

public class TailCallFactorial {

    public static void main(String[] args) {
        System.out.println(factorialA(5));
    }
    public static double factorialA(double value) {
        return tailCallFactorial(value, 1);
    }
    public static double tailCallFactorial(double value, double number) {
        if (value == 0) {
            return number;
        }
        return tailCallFactorial(value-1, number*value);
    }
}
