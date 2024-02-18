package Polymorphism;

public class MACBookAir extends MACBook{

    @Override
    public void Start() {
        System.out.println("Inside the MacBookAir start");
    }

    @Override
    public
    void shutdown() {

        System.out.println("Inside the MacBookAir shutdown");
    }
}
