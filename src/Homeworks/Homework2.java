package Homeworks;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter The value for the x");
        double x=Sc.nextDouble();
        System.out.println("Enter The Value For Y");
        double y=Sc.nextDouble();
        System.out.println("Enter The Value For Z");
        double z=Sc.nextDouble();
//3/x^2+y^2-|z|
        // A+B-C  A->x^2 ,B->y^2,C->|Z|-->|-2|--->Value should be positive only
        double result;
        result=Math.cbrt((Math.pow(x,2))+(Math.pow(y,2))-(Math.abs(z)));

        System.out.println(result);
        Sc.close();

    }
}
