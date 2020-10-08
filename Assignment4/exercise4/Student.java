

public class Student implements Cloneable{
    private String fName;
    private String lName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    private Course course;

    public Student(String fName, String lName, int age, double gpa, String major, String department, Course course) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }

    public void printInfo(){
        System.out.println("Details of the Student: ");
        System.out.println("First Name: "+ getfName()+ ", Last Name: " + getlName() + ", Age: " + getAge()  + ", GPA: "+ getGpa() + ", Major: " +getMajor() + ", Department: " + getDepartment());
        System.out.println(" ");
        System.out.println("Details of the Student's Course: ");
        System.out.println("CourseName: " + getCourse().getCourseName() + ", Course Description: " + getCourse().getCourseDescription()+ ", Department:  " + getCourse().getDepartment() + ", Start Time: "+ getCourse().getTimeStart() + ", Weekday: "+ getCourse().getWeekDay() );
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
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

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(String courseName, String courseDescription, String department, String timeStart, String weekDay) {
        this.course.setCourseName(courseName);
        this.course.setCourseDescription(courseDescription);
        this.course.setDepartment(department);
        this.course.setTimeStart(timeStart);
        this.course.setWeekDay(weekDay);
    }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            Student student = (Student) super.clone();
            student.course = (Course) course.clone();

            return student;
        }
}