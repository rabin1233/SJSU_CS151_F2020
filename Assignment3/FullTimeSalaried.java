
public class FullTimeSalaried extends FullTimeEmployee{
    public FullTimeSalaried() {
    }

    public FullTimeSalaried(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id, basePay);
    }

    @Override
    public String toString() {
        return "Full time Employee(Salary): " + super.toString();
    }
    public boolean introduce(boolean flag){
        System.out.println(this.toString());
        if (flag == true){
            System.out.println("Your SSN is " + getSsn());
        }else
            System.out.println("SSN is Not Available for Security Purposes.");
        return flag;
    }
    public double computePay(double weeks) {
    double computePay  = weeks * getBasePay() * 1/52 ;

    return computePay;
    }

}
