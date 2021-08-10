package haloapping.github.io.level.easy;

public class FibonacciNumber {
    public int fibonacci(int a) {
//        return (int) Math.round((Math.pow(1.618034, a) - Math.pow(1 - 1.618034, a)) / Math.sqrt(5));

        if (a == 0) {
            return 0;
        }

        int firstValue = 0;
        int secondValue = 1;
        int nextValue;

        for (int index = 0; index < a - 1; index++) {
            nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
        }

        return secondValue;
    }
}
