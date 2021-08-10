package haloapping.github.io.level.easy;

public class RepeatingLetters {
    public String doubleChar(String s) {
        StringBuilder newString = new StringBuilder();

        for (int index = 0; index < s.length(); index++) {
            newString.append(s.charAt(index));
            newString.append(s.charAt(index));
        }

        return newString.toString();
    }
}
