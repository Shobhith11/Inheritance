package CollectionsExample;


import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

    static ConcurrentHashMap<String, String> courses = new ConcurrentHashMap<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        courses.put("Kubenetes","4.8");
    }
    public static void main(String[] args) throws InterruptedException {

        ArraySetProblem array = new ArraySetProblem();
        array.start();

        courses.put("Java","5.0");
        courses.put("Python","4.8");
        courses.put("AWS","4.7");
        courses.put("Docker","4.7");

        Iterator<String> iterator = courses.keySet().iterator();

        while(iterator.hasNext()) {
            Thread.sleep(2000);
            String course = iterator.next();
            System.out.println(courses.get(course));

        }
        System.out.println(courses);

    }
}
