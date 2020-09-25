
public abstract class Employee extends Person {
    private int id;
    private String educationLevel;
    private boolean directDeposit;

    public Employee(){

    }

    public Employee(String firstName, String lastName, Address address, int id) {
        super(firstName, lastName, address);
        this.id = id;
        this.educationLevel = educationLevel;
        this.directDeposit = directDeposit;
    }

    @Override
    public String toString() {
        return super.toString()  + "Employee ID: " +getId() + ", " ;
    }

    public void introduce(){
        System.out.println(this.toString());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean getDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }
}
