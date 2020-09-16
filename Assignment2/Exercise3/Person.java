
public class Person {
    private String fName;
    private String lName;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private double weight;

    public Person(String fName, String lName, int age, String ssn, String address, String gender, double weight) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                ", Address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void introduce(){
        System.out.println(fName +" "+lName + " "+ age + " " + ssn + " "+ address + " " + gender+ " "+ weight);

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
