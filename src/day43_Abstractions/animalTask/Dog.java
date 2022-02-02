package day43_Abstractions.animalTask;

public class Dog extends Animal{
    public Dog( String breed, char gender, String size, int age, String color) {
        super("Dog", breed, gender, size, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }
}
