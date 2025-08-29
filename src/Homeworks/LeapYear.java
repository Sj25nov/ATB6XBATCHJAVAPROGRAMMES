package Homeworks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        //Leap Year
        Scanner Sc = new Scanner(System.in);
        System.out.println("Give me year number i will tell it is leap year or not");
        int year = Sc.nextInt();

        if (year % 4 == 0 && year != 100 || year % 400 == 0) {
            System.out.println("It is leap year");
        } else {
            System.out.println("It is not a leap year");
        }
        Sc.close();
    }
}
