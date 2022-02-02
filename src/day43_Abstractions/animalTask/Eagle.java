package day43_Abstractions.animalTask;

public class Eagle extends Animal{

    private String Country;
    public final static boolean HasWings=true;

    public Eagle( String breed, char gender, String size, int age, String color) {
        super("eagle", breed, gender, size, age, color);
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        if(country.isEmpty()||country.isBlank()){
            throw new RuntimeException("please provide size !");
        }
        Country = country;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats fish");
    }

    public void fly(){
        System.out.println(getName()+" is flying");
    }


}
