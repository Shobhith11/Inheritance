package CollectionsExample;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new StringComparator());

        set.add("virat_2222");
        set.add("Jananimathedgdg");
        set.add("SeethaLakshmi");
        set.add("Kohli");
        set.add("Shobhith");

        for(String str : set){
            System.out.println(str);
        }
    }
}
