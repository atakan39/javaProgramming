package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str= ""; //    "   " = blank      "" =empty   also if str= ""  blank and empty is true;

        boolean r=str.isEmpty();
        System.out.println(r);

        boolean r1=str.isBlank();
        System.out.println(r1);

        String str2="cydeo    "; // is not blank
        System.out.println();
        System.out.println("--------------------------------");

        String s1="CYDEO";
        String s2="cydeo";

        System.out.println(s1.equals(s2));    //     not equal

        System.out.println(s1.equalsIgnoreCase(s2));  // "cydeo" = "CYDEO"

        System.out.println("----------------------------------");

        System.out.println("yEs".equals("Yes"));
        System.out.println("yES".equalsIgnoreCase("Yes"));

        // contains means included      .contains();

        String sentence="My favorite proggraming language is Java";

        boolean hasCSharp =sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");  //jAvA

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("-----------------------------");
        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); // false

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("-----------------------------");

        String a="wooden Spoon";

        boolean x=a.startsWith("Woo"); //true
        boolean y=a.endsWith("Spoon");// true
        boolean z=a.toLowerCase().startsWith("wooden"); // in order case sensivity we fisrt creat lover case or upper case version of the string and than compare it with lowercase and uppercase..
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);







    }
}
