package day44_Abstractions.animalTask;

public class Parrot extends Animal{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Parrot eats chocolate");
    }

}
