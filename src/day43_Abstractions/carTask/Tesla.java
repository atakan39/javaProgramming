package day43_Abstractions.carTask;

public class Tesla extends Car{
    public Tesla( String model,String color, int year,  double price) {
        super("tesla", model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("BBBB");
    }
}
