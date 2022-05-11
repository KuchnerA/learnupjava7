package kuchner.homework.finance;

public class JavaBank implements Bank {
    @Override
    public double calcRate(int amount, int years) {

        double rate = 0;
        if (amount < 100_000) {
            rate = 5.0;
        } else if (amount >= 100_000 && amount <= 500_000) {
            rate = 6.0;
        } else if (amount > 500_000) {
            rate = 7.0;
        }

        if (years >= 20) {
            rate = rate + 0.5;
        }
        return rate;
    }
}
