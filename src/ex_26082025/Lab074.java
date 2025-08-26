package ex_26082025;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        //Max number from  2
        System.out.println("Enter your number 1");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();

        System.out.println("Enter your number 2");

        int num2= sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater");
        }else {
            System.out.println("Num2 is greater");
        }
        sc.close();

    }
}
