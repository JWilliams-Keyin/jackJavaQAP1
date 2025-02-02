package prob3;

public class Time {

    // Attributes

    private int hour;
    private int min;
    private int sec;

    // Constructors

    public Time() {
        this.hour = 01;
        this.min = 01;
        this.sec = 1900;
    }

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    // Getters

    public int getHour() {
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getSec() {
        return this.sec;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public void setTime(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public String toString() {
        System.out.println(this.hour + ":" + this.min + ":" + this.sec);
        return (this.hour + ":" + this.min + ":" + this.sec);
    }

    public void nextSecond() {
        this.sec +=  1;
    }

    public void prevSecond() {
        this.sec -= 1;
    }
}
