package day31_Constructors.scrumTask;

public class Developer {
    public String name;
    public long employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", Salary= $" + salary +
                '}';
    }

   public void coding(){};

    public void unitTesting(){};

    public void fixingBug(){};

}
/*
 create a class called Developer
              Attributes:
                name, employeeID, JobTitle, Salary

              Add A constructor that can set all the fileds

              Actions:
                coding(), unitTesting(), fixingBug(), toString()

 */