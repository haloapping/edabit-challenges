package haloapping.github.io.level.easy;

public class SmallestAndBiggestNumbers {
    public double[] minMax(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return new double[] {arr[0], arr[arr.length - 1]};
    }
}
