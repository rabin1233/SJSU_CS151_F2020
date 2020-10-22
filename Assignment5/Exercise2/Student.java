
import java.util.*;

public class Student {
    private String fName;
    private String lName;
    private int age;
    private double gpa;
    private String Major;
    private String department;
    private LinkedList<Course> courses;

    public Student(String fName, String lName, int age, double gpa, String major, String department) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gpa = gpa;
        this.Major = major;
        this.department = department;
        courses = new LinkedList<>();
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
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void sortCourses(String parameter, boolean ascending) {
        if (ascending) {
            if (parameter.equals("courseName")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course c1, Course c2) {
                        return c1.getCourseName().compareTo(c2.getCourseName());
                    }
                });
            } else if (parameter.equals("courseDescription")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course c1, Course c2) {
                        return c1.getCourseDescription().compareTo(c2.getCourseDescription());
                    }
                });

            } else if (parameter.equals("department")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getDepartment().compareTo(o2.getDepartment());
                    }
                });
            } else if (parameter.equals("timeStart")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getTimeStart().compareTo(o2.getTimeStart());
                    }
                });
            } else if (parameter.equals("weekDay")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o1.getWeekDay().compareTo(o2.getWeekDay());
                    }
                });
            }
            /*else
                System.out.println("Invalid sorting attribute: " + parameter);*/
        } else {
            if (parameter.equals("courseName")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course c1, Course c2) {
                        return c2.getCourseName().compareTo(c1.getCourseName());
                    }
                });
            }else if (parameter.equals("courseDescription")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course c1, Course c2) {
                        return c2.getCourseDescription().compareTo(c1.getCourseDescription());
                    }
                });

            } else if (parameter.equals("department")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o2.getDepartment().compareTo(o1.getDepartment());
                    }
                });
            } else if (parameter.equals("timeStart")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o2.getTimeStart().compareTo(o1.getTimeStart());
                    }
                });
            } else if (parameter.equals("weekDay")) {
                Collections.sort(courses, new Comparator<Course>() {
                    @Override
                    public int compare(Course o1, Course o2) {
                        return o2.getWeekDay().compareTo(o1.getWeekDay());
                    }
                });
            }
            else
                System.out.println("Invalid sorting attribute: " + parameter);
        }
    }
}