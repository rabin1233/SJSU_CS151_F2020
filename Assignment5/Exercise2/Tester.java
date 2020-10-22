public class Tester {
    public static void main(String[] args) {
        Student ram = new Student("rabin", "gurung", 32, 3.5, "CompSci","Science");
        Course course1 = new Course("CS151", "OOD", "CompSci","12:00","Tuesday");
        Course course2 = new Course("CS152", "ProgrammingParadigm", "CompSci","11:00","Wednesday");
        Course course3 = new Course("CS147", "ComputerArchitecture", "CompSci","10:00","Thursday");
        Course course4 = new Course("CS149", "OperatingSystem", "CompSci","13:00","Monday");
        Course course5 = new Course("CS157", "DataBase", "CompSci","14:00","Sunday");

        ram.addCourse(course1);
        ram.addCourse(course2);
        ram.addCourse(course3);
        ram.addCourse(course4);
        ram.addCourse(course5);


        //will work similarly for other parameter as courseName courseDescription etc and false for descending
        ram.sortCourses("weekDay",true);
        for (Course c : ram.getCourses())
            System.out.println(c.getWeekDay());
    }
}
