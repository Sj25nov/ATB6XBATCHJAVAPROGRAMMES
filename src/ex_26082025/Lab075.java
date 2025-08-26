package ex_26082025;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //if there are three conditions that user is trying to run the we can use else if statement
        //e.g if the number is equal to 20 , greater than 20, less than 20
        System.out.println("Enter The Number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();

        if(num>20){
            System.out.println("number is greater than 20");
        } else if (num==20) {
            System.out.println("Number is equal to 20");
        }else{
            System.out.println("Number is less than 20");
        }
        sc.close();
    }
}
