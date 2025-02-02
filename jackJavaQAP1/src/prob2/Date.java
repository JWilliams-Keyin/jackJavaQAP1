package prob2;

public class Date {

    // Attributes

    private int day;
    private int month;
    private int year;

    // Constructors

    public Date() {
        this.day = 01;
        this.month = 01;
        this.year = 1900;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getters

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
        return (this.day + "/" + this.month + "/" + this.year);
    }
}
