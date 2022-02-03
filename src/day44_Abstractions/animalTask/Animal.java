package day44_Abstractions.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;

    static {
        canBreath=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        if(breed.isEmpty()||breed.isBlank()){
            throw new RuntimeException("please provide breed !");
        }
        this.breed = breed;

        if(gender!='F' && gender!='M'){
            throw new RuntimeException("invalid gender! valid genders are F / M");
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        if(color.isEmpty()||color.isBlank()){
            throw new RuntimeException("please provide color !");
        }
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()){
            throw new RuntimeException("please provide name !");
        }
        this.name = name;
    }

    public void setAge(int age) {

        if(age<=0){
            throw new RuntimeException("invalid age!");
        }
        this.age = age;
    }

    public void setSize(String size) {
        if(size.isEmpty()||size.isBlank()){
            throw new RuntimeException("please provide size !");
        }
        this.size = size;;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void eat();

    public final void drink(){
        System.out.println(name+" is drinking water");
    }

}
