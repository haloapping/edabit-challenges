package haloapping.github.io.level.easy;

public class ReformTheWord {
    public String getWord(String left, String right) {
        char firstCharacterOfLeftString = (char) (left.charAt(0) - 32);
        String leftName = left.substring(1);

        return firstCharacterOfLeftString + leftName + right;
    }
}
