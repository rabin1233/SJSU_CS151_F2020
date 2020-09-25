

public class Executive extends Employee {
    private Double yearlyBonus;
    private Double yearlyCompensation;

    public Executive() {

    }

    public Executive(String firstName, String lastName, Address address, int id, Double yearlyBonus, Double yearlyCompensation) {
        super(firstName, lastName, address,id);
        this.yearlyBonus = yearlyBonus;
        this.yearlyCompensation = yearlyCompensation;
    }

    public Double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(Double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public String toString() {
        return "Executive employee: " +super.toString()+ " Bonus is " + getYearlyBonus();
    }
    public boolean introduce(boolean flag){
        System.out.println(this.toString());
        if (flag == true){
            System.out.println("Your SSN is " + getSsn());
        }else
            System.out.println("SSN is Not Available for Security Purposes.");
        return flag;
    }
    public double computePay(){

       double computePay = yearlyBonus + yearlyCompensation;
        return computePay;
    }

}
