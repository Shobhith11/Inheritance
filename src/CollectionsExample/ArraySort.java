package CollectionsExample;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {

        int[] a = {40, 10, 15, 7};

        System.out.println("Before Sort");
        for(int ele:a) {
            System.out.println(ele);
        }

        Arrays.sort(a);

        System.out.println("After Sor");
        for(int ele : a) {
            System.out.println(ele);
        }

        String[] s = {"V", "A", "Z", "P"};

        //Arrays.sort(s);

        Arrays.sort(s, new MyComparator());

        for(String str : s) {
            System.out.print(str);
        }

        List<String> list = Arrays.asList(s);
        s[1] = "Y";

        System.out.println(list);
    }
}
