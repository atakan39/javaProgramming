package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {
        int year = 2018;
        String make = " kia ",
                model ="optima, ";
        int millage =50000;
        String color=" silver, $";
        int price =19000;

        String scale ="Year Make Model, Milage,      Color, $Price.";
        System.out.println(scale);
        String CarDiscription = year+make+model+millage+" miles,"+color+price+".";
        System.out.println(CarDiscription);






    }
}
