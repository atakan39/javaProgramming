package day43_Abstractions.employeeTask;

public final class Developer extends Employee{
    public Developer(String name, int age, char gender, long employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is writing code");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" sleeps 5 hours");
    }
}
