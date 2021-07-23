package haloapping.github.io.level.easy;

public class BasicCalculator {
    public int calculator(int num1, char operator, int num2) {
        int result = 0;

        if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            }
        } else if (operator == '+') {
            result = num1 + num2;
        } else {
            result = num1 - num2;
        }

        return result;
    }
}
