package CollectionsExample;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> courses = new CopyOnWriteArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("AWS");
        courses.add("Docker");

        Iterator<String> iterator = courses.iterator();

        while(iterator.hasNext()) {
            String course = iterator.next();
            System.out.println(course);
            if(course.equals("Java")) {
                courses.remove(course);
                courses.add("Node");
            }

        }
        System.out.println(courses);

    }
}
