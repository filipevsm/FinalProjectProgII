package main;

public class TimeStamp {
    private int hour, min, sec;

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

    public void addSec(int sec) {
        this.sec += sec;
        if (this.sec >= 60) {
            this.min += (this.sec / 60);
            this.sec = (this.sec % 60);
        }
    }
}
