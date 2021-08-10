package haloapping.github.io.level.easy;

public class StringOrInteger {
    public String intOrString(Object var) {
        if (var instanceof Integer) {
            return "int";
        }

        return "str";
    }
}
