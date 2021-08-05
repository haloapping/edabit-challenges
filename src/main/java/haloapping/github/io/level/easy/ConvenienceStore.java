package haloapping.github.io.level.easy;

import org.w3c.dom.ls.LSOutput;

public class ConvenienceStore {
    public boolean changeEnough(int[] change, double amountDue) {
        float quater = 0.25f;
        float dime = 0.1f;
        float nickel = 0.05f;
        float penny = 0.01f;

        float total = (change[0] * quater) + (change[1] * dime) + (change[2] * nickel) + (change[3] * penny);

        if (total >= amountDue) {
            return true;
        }

        return false;
    }
}
