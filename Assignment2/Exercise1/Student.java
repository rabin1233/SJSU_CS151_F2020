

public class Student {
    private String fname;
    private String lname;
    private int age;
    private float gpa;
    private String major;
    private String department;

    public Student(String fname, String lname, int age, float gpa, String major, String department) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }


    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public class Course{
        void printSchedule(){
            if (major.equals("Computer Science")){
                System.out.println("CS 151 Tue/Thur 6:00 -7.15");
            }else
            {
                System.out.println("NotFound");
            }

        }


    }
}
