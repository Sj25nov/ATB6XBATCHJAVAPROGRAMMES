package ex_26082025;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {

            System.out.println("Odd");
        }
        sc.close();
    }
}