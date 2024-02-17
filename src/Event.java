public class Event extends EMBase {
    public String description;
    public  String startTime;
    public String endTime;
    public Boolean started;

    public Event(long id, String name,String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    void display() {
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("Description :"+description);
    }
}
