package day43_Abstractions.carTask;

public class Tesla extends Car{
    public Tesla( String model, int year, String color, double price) {
        super("tesla", model, year, color, price);
    }

    @Override
    public void start(){
        System.out.println("BBBB");
    }
}
