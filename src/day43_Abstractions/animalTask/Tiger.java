package day43_Abstractions.animalTask;

public final class Tiger extends Animal{
    public Tiger( String breed, char gender, String size, int age, String color) {
        super("tiger", breed, gender, size, age, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats dear");
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }


}
