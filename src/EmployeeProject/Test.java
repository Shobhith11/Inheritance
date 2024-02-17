package EmployeeProject;

public class Test {
    public static void main(String[] args) {
        String[] projects =new String[] {"Flight Reservation","Check in"};
        Manager manager = new Manager(1,"John","Travel",10000,projects);
        System.out.println("Manager Id: "+manager.id);
        System.out.println("Manager name: "+manager.name);
        System.out.println("Manager department :"+manager.dept);
        System.out.println("Manager Salary:"+manager.salary);
        manager.work();

        System.out.println("==================================");

        Developer developer = new Developer(2,"Jennifer","Travel",120000,"Full stack Java Developer with AWS");
        System.out.println("Develope Id: "+developer.id);
        System.out.println("Developer Name: "+developer.name);
        System.out.println("Developer department:"+developer.dept);
        System.out.println("Developer Salary: "+developer.salary);
        developer.work();

        System.out.println("==================================");

        String[] tool =new String[] {"Selenium","Jira"};
        Tester tester = new Tester(3,"Johny","Travel",133000,tool);
        System.out.println("Tester Id: "+tester.id);
        System.out.println("Tester Name: "+tester.name);
        System.out.println("Tester department: "+tester.dept);
        System.out.println("Tester Salary: "+tester.salary);
        tester.work();
    }
}
