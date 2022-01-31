package day43_Abstractions.employeeTask;

public abstract class Employee extends Person {
    private final long employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, long employeeId, String jobTitle, double salary) {
        super(name, age, gender);
        this.employeeId=employeeId;
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public long getEmployeeId() {
        return employeeId;
    }


    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty()||jobTitle.isBlank()){
            System.err.println("invalid jobtitle");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary<=0){
            throw new RuntimeException("invalid salary"+salary);
        }
        this.salary = salary;
    }

    public abstract void work();


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", Age=" + getAge() +
                ", gender=" + getGender() +
                " employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
2. Create a sub class of Person named Employee:
            Extra variables:
                employeeId, jobTitle, salary

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                work()
                toString()

 */