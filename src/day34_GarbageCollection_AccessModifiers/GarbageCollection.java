package day34_GarbageCollection_AccessModifiers;


import day32_Constructors.Car;

public class GarbageCollection {

    public static void main(String[] args) {
/*
        // int n = null;

        String str=null;   //null makes eligible for garbege collecter.

        System.out.println(str.toUpperCase()); // gives us an error because null is not an object
 */
        String str="Wooden spoon"; // after line 13 "wooden spoon" will be eligible for garbage collection;
        str=null;

        System.out.println(str);

        Car car1=new Car("toyoto");
        car1.color="gray";

        System.out.println(car1);

        car1=null;

        System.out.println(car1);



    }
}
