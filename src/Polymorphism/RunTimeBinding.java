package Polymorphism;

public class RunTimeBinding {
    public static void main(String[] args) {
        AppleLaptop m1 = new MACBookPro();
        AppleLaptop m2 = new MACBookAir();

        m1.Start();
        m1.shutdown();

        MACBookPro m3 = (MACBookPro) m1;

        m3.Start();
        m3.shutdown();

        m2.Start();
        m2.shutdown();

        MACBookAir m4 = (MACBookAir)  m2;
    }
}
