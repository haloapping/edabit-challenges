package haloapping.github.io.level.easy;

public class FindTheDiscount {
    public double discount(int price, int percentage) {
        double discount = price * percentage / 100;

        return price - discount;
    }
}
