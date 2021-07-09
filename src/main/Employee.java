package main;

import java.io.Serializable;

public class Employee implements Serializable {
    private int employeeNumber;
    private String firstName, lastName;
    private double hourlyWage;
    private TimeStamp timestamp = new TimeStamp(0,0,0);
    private double totalWage;

    public Employee(int employeeNumber, String firstName, String lastName, double hourlyWage) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyWage = hourlyWage;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setTimestamp(TimeStamp timestamp) {
        this.timestamp = timestamp;
    }

    public TimeStamp getTimestamp() {
        return timestamp;
    }

    //CALCULATES THE TOTAL WAGE OF THE EMPLOYEE BASED ON TOTAL HOUR, MINUTES AND SECONDS WORKED
    public void setTotalWage() {
        double hourWage, minWage, secWage;
        hourWage = (this.timestamp.getHour() * this.hourlyWage);
        minWage = ((this.timestamp.getMin() / 60) * this.hourlyWage);
        secWage = (((this.timestamp.getSec() / 60) / 60) * this.hourlyWage);
        this.totalWage = (hourWage + minWage + secWage);
    }

    public double getTotalWage() {
        setTotalWage();
        return totalWage;
    }

    public void addTotalWage(double totalWage) {
        this.totalWage += totalWage;
    }
}
