package haloapping.github.io.level.easy;

public class DoubleLetters {
    public boolean doubleLetters(String word) {
        for (int index = 0; index < word.length(); index++) {
            if (word.charAt(index) == word.charAt(index + 1)) {
                return true;
            }
        }

        return false;
    }
}
