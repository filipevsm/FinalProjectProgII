package main;

/**
 *<p> I am testing javadocs HTML tags </p>
 */
public class Employee {
    private int employeeNumber;
    private String firstName, lastName;
    private double hourlyWage;
    private TimeStamp timestamp = new TimeStamp(0,0,0);
    private double totalWage;

    /**
     * This is the constructor for Employee, which will be intialized for each employee read.
     * @param employeeNumber
     * @param lastName
     * @param firstName
     * @param hourlyWage
     */
    public Employee(int employeeNumber, String lastName, String firstName, double hourlyWage) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
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
    /**
     *
     *  Calculates the total wage of the employee based on total hours, minutes and seconds worked.
     *  @see EmployeeTotalWageCompare.java
     */
    public void setTotalWage() {
        double hourWage, minWage, secWage;
        hourWage = (this.timestamp.getHour() * this.hourlyWage);
        minWage = (((double) this.timestamp.getMin() / 60) * this.hourlyWage);
        secWage = ((((double) this.timestamp.getSec() / 60) / 60) * this.hourlyWage);
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
