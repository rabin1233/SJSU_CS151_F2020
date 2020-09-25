
public class Contractor extends Employee {
    private double basePay;

    public Contractor() {
    }

    public Contractor(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id);
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "Contractor: " + super.toString() + " Base Pay " + getBasePay();
    }
    public boolean introduce(boolean flag){
        System.out.println(this.toString());
        if (flag == true){
            System.out.println("Your SSN: " + getSsn());
        }else
            System.out.println("SSN is Not Available for Security Purposes.");
        return flag;
    }
    public double computePay(double hour){
        double computePay = basePay * hour;
        return computePay;
    }

}
