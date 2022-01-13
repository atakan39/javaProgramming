package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla( String model, int year, int miles, String color) {
        super("tesla", model, year, miles, color);
    }

    public void autoPilot(){
        System.out.println(brand+model+" has auto pilot");
    }
}
