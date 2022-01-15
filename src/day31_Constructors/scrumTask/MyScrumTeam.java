package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
       // 3 testers objects

        Tester tester1=new Tester("atakan",1,"SDET",110000);
        Tester tester2=new Tester("emre",2,"QA",142000);
        Tester tester3=new Tester("sidar",3,"SE",135000);
        Tester tester4=new Tester("murat",8,"SDET",115000);

        Tester testers[]={tester2,tester3,tester4};


        // 4 developer objects
        Developer developer1=new Developer("ali",4,"Java Developer",125000);
        Developer developer2=new Developer("mehmet",5,"Java Master",185000);
        Developer developer3=new Developer("omer",6,"Software Developer",135000);
        Developer developer4=new Developer("ozgur",7,"Senior Developer",200000);

        Developer[]developers={developer2,developer3,developer4};

        //1 ScrumTeam Object
        ScrumTeam scrum= new ScrumTeam("Nigara","Huseyin","Neira",14);
        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("___________-Developers--____________");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name + " : "+ eachDeveloper.salary);
        }

        System.out.println("__________-Testers--_______________");

        for (Tester eachTester : scrum.testersList) {

            System.out.println(eachTester.name+" : "+ eachTester.salary);
        }

        System.out.println("__---------________------_______");

        scrum.removeTester( 2 );
        scrum.removeDeveloper( 6 );

        System.out.println(scrum);
    }
}
/*
create a class called MyScrumTeam:
                        1. create an array of Testers and add the testers from your group
                        2. create an array of developers add the developers from your group
                        3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */