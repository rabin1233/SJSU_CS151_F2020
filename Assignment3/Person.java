
public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;

    // Address address = new  Address(int, String, String, String, String state)

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return " " + getFirstName() + " " + getLastName()+ ", "+ getAddress() + ", ";
    }


    public void introduce() {
            System.out.println(getFirstName() + " " + getLastName()  +  " Age: " + getAge() + " SSN: " + getSsn() + " Address:  " + getAddress());
    }

        public String getFirstName () {
            return firstName;
        }

        public void setFirstName (String firstName){
            this.firstName = firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public void setLastName (String lastName){
            this.lastName = lastName;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

        public String getSsn () {
            return ssn;
        }

        public void setSsn (String ssn){
            this.ssn = ssn;
        }

        public Address getAddress () {
            return address;
        }

        public void setAddress (Address address){
            this.address = address;
        }

}
