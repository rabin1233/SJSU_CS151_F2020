import java.util.*;

public class ListManipulator {
    public ListManipulator() {
    }

    private ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) {
        ArrayList<Integer> sort = new ArrayList<Integer>();
        if(ascending){
            Collections.sort(myLst);
            return sort;
        }
        else{
            Collections.sort(myLst,Collections.reverseOrder());
            return sort;
        }


    }

    private ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) {
        ArrayList<Integer> swapped = new ArrayList<Integer>();
        Integer min;
        Integer max;
        min = myLst.indexOf(Collections.min(myLst));
        max = myLst.indexOf(Collections.max(myLst));
        Collections.swap(myLst,min,max);
        swapped = myLst;
        return swapped;
    }

    private void table(ArrayList<Integer> myLst) {
        ArrayList<Integer> sorted = myLst;
        sort(sorted, true);
        HashMap<Integer, Integer> numOccurrence = new HashMap<>();
        for(int i = 0; i <myLst.size(); i++){
            if(!numOccurrence.containsKey(sorted.get(i)))
                numOccurrence.put(sorted.get(i), 1);
            else
                numOccurrence.put(sorted.get(i), numOccurrence.get(sorted.get(i)) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numOccurrence.entrySet())
        {
            System.out.println("Num: " + entry.getKey() + "\tNumber of Occurrences: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(12);
        list.add(2);
        list.add(55);
        list.add(55);
        list.add(55);
        list.add(26);
        list.add(27);
        list.add(7);

        ListManipulator checker = new ListManipulator();
        checker.table(list);

        System.out.println(" ");

        System.out.println(checker.swapLargestSmallest(list));
        System.out.println(" ");

        checker.sort(list,true);
        for(Integer i : list){
            System.out.println(i);
        }
    }

}

