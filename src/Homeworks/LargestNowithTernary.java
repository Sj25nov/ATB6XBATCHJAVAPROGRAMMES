package Homeworks;

import java.util.Scanner;

public class LargestNowithTernary {
    public static void main(String[] args) {
        //Ternary Operator with it ternary
        //Condition ? (if true)do this:(if false) do that
        Scanner Sc=new Scanner(System.in);
        System.out.println("Give me Three numbers i will tell's u which one is maximum");
        int num1=Sc.nextInt();
        int num2=Sc.nextInt();
        int num3=Sc.nextInt();
        //num1=90,num2=91;num3=100;
       // int largest_number= (num1>num2)?((num1>num3)?(num1:num3):((num2>num3)?(num2>num3);
        int largest_number2=(num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        //(num1>num2)? ((A) : ((B);
        System.out.println(largest_number2);
        Sc.close();
}
}
