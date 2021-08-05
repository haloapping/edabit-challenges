package haloapping.github.io.level.easy;

public class ShuffleTheName {
    public String nameShuffle(String s) {
        String[] names = s.split(" ");

        return names[1] + " " + names[0];
    }
}
