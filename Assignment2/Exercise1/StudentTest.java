

public class StudentTest {

    public static void main(String[] args) {
        Student outerobj = new Student("John", "Smith", 20, 3.6f, "Computer Science", "Computer Science");
        Student.Course innerobj = outerobj.new Course();
        System.out.println("The Schedule is: ");
        innerobj.printSchedule();


    }
}
