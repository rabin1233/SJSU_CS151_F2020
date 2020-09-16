
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Joe","Smith", 25,"1233456", "12344", "Male", 60, 101, "contractor", 60 );
        emp1.calculatePay(30);
        Employee emp2 = new Employee("Lisa","Gray", 30,"3345666", "Norvellst", "Female", 65, 151, "full time", 110000 );
        emp2.calculatePay(2);
        Employee emp3 = new Employee("Timothy","Briggs", 35,"3345678", "lincolnAve", "Female", 75, 131, "full time", 80000 );
        emp3.calculatePay(4);
        Employee emp4 = new Employee("George","Wallace", 35,"3656676", "SanPabloAve", "Male", 85, 121, "part time", 20 );
        emp4.calculatePay(25);
        Employee emp5 = new Employee("Amy","Student", 19,"1245678", "ChiquitaAve", "Female", 75, 111, "contractor", 45);
        emp5.calculatePay(45);
    }
}
