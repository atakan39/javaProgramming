package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("burak",29,'M',1,"java Developer",140000);

        Tester tester = new Tester("Korkmaz",33,'M',3,"Sdet",123000);

        Teacher teacher = new Teacher("sidar",36,'F',2,"Math teacher",100000);

        Student student1=new Student("emre",30,'M',39,"Java");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student1);

        developer.work();
        tester.work();
        teacher.work();

        developer.eat();
        developer.sleep();
        developer.drink();
        developer.fixingBugs();

        System.out.println("Atakan");


    }
}
