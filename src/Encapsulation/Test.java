package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setFirstName("Shobhith");
        c.setLastName("Manjunatha");
        c.setCreditCard("12345657");

        System.out.println("First Name: " + c.getFirstName());
        System.out.println("Last Name: " + c.getLastName());
        System.out.println("Credit Card No: " + c.getCreditCard());
    }
}
