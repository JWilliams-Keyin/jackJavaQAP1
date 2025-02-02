package prob1;

public class TestAccount {
    public static void main(String[] args) {

        // Create accounts

        Account Acc1 = new Account("Acc1", "Bob Downy",  5000);
        Account Acc2 = new Account("Acc2", "Denice Downy",  4000);

        // Display balance before
        Acc1.getBalance();
        Acc2.getBalance();

        // Transfer money

        Acc1.transferTo(Acc2, 1000);

        // Display balance after

        Acc1.getBalance();
        Acc2.getBalance();
    }
}
