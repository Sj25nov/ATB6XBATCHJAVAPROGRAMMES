package Homeworks;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);
        System.out.println("Give Number 1");
        int num1=Sc.nextInt();
        System.out.println("Give Number 2");
        int num2=Sc.nextInt();
        System.out.println("Give Number 3");
        int num3=Sc.nextInt();
        if(num1>=num2&&num1>=num3){
            System.out.println("Number 1 is greater");
        } else if (num2>=num1&&num2>=num3) {
            System.out.println("Number 2 is greater");

        }else{
            System.out.println("Number 3 is greater");
        }
        Sc.close();
    }
}
