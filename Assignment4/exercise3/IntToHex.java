
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the Integer Value :");
            Integer number = reader.nextInt();
            System.out.println("Your Hex Number is : " + Integer.toHexString(number));
        }
        catch (InputMismatchException e){
            System.out.println(e);
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }


}
