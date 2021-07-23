package haloapping.github.io.level.easy;

public class GetWordCount {
    public int countWords(String s) {
        int counter = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                counter++;
            }
        }

        return counter;
    }
}
