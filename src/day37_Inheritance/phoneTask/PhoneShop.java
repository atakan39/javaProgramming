package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone= new Iphone("Iphone 12","6.7 inches",1000,"Black");

        Samsung samsung= new Samsung("galaxy S19","6.7 inches",1000,"Black");

        Nokia nokia = new Nokia("Brick", "4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.faceTime(12345678);
        iphone.faceTime("yahoo@gmail.com");

        samsung.call(911);
        samsung.text(1234567);
        samsung.freeze();

        nokia.call(911);
        nokia.text(374637466);
        nokia.selfDefence();



    }
}
