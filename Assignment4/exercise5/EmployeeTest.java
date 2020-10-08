

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Smith", "101", 35);
        try {
            System.out.println("Your total pay is: " + emp1.computePay(40));
            System.out.println("Your total pay is: " + emp1.computePay(23));
            System.out.println("Your total pay is: " + emp1.computePay(1));
            System.out.println("Your total pay is: " + emp1.computePay(0));
            System.out.println("Your total pay is: " + emp1.computePay(-5));

            }catch(NumberFormatException | TooManyHoursWorkedException e){
                e.printStackTrace();
                System.out.println(e);
            }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }


        try{
            System.out.println("Your total pay is: " + emp1.computePay(45));
        }catch(NumberFormatException | TooManyHoursWorkedException e){
            e.printStackTrace();
            System.out.println(e);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);
        }


    }
}
