package Day31_Constructors.scrumTask;

public class Tester {

    public String name;
    public long employeeID;
    public String jobTitle;
    public double salary;

    public Tester(String name, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary= $" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(jobTitle+" "+name+"is smoke testing");
    };

    public void creatingTicket(){
        System.out.println(name+"is creating ticket");
    }
    public void dailyStandUp(){

    };


}
/*
Scrum Task:
    create a class called Tester
            Attributes:
                name, employeeID, JobTitle, Salary

            Add A constructor that can set all the fields

            Actions:
               smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */