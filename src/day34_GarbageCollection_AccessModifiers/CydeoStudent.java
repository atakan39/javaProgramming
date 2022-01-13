package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String name) {
        this.studentName = name;
    }

    static { // also  we use static block if we need mmore than one step to initalized to variable..
        schoolName="Cydeo School";
    }

}

class CydeoStudentObjects{
    public static void main(String[] args) {

        CydeoStudent student1= new CydeoStudent("Jimmy");
        CydeoStudent student2= new CydeoStudent("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
