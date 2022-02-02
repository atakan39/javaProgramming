package day43_Abstractions.animalTask;

public abstract class Animal {
    private final String name;
    private final String breed;
    private final char gender;
    private String size;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String size) {
        if(size.isEmpty()||size.isBlank()){
            throw new RuntimeException("please provide size !");
        }
        this.size = size;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new RuntimeException("invalid age!");
        }
        this.age = age;
    }

    public void setColor(String color) {
        if(color.isEmpty() || color.isBlank()){
            throw new RuntimeException("please provide color !");
        }
        this.color = color;
    }

    public Animal(String name, String breed, char gender, String size, int age, String color) {
        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("please provide name !");
        }
        this.name = name;

        if(breed.isEmpty() || breed.isBlank()){
            throw new RuntimeException("please provide breed !");
        }
        this.breed = breed;

        if(gender!='F' && gender!='M'){
            throw new RuntimeException("invalid gender! valid genders are F / M");
        }

        this.gender = gender;
        setSize(size);
        setAge(age);
        setColor(color);
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void eat();

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public final void sleep(){
        System.out.println(name+" is sleeping");
    }






}
// eat() different each sub,

//sleep() same for all ,

//drink() same for all,