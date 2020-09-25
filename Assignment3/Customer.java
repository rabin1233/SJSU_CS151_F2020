
public class Customer extends Person {
    private int customerID;
    private String paymentPreference;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Address address, int customerID, String paymentPreference) {
        super(firstName, lastName, address);
        this.customerID = customerID;
        this.paymentPreference = paymentPreference;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPaymentPreference() {
        return paymentPreference;
    }

    public void setPaymentPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

    @Override
    public String toString() {
        return "Customer: " + super.toString() + "Customer ID: " + getCustomerID();
    }
    public void introduce(){
        System.out.println(this.toString() );
    }
    public void makePayment(String paymentPreference){
        String pay = getPaymentPreference();
        System.out.println("Your preferred payment method is: "  + getPaymentPreference());
    }


}
