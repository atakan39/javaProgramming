package day39_Recap.cydeoTask;

public class Student extends Person{

    private long studentId;
    private String fieldOfStudy;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {

        if(studentId<=0){
            System.err.println("Invalid student id");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy.isEmpty()||fieldOfStudy.isBlank()){
            System.err.println("Invalid student field");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String name, int age, char gender, long studentId, String fieldOfStudy) {
        super(name, age, gender);
       setStudentId(studentId);
       setFieldOfStudy(fieldOfStudy);
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }
    @Override
    public String toString() {
        return super.toString()+" Student{" +
                "studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
/*
6. Create a sub class of Person named Student

            Extra variables:
                studentId, fieldOfStudy

            Encapsulate all the fields

            Add a constructor to set all the fields

            Encapsulate all the fields

            Methods:
                study()
 */