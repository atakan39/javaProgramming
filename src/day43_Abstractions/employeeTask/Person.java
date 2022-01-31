package day43_Abstractions.employeeTask;

public abstract class Person {
    private String name;
    private int Age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if(name.equals(name.isEmpty()||name.equals(name.isBlank()))){
            throw new RuntimeException("invalid name");
        }
        this.name = name;
    }
    public String getName() {

        return name;
    }

    public int getAge() {

        return Age;
    }

    public void setAge(int age) {
        if(age<=0 || age>150){
            throw new RuntimeException("invalid age"+age);
        }
        this.Age = age;
    }

    public char getGender() {

        return gender;
    }

    public void setGender(char gender) {
        if(gender!='F'&&gender!='M'){
            throw new RuntimeException("invalid gender"+gender);
        }
        this.gender = gender;
    }



    public abstract void sleep();

    public void eat(){
        System.out.println("eating");
    };

    public void drink(){
        System.out.println(name+" is drinking");
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
