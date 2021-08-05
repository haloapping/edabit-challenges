package haloapping.github.io.level.easy;

import java.util.Locale;


public class XsAndOsNobodyKnows {
    public boolean getXO(String str) {
        int xCounter = 0;
        int oCounter = 0;
        String stringInLowerCase = str.toLowerCase(Locale.ROOT);

        for (int index = 0; index < stringInLowerCase.length(); index++) {
            if (stringInLowerCase.charAt(index) == 'x') {
                xCounter++;
            } else if (stringInLowerCase.charAt(index) == 'o'){
                oCounter++;
            }
        }

        return xCounter == oCounter;
    }
}
