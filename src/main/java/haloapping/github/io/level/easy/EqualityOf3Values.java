package haloapping.github.io.level.easy;

public class EqualityOf3Values {
    public int equal(int a, int b, int c) {
        if (a == b && a == c) {
            return 3;
        } else if (a == b || a == c || b == c) {
            return 2;
        }

        return 0;
    }
}
