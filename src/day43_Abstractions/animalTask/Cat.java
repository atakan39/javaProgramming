package day43_Abstractions.animalTask;

public class Cat extends Animal{
    public Cat(  String breed, char gender, String size, int age, String color) {
        super("Cat", breed, gender, size, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats cat food");
    }

    public void scratch(){
        System.out.println(getName()+ " scratches");
    }



}
