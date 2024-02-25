package CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Z");
        list.add("A");
        list.add("X");
        list.add("B");

        System.out.println("Before sorting: "+ list);

        Collections.sort(list);//Sorting the ascending order.
        //Collections.sort(list, new MyComparator());//Sorting Descending order

        System.out.println("After Sorting:" + list);

        int result = Collections.binarySearch(list, "C");

        System.out.println("Index is :" + result);

    }
}
