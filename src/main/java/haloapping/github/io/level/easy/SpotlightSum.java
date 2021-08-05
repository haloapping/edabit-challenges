package haloapping.github.io.level.easy;

public class SpotlightSum {
    public int spotlightSum(int n) {
        int top = (n - 9) + (n - 10) + (n - 11);
        int middle = (n - 1) + n + (n + 1);
        int bottom = (n + 9) + (n + 10) + (n + 11);

        return top + middle + bottom;
    }
}
