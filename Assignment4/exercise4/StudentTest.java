

public class StudentTest {
    public static void main(String[] args) {
        Course course1 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science Department", course1);
        Student student2 = null;

        try {
            student2 = (Student) student1.clone();
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println(e);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }

        student1.printInfo();
        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        student2.printInfo();

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //checking deep clone
        student2.setCourse("CS154","Computer Architecture", "Computer Science", "4.00 pm", "Mon");
        student2.printInfo();
    }
}
