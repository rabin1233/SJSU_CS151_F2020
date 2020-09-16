
public class Employee extends Person {
    private int employeeId;
    private String status;
    private double basePay;

    public Employee(String fName, String lName, int age, String ssn, String address, String gender, double weight, int employeeId, String status, double basePay) {
        super(fName, lName, age, ssn, address, gender, weight);
        this.employeeId = employeeId;
        this.status = status;
        this.basePay = basePay;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
    public void introduceEmployee(){
        super.introduce();
        System.out.println(employeeId + " "+ status + " " + basePay);
    }

    public double calculatePay(double unitsworked){
        double pay  = 0.0;
        if(status.equalsIgnoreCase("contractor") || status.equalsIgnoreCase("part time")){
            pay = unitsworked * this.basePay;
            System.out.println("Total salary of" + " " +  getfName()+ " " + getlName() + " is " + pay);
        }
        else
        {

            pay = this.basePay* unitsworked * 1/52;
            System.out.println("Total Salary of" + " " +  getfName()+ " " + getlName() + " is " + pay);
        }

        return pay;
    }

}
