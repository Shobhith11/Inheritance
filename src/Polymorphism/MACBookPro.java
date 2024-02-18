package Polymorphism;

public class MACBookPro extends MACBook{

    @Override
    public void Start() {
        System.out.println("MacBookPro start method");
    }
    @Override
    public void shutdown() {

        System.out.println("MacBookPro shutdown method");
    }
}
