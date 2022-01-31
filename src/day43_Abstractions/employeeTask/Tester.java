package day43_Abstractions.employeeTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, long employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is fixing bugs");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle()+" "+getName()+" sleeps 8 hours");
    }

    public void  bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }

}
