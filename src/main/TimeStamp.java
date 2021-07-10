package main;

/**
 * TimeStamp object is responsible for interpreting and storing the amount of time each employee worked.
 */
public class TimeStamp {
    private int hour, min, sec;

    /**
     * Constructor for TimeStamp object, which is created for each Employee object.
     * @param hour
     * @param min
     * @param sec
     */
    public TimeStamp(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void addHour(int hour) {
        this.hour += hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return min;
    }

    /**
     * addMin() will increment hour if input received is > 60m.
     * @param min
     */
    public void addMin(int min) {
        this.min += min;
        if (this.min >= 60) {
            this.hour += (this.min / 60);
            this.min = (this.min % 60);
        }
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }

    /**
     * addSec() will increment min if input received is > 60s.
     * @param sec
     */
    public void addSec(int sec) {
        this.sec += sec;
        if (this.sec >= 60) {
            this.min += (this.sec / 60);
            this.sec = (this.sec % 60);
        }
    }
}
