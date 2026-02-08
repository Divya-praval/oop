class Time {

    int hours;
    int minutes;

    void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    void displayTime() {
        System.out.println("Hours: " + hours + " Minutes: " + minutes);
    }

    void addTime(Time t1, Time t2) {

        hours = t1.hours + t2.hours;
        minutes = t1.minutes + t2.minutes;

        if (this.minutes >= 60) {
            this.hours = this.hours + (this.minutes / 60);
            this.minutes = this.minutes % 60;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Time time1 = new Time();
        time1.setTime(1, 25);
        time1.displayTime();

        Time time2 = new Time();
        time2.setTime(2, 50);
        time2.displayTime();

        Time time3 = new Time();
        time3.addTime(time1, time2);

        System.out.println("After Adding Time1 and Time2:");
        time3.displayTime();
    }
}
