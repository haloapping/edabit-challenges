package haloapping.github.io.level.easy;

public class PhoneNumberFormatting {
    public static String formatPhoneNumber(int[] nums) {
        String firstNumber = "(" + nums[0] + nums[1] + nums[2] + ")";
        String secondNumber = "" + nums[3] + nums[4] + nums[5] + "-" + nums[6] + nums[7] + nums[8] + nums[9];

        return firstNumber + " " + secondNumber;
    }
}
