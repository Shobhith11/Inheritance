package Polymorphism;

public class Overriding {

    public static void main(String[] args) {
        Parent.doSomething();
        Child.doSomething();

        Parent p = new Parent();
        System.out.println(p.s);

        Child c = new Child();
        System.out.println(c.s);

        Parent c1 = new Child();//overriding concept does not apply to the variables
        System.out.println(c1.s);
    }
}
