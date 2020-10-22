
import java.util.*;

public class PersonTest {

    public static void sort(ArrayList<Person> personList, String parameter, boolean ascending) {
        if(parameter.equals("fName")) {
            if(ascending) {
                personList.sort(Comparator.comparing(Person:: getfName));
            }
            else {
                personList.sort(Comparator.comparing(Person:: getfName).reversed());
            }

        }

        else if(parameter.equals("lName")) {
            if(ascending) {
                personList.sort(Comparator.comparing(Person:: getlNamelength));
            }
            else {
                personList.sort(Comparator.comparing(Person:: getlNamelength).reversed());
            }
        }

        else if(parameter.equals("age")) {
            if(ascending) {
                personList.sort(Comparator.comparing(Person:: getAge));
            }
            else {
                personList.sort(Comparator.comparing(Person:: getAge).reversed());
            }
        }
    }
    public static void main(String[] args) {


        ArrayList<Person> person = new ArrayList<Person>();

        person.add(new Person("Joe","Smith", 40));
        person.add(new Person("Amy", "Gold", 32));
        person.add(new Person("Tony","Stork", 21));
        person.add(new Person("Sean","Irish", 24));
        person.add(new Person("Tina","Brock", 28));
        person.add(new Person("Lenny","Hep", 18));

        System.out.println("----------------------------------------");
        System.out.println("Ascending order of First Name: ");
        sort(person, "fName", true);
        for (Person c : person)
            System.out.println(c.getfName());
        System.out.println("----------------------------------------");
        System.out.println("Descending order of First Name:   ");
        sort(person, "fName", false);
        for (Person c : person)
            System.out.println(c.getfName());
        System.out.println("----------------------------------------");
        System.out.println("Ascending order of Length of Last Name:   ");

        sort(person, "lName", true);
        for (Person c : person)
            System.out.println(c.getlName());
        System.out.println("----------------------------------------");
        System.out.println("Descending order of Length of Last Name:   ");

        sort(person, "lName", false);
        for (Person c : person)
            System.out.println(c.getlName());
        System.out.println("----------------------------------------");
        System.out.println("Descending order of Age:   ");
        sort(person, "age", true);
        for (Person c : person)
            System.out.println(c.getAge());
        System.out.println("----------------------------------------");
        System.out.println("Descending order of Age:  ");
        sort(person, "lName", false);
        for (Person c : person)
            System.out.println(c.getAge());


    }

}
