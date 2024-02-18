package Polymorphism;

public class CompileTimeBinding {
    void add(int a, int b) {
        int result = a + b;
        System.out.println("Result is :"+ result);
    }
    void add(float a, float b) {
        float result = a+b;
        System.out.println("Float result :" + result);

    }

    void add (int a, int b, int c) {
        int result = a+b+c;
        System.out.println("result three sum :" + result);
    }
    public static void main(String[] args) {
        CompileTimeBinding obj = new CompileTimeBinding();
        obj.add(10,30);
        obj.add(23f, 55f);
        obj.add(33,55,77);
    }

}
