
public class PartTimeHourly extends Employee {
    private double baseHourlyPay;

    public PartTimeHourly() {

    }
    public PartTimeHourly(String firstName, String lastName, Address address, int id, double baseHourlyPay) {
        super(firstName, lastName, address, id);
        this.baseHourlyPay = baseHourlyPay;
    }

    public double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    public void setBaseHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return "Part time employee: " + super.toString() + " Hourly basePay: " + getBaseHourlyPay();
    }
    public boolean introduce(boolean flag){
        System.out.println(this.toString());
        if (flag == true){
            System.out.println("Your SSN is " + getSsn());
        }else
            System.out.println("SSN is Not Available for Security Purposes.");
        return flag;
    }
    public double computePay(double hours){
        double computePay = 0;
        if(hours > 40){
            System.out.println("Your work hours exceeded");
            return -1;
        } else
            computePay = baseHourlyPay * hours;
        return computePay;
    }
}
