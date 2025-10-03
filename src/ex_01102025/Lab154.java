package ex_01102025;

import java.util.Scanner;

public class Lab154 {
   public static void main(String[] args) {
//We can reuse the functions multiple times
       //Divide The task into smaller chunks
       //Calculator
       //Sum
       //multiplication
       //sub
       Scanner sc=new Scanner(System.in);
        System.out.println("Give The Input 1");
        int num1=sc.nextInt();
       System.out.println("Give the Input 2");
        int num2=sc.nextInt();

        //Calculator---Sum
       int result_s1=sum(num1,num2);
       int result_s4=sum(90,80);
       int result_s2=sub(num1,num2);
       int result_s3=mult(num1,num2);

       System.out.println("The  Multiplication Of Two Numbers---->"+result_s3);
       System.out.println("The Addition Of Two Numbers---->"+result_s4);
       System.out.println("The Addition Of Two Numbers---->"+result_s1);
       System.out.println("The Substraction Of Two Numbers---->"+result_s2);

    }
    static int sum(int a,int b){
       return a+b;
    }
    static int sub(int a,int b) {
        return a-b;
    }
    static int mult(int a,int b) {
        return a*b;
    }
}
