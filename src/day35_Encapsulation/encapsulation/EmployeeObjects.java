package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1=new Employee("atakan",'k',-90,105000);

        employee1.setSalary(125000);
        System.out.println(employee1.getSalary());

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary( employee2.getSalary() + 15000 );

        System.out.println(employee1);
        System.out.println(employee2);






    }
}
