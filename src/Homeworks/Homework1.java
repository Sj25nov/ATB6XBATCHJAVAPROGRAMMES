package Homeworks;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //Largest From Three Numbers
        Scanner Sc=new Scanner(System.in);
        System.out.println("Give The Number I will tell you which one is Maximum");
        int num1=Sc.nextInt();
        int num2=Sc.nextInt();
        int num3=Sc.nextInt();
        
        if(num1>num2&&num1>num3){
            System.out.println("Number 1 is maximum");
        } else if (num2>num1&&num2>num3)
        {
            System.out.println("Number 2 is maximum");
        }else
        {
            System.out.println("number 3 is maximum");
        }
        Sc.close();
    }
}
