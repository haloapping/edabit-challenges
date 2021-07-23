package haloapping.github.io.level.easy;

public class StringEndingMatchesSecondString {
    public boolean checkEnding(String str1, String str2) {
        int indexStr1 = str1.length() - 1;
        int indexStr2 = str2.length() - 1;
        boolean found = true;

        while (indexStr2 >= 0) {
            if (str1.charAt(indexStr1) != str2.charAt(indexStr2)) {
                found = false;
                break;
            }

            indexStr1--;
            indexStr2--;
        }

        return found;
    }
}
