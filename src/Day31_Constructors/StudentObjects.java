package Day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("Atakan",30,'M','B',39);

        Student student2=new Student("ali",35,'M','A',40);

        Student student3=new Student("mehmet",25,'M','A',41);
        Student student4=new Student("hulya",27,'F','F',42);
        Student student5=new Student("merve",32,'F','A',43);
        Student student6=new Student("ece",40,'F','C',44);


        Student students[]={student1,student2,student3,student4,student5,student6};


        ArrayList<Student>gradeAs=new ArrayList<>();
        ArrayList<Student>gradeBs=new ArrayList<>();
        ArrayList<Student>gradeCs=new ArrayList<>();
        ArrayList<Student>gradeDs=new ArrayList<>();
        ArrayList<Student>gradeFs=new ArrayList<>();

        for (Student student : students) {
            if(student.grade=='A'){
                gradeAs.add(student);
                System.out.println(student.name+" "+student.grade);
            }else if(student.grade=='B'){
                gradeBs.add(student);
                System.out.println(student.name+" "+student.grade);
            }else if(student.grade=='C'){
                gradeCs.add(student);
                System.out.println(student.name+" "+student.grade);
            }else if(student.grade=='D'){
                gradeDs.add(student);
                System.out.println(student.name+" "+student.grade);
            }else if(student.grade=='F'){
                gradeFs.add(student);
                System.out.println(student.name+" "+student.grade);
            }else{
                System.err.println(student.name+" has Invalid grade");
            }
        }

        System.out.println("total Students grade A : "+gradeAs.size()+
                           "\ntotal Students grade B : "+gradeBs.size()+
                           "\ntotal Students grade C : "+gradeCs.size()+
                           "\ntotal Students grade D : "+gradeDs.size()+
                           "\ntotal Students grade F : "+gradeFs.size()
                );



    }
}
