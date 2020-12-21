package FunctionInterfaces;

public class HigherOrderFunctions {
    public static void main(String[] args) {
        Calc SUM = (a,b) -> a+b;
        Calc SUBTRACTION = (a,b) -> a-b;
        Calc MULTIPLICATION = (a,b) -> a*b;
        Calc DIVISION = (a,b) -> a/b;

          System.out.println(runOperation(SUM, 1, 3));
          System.out.println(runOperation(SUBTRACTION, 4, 3));
          System.out.println(runOperation(MULTIPLICATION, 7, 3));
          System.out.println(runOperation(DIVISION, 4, 2));
    }

    public static int runOperation (Calc calc, int a, int b) {
        return calc.calc(a,b);
    }
}

@FunctionalInterface
interface Calc {
    public int calc(int a, int b);
}