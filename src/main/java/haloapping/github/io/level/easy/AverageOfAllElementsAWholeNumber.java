package haloapping.github.io.level.easy;

public class AverageOfAllElementsAWholeNumber {
    public boolean isAvgWhole(int[] arr) {
        double total = 0;

        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }

        System.out.println((int) (total / arr.length));
        System.out.println((total / arr.length));
        System.out.println(1 == 1.0);


        return total / arr.length == (int) (total / arr.length);
    }
}
