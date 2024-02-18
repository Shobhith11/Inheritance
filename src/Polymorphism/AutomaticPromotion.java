package Polymorphism;

public class AutomaticPromotion {

    public void print(int i) {
        System.out.println("Integer Version: " + i);
    }

    public void print(float i) {
        System.out.println("float Version: " + i);
    }
    /*public void print(String s) {
        System.out.println("String Version");
    }*/

    public void print(Object obj) {
        System.out.println("Object Version");
    }
     public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print(123);
        ap.print(10.445f);
        ap.print("Hello");

    }
}
