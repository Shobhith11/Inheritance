package CollectionsExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i=10; i<100; i = i + 10) {
            list.add(i);
        }

        System.out.println("List elements are:" + list);

        list.add(2, 100);

        System.out.println("After adding middle List elements are:" + list);

        list.set(3,200);
        System.out.println("List after replaced:" + list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.add(444);
        System.out.println("Second List:" + list2);

        list.addAll(4,list2);

        System.out.println("First List :" +list);

        if(list.contains(222)) {
            System.out.println("List has value");
        } else {
            System.out.println("List does not have the value.");
        }

        System.out.println("Elements in the list are:");
        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(3);
        System.out.println("list afte deletion:" +list);

    }
}
