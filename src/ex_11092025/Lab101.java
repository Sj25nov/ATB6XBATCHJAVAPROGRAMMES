package ex_11092025;
import java.util.Scanner;

//import static java.awt.SystemColor.text;

public class Lab101 {
    public static void main(String[] args) {


       // Scanner Sc = new Scanner(System.in);

      //  System.out.println("Enter a string: ");
      //  String text = Sc.nextLine();
String text="madam";
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equalsIgnoreCase(reversed)) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is NOT a Palindrome");
        }

        //Sc.close();
    }
}
