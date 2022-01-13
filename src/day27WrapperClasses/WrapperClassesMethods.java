package day27WrapperClasses;

public class WrapperClassesMethods {
    public static void main(String[] args) {

        String str="123";

       int num= Integer.parseInt(str);  // int

        System.out.println(num+1); // 124
        System.out.println(str+1); // 1231

        String str2="10.5";

        double num2=Double.parseDouble(str2);

        System.out.println(num2+1);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = "+ min);

        String s1="true";

        Boolean.parseBoolean(s1);

        System.out.println(Boolean.parseBoolean(s1));

        System.out.println("_-------------------------------");

        String s2 ="123";

        Integer r2=Integer.valueOf(s2);    // Integer
        int y=Integer.valueOf(s2);         // Integer

        System.out.println(r2);            // Integer

        String s3 ="1.5";
        Double r3=Double.valueOf(s3);
        Double z=Double.valueOf(s3);

        System.out.println(z);

        System.out.println("------------------------------");

        // isDigit()

        char ch1 ='0';

        System.out.println(ch1+" is digit "+Character.isDigit(ch1));                  // isDigit()
        System.out.println(ch1+" is letter "+Character.isLetter(ch1));                // isLetter()
        System.out.println(ch1+" is special char "+!Character.isLetterOrDigit(ch1));  // special char

        System.out.println(ch1+" is uppercase "+Character.isLowerCase(ch1));         // isUppercase()
        System.out.println(ch1+" is uppercase "+Character.isUpperCase(ch1));         // isLowercase()

        System.out.println("-----------------------------------");

        String s="ab1cde2efg3hi4";

        int sum =0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                sum+=Integer.parseInt(s.charAt(i)+"");
            }
        }

        System.out.println(sum);

    }
}
