package Assignment6;

import java.util.ArrayList;

public class MethodTest {
    public static <T> void count(ArrayList<T> list){
        System.out.println("List has size: " + list.size());
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        stringList.add("H");
        stringList.add("E");
        stringList.add("L");
        stringList.add("L");
        stringList.add("0");

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        doubleList.add(1.0);
        doubleList.add(2.0);
        doubleList.add(3.0);
        doubleList.add(4.0);
        doubleList.add(5.0);
        doubleList.add(6.0);
        doubleList.add(7.0);
        doubleList.add(8.0);

        count(stringList);
        count(intList);
        count(doubleList);
    }
}
