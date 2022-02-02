package day43_Abstractions.animalTask;

public class Human extends Animal{
    public Human(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats anything");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" drinks wine");
    }

    public void speak(){
        System.out.println(getName()+" is speaking");
    }


}
