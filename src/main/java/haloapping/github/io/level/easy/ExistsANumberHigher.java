package haloapping.github.io.level.easy;

public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {
        for (int item : arr) {
            if (item >= n) {
                return true;
            }
        }

        return false;
    }
}
