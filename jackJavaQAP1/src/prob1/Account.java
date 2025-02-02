package prob1;

public class Account {

    // Attributes

    private final String id;
    private final String name;
    private int balance;
    private int amount;

    // Constructors

    public Account() {
        this.id = "0";
        this.name = "no name";
        this.balance = 0;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void getBalance() {
        System.out.println(this.id + ": " + this.balance);
    }

    public int credit(int amount) {
        this.amount = amount;
        this.balance = balance + amount;

        return this.balance;
    }

    public int debit(int amount) {
        this.amount = amount;

        if (amount <= balance) {
            this.balance = balance - amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }

        return this.balance;
    }

    public void transferTo(Account another, int amount) {
        this.amount = amount;

        if (amount <= balance) {
            this.balance = balance - amount;
            another.balance += amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }

    }

    public String toString() {
        return ("Account[id = " + this.id + " name = " + this.name + " balance = " + this.balance);
    }
}
