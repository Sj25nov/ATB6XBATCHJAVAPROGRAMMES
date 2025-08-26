package ex_26082025;

import java.util.Scanner;

public class Lab079 {
    public static void main(String[] args) {
        //Triaangle Classifier

        //with given triangle side you need to verify what is the type of triangle is it
        //If all side are equal--->Equilateral
        //If Two side are equal--->Isosceles
        //If No sides are equal-->Scelen
        //side1 side 2 side3
        Scanner Sc=new Scanner(System.in);
        System.out.println("Give side1,side2,side3 i will tell you which triangle is it");
        int side1=Sc.nextInt();
        int side2=Sc.nextInt();
        int side3=Sc.nextInt();
        if(side1==side2&&side2==side3&&side1==side3){
            System.out.println("Traingle is Equilateral");
        } else if (side1==side2||side2==side3||side1==side3) {
            System.out.println("Triangle is Iscosceles");

        }else {
        System.out.println("Triangle is scelen");
    }
        Sc.close();
}}
