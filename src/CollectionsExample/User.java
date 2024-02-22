package CollectionsExample;

public class User {
    public String toString() {

        return "User";

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize called.");
    }
}
