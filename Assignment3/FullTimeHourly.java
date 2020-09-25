
public class FullTimeHourly extends FullTimeEmployee {
    private double overtimePay;

    public FullTimeHourly() {

    }

    public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtimePay) {
        super(firstName, lastName, address, id, basePay);
        this.overtimePay = overtimePay;
    }

    public double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    @Override
    public String toString() {
        return "Full time Employee(Hour): " + super.toString() + " Your overTime Pay: " + getOvertimePay();
    }

    public boolean introduce(boolean flag){
        System.out.println(this.toString());
        if (flag == true){
            System.out.println("Your SSN is " + getSsn());
        }else
            System.out.println("SSN is Not Available for Security Purposes.");
        return flag;
    }

    public double computePay(int hours) {
        double computePay = 0.0;
        if (hours > 40) {
            double overtime = hours - 40;
            computePay = 40 * getBasePay() + overtime * getOvertimePay();
        } else {
            computePay = hours * getBasePay();
        }
        return computePay;
    }
}
