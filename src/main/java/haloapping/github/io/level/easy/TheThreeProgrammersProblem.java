package haloapping.github.io.level.easy;

public class TheThreeProgrammersProblem {
    public static int programmers(int one, int two, int three) {
        if (one > two && one > three) {
            if (two < three) {
                return one - two;
            }

            return one - three;
        } else if (two > one && two > three) {
            if (one < three) {
                return two - one;
            }

            return two - three;
        } else {
            if (one < two) {
                return three - one;
            }

            return three - two;
        }
    }
}
