

public class Employee {
    private String fName;
    private String lName;
    private String employeeId;
    private double hourlyPay;

    public Employee(String fName, String lName, String employeeId, int hourlyPay) {
        this.fName = fName;
        this.lName = lName;
        this.employeeId = employeeId;
        this.hourlyPay = hourlyPay;
    }

    public double computePay(int hours) throws TooManyHoursWorkedException {

        if (hours < 0) {
            throw new NumberFormatException("Your input hours is invalid or negative");

            }

        if (hours > 40) {
                throw new TooManyHoursWorkedException("Your input hours is invalid or more than 40");
            }

        return hours * getHourlyPay();
    }
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
