package Homeworks;

import java.util.Scanner;

public class PositiveNegativeNo {
    //Positive negative and zero from given input number
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Give Number i will tell u it is positive or negative");
        int num= Sc.nextInt();

        if (num>0) {
            System.out.println("Number is Positive");
        } else if (num<0) {
            System.out.println("Number is negative");
        } else {

            System.out.println("Number is 0");
        }
        Sc.close();
    }
}