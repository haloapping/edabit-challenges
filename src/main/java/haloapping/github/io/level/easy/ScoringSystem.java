package haloapping.github.io.level.easy;

public class ScoringSystem {
    public int[] calculateScores(String str) {
        int andyPoints = 0;
        int benPoints = 0;
        int charlottePoints = 0;

        for (int index = 0; index < str.length(); index++) {
            if (str.charAt(index) == 'A') {
                andyPoints++;
            } else if (str.charAt(index) == 'B') {
                benPoints++;
            } else {
                charlottePoints++;
            }
        }

        return new int[] {andyPoints, benPoints, charlottePoints};
    }
}
