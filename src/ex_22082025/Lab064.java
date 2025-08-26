package ex_22082025;

import java.util.Locale;

public class Lab064 {
    public static void main(String[] args) {
        String Password="Saurabh@1234";
        String passu=Password.toLowerCase();
        //passu==Password ---->False
        //passu.equals(Password));---->false
        //passu.equalignoreCase--->True
        System.out.println(passu);
        System.out.println(passu==Password);
        System.out.println(passu.equals(Password));
        System.out.println(passu.equalsIgnoreCase(Password)); //Ignore the cases from the string
        System.out.println(passu.substring(0,3)); //it takes first three characters from the string
        System.out.println(Password.indexOf("S")); // It gives index number from the string
    }
}
