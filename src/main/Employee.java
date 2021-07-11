package main;

import java.io.IOException;
import java.io.Serializable;
import java.util.InputMismatchException;

public class Employee implements Serializable {
    private int employeeNumber;
    private String firstName, lastName;
    private double hourlyWage;
    private TimeStamp timestamp = new TimeStamp(0, 0, 0);
    private double totalWage;

    /**
     * This is the constructor for Employee, which will be initialized for each employee read.
     *
     * @param employeeNumber first value in employees.txt
     * @param lastName second value in employees.txt
     * @param firstName third value in employees.txt
     * @param hourlyWage fourth value in employees.txt
     */
    public Employee(int employeeNumber, String lastName, String firstName, double hourlyWage) {
        try {
            this.employeeNumber = employeeNumber;
            this.lastName = lastName;
            this.firstName = firstName;
            this.hourlyWage = hourlyWage;
        } catch (InputMismatchException e) {
            System.out.println("Please try again. The parameters required to initialize Employee are employeeNumber, lastName, firstName, hourlyWage");
        }

    }

    /**
     * Reassigns the employeeNumber passed to the Employee object.
     * @param employeeNumber
     */
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     *
     * @return employeeNumber of the Employee object.
     */
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Reassigns the value of firstName passed to the Employee object.
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return firstName of the Employee object.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Reassigns the value of lastName passed to the Employee object.
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return lastName of the Employee object.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Reassigns the value of hourlyWage passed to the Employee object.
     * @param hourlyWage
     */
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     *
     * @return hourlyWage of the Employee object.
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Reassigns the value of Timestamp passed to the Employee object.
     * @param timestamp
     */
    public void setTimestamp(TimeStamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     *
     * @return timestamp of the Employee object.
     */
    public TimeStamp getTimestamp() {
        return timestamp;
    }

    /**
     * Calculates the total wage of the employee based on total hours, minutes and seconds worked.
     *
     * @see EmployeeTotalWageCompare
     */
    public void setTotalWage() {
        double hourWage, minWage, secWage;
        try {
            hourWage = (this.timestamp.getHour() * this.hourlyWage);
            minWage = (((double) this.timestamp.getMin() / 60) * this.hourlyWage);
            secWage = ((((double) this.timestamp.getSec() / 60) / 60) * this.hourlyWage);
            this.totalWage = (hourWage + minWage + secWage);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        }
    }

    /**
     * This method will first call setTotalWage() to initialize the variable totalWage, and then return it.
     * @return totalWage
     */
    public double getTotalWage() {
        setTotalWage();
        return totalWage;
    }

    /**
     *  Adds the total wage calculated to the cumulative sum of the wage owed for each Employee.
     * @param totalWage
     */
    public void addTotalWage(double totalWage) {
        this.totalWage += totalWage;
    }
}
