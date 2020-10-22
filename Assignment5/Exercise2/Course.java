
import java.util.LinkedList;

public class Course extends LinkedList<Course> {
    private String courseName;
    private String courseDescription;
    private String department;
    private String timeStart;
    private String weekDay;

    public Course(String courseName, String courseDescription, String department, String timeStart, String weekDay) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.timeStart = timeStart;
        this.weekDay = weekDay;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
}
