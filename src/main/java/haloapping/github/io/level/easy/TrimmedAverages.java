package haloapping.github.io.level.easy;

import java.util.Arrays;

public class TrimmedAverages {
    public static int trimmedAverages(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        float sum = 0F;

        for (int i = 1; i <= arr.length - 2; i++) {
            sum += arr[i];
        }

        return Math.round(sum / (arr.length - 2));
    }
}
