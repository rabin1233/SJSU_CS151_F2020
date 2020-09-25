

public abstract class FullTimeEmployee  extends Employee{
    private double basePay;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay) {
        super(firstName, lastName, address, id);
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return super.toString()+   " Base Pay: " + getBasePay();
    }
    public void introduce(){
        System.out.println(this.toString());
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

}
