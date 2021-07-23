package haloapping.github.io.level.easy;

public class HowMuchIsTrue {
    public int countTrue(boolean[] arr) {
        int counter = 0;

        for (boolean item : arr) {
            if (item == true) {
                counter++;
            }

        }

        return counter;
    }
}
