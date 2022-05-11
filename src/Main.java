import kuchner.homework.finance.Bank;
import kuchner.homework.finance.JavaBank;

public class Main {

    public static void main(String[] args) {

        try {

            Client client1 = new Saver("Maxim", 26, 30_000);

            Client client2 = new Splitter("Alex", 35, 40_000);

            Bank bank = new JavaBank();

            compare(client1, client2, bank, 30);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public static void compare(Client client1, Client client2, Bank bank, int years) {

        int amount = client1.calcSavings(bank, years) - client2.calcSavings(bank, years);   //amount_RUB

        System.out.println("Разность сумм накоплений: " + amount + " RUB");
    }
}
