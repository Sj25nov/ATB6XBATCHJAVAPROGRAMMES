package Homeworks;

import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Give me number so i will tell u-");
        int num=Sc.nextInt();

        if(num>0){
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is zero");
        }
        Sc.close();
    }
}
