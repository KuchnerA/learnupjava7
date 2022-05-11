import kuchner.homework.finance.Bank;

public class Splitter extends Client {

    public Splitter(String name, int age, int salary) throws Exception {
        super(name, age, salary);
    }

    @Override
    public int calcSavings(Bank bank, int years) {
        if (years <= 0) {
            throw new YearsUnderNullException(years);
        }

        int amount = 0;
        int i;
        for (i = 0; i < years; i++) {
            if (i % 3 == 0) {
                amount += this.salary * 0.3;
            }
            amount += (int) (amount * bank.calcRate(amount, years) / 100);

        }

        return amount;
    }
}
