package day32_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car("Nissan");
        Car car2=new Car("Kia","Optima");
        Car car3=new Car("lexus","RX350",2021);
        Car car4=new Car("Audi","A5",2020,50000);
        Car car5=new Car("Audi","A4",2020,45000,"Gray");

        ArrayList<Car>cars=new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3,car4,car5));
        for (Car car : cars) {
            System.out.println(car);
        }

    }



}
