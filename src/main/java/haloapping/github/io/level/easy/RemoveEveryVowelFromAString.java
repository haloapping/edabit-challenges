package haloapping.github.io.level.easy;

public class RemoveEveryVowelFromAString {
    public String removeVowels(String s) {
        return s.replaceAll("[aiueoAIUEO]", "");
    }
}
