package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {


        Person p1 = new Person();

        p1.getAge();
        p1.setName("atakan");
        p1.setAge(30);

        System.out.println(p1.getName()+ " : "+p1.getAge());

    }
}