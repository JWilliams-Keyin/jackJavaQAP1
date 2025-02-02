package prob3;

public class TestTime {
    public static void main(String[] args) {
         // Create time objects

        Time T1 = new Time(21, 10, 15);
        Time T2 = new Time(10, 20, 25);

        // Display before

        T1.toString();
        T2.toString();

        // Progress time

        T1.nextSecond();
        T2.prevSecond();

        // Display after

        T1.toString();
        T2.toString();
    }
}
