package haloapping.github.io.level.easy;

public class Stuttering {
    public String stutter(String word) {
        String firstWord = word.charAt(0) + "" + word.charAt(1) + "... " + word.charAt(0) + word.charAt(1) + "... ";
        String secondWord = word + "?";

        return firstWord + secondWord;
    }
}
