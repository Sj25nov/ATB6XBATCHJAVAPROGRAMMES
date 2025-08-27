package ex_27082025;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=Sc.nextLine();
        System.out.println("Enter Your age");
        int age=Sc.nextInt();
        System.out.println("Enter Your salary");
        double salary=Sc.nextDouble();


        System.out.println("My name is-->" +name);
        System.out.println("My age is-->" +age);
        System.out.println("My Salary is--->" +salary);
        Sc.close();
    }
}
