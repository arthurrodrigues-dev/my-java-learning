package collections.Set.TreeSet.Practice;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Arthur", 1);
        Employee e2 = new Employee("Bruno", 30);
        Employee e3 = new Employee("Helena", 20);
        Employee e4 = new Employee("Miguel", 5);
        Employee e5 = new Employee("Francisco", 15);
        Employee e6 = new Employee("Laura", 25);

        TreeSet<Employee> ts = new TreeSet<>();

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        ts.add(e6);

        System.out.println(ts);
    }
}
