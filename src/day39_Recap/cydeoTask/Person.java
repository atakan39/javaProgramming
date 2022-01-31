package day39_Recap.cydeoTask;

public class Person {

    private String name;
    private int Age;
    private char gender;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(name.equals(name.isEmpty()||name.equals(name.isBlank()))){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {

        return Age;
    }

    public void setAge(int age) {
        if(age<=0 || age>150){
            System.err.println("invalid age");
            System.exit(1);
        }
        this.Age = age;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if(gender!='F'&&gender!='M'){
            System.err.println("invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println("eating");
    };

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor to set all the fields

            Methods:
                eat()
                drink()
                sleep()
                toString()

 */