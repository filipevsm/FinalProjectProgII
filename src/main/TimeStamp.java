package main;

import java.util.InputMismatchException;

/**
 * TimeStamp object is responsible for interpreting and storing the amount of time each employee worked.
 */
public class TimeStamp {
    private int hour, min, sec;

    /**
     * Constructor for TimeStamp object, which is created for each Employee object.
     *
     * @param hour
     * @param min
     * @param sec
     */

    public TimeStamp(int hour, int min, int sec) {
        try {

            this.hour = hour;
            this.min = min;
            this.sec = sec;
        } catch (InputMismatchException exc) {
            System.out.println("Invalid input");
        }
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
     *
     * @param min
     */

    public void addMin(int min) {
        try {
            this.min += min;
            if (this.min >= 60) {
                this.hour += (this.min / 60);
                this.min = (this.min % 60);
            }
        }
        // will update
        catch (Exception e) {
            System.out.println("error message");
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
     *
     * @param sec
     */

    public void addSec(int sec) {
        try {
            this.sec += sec;
            if (this.sec >= 60) {
                this.min += (this.sec / 60);
                this.sec = (this.sec % 60);
            }
        }

        // will update
        catch (Exception e) {
            System.out.println("error message");
        }

    }

}
