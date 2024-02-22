package SortingObject;

import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Employee> set = new TreeSet<>(new EmployeeNameComparator());

        set.add(new Employee(100, "Tod"));
        set.add(new Employee(200, "John"));
        set.add(new Employee(400, "Jocky"));
        set.add(new Employee(300, "fon"));

        for(Employee emp : set) {
            System.out.println(emp.id);
            System.out.println(emp.name);
        }
    }
}
