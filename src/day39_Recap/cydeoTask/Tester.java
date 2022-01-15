package day39_Recap.cydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, long employeeId, String jobTitle,double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is Testing");
    }

    public void creatTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating Ticket");
    }

}
/*
3. Create a sub class of Employee named Tester

            Override the work method

            Extra methods:
                createTicket()
 */