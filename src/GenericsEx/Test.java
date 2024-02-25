package GenericsEx;

public class Test {
    public static void main(String[] args) {
        MyGenericClass<String> s = new MyGenericClass<>("Janani");
        s.displayObjectDetails();
        System.out.println(s.getObject());

        MyGenericClass<Integer> i = new MyGenericClass<>(123);
        i.displayObjectDetails();
        System.out.println(i.getObject());

        MyGenericClass<Double> d = new MyGenericClass<>(12.45);
        d.displayObjectDetails();
        System.out.println(d.getObject());
    }
}
