package day03_EscapeSequences;
/*
escaper sequences: MUST be given in/with double quote
      \n: starts a new line
      \t: paragraph space(tab)
      \\: single back slash
      \": double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");
        // once you run it each one have a new line on consule
        // which comes after \n
        System.out.println("---------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next week?");

        System.out.println("--------------------------------------------------------");

        System.out.println("\tJava is Cool Programming Language");

        System.out.println("--------------------------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two backward slashes

        System.out.println("--------------------------------------------------------");

        System.out.println("My favorite TV show is \"Game Of Throne\""); // in order to print double quote, we need to use \"

        System.out.println("\"");

    }
}
