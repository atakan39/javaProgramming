package day08_IfStatements;

public class SchoolType {
    public static void main(String[] args) {

        byte gradeLevel = 9;

        boolean type1 = 1 <= gradeLevel && gradeLevel <=5;
        boolean type2 = 6 <= gradeLevel && gradeLevel <=8;
        boolean type3 = 9 <= gradeLevel && gradeLevel <=12;
        boolean type4 = 13 <= gradeLevel && gradeLevel <=16;
        boolean type5 = 17 <= gradeLevel && gradeLevel <=18;

        if(type1) {
            System.out.println("Elementary school");
        }
        if(type2) {
            System.out.println("Middle school");
        }
        if(type3) {
            System.out.println("High school");
        }
        if(type4) {
            System.out.println("College");
        }
        if(type5) {
            System.out.println("Grad School");
        }









    }

}
/*
2.  Given a number(byte) grade level determine and print which school type someone is in.
 grade level and types are:
        1-5: Elementary school
        6-8: Middle school
        9-12: High school
        13-16: College
        17-18: Grad School

        Assume that the given number is 1 ~ 18
 */

