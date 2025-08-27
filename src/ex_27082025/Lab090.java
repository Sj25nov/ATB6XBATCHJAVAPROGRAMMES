package ex_27082025;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        //Programme to check grades accordingly markd
        Scanner Sc=new Scanner(System.in);
        System.out.println("Marks");
        int marks=Sc.nextInt();

        //90--->90/10--->9--->A
        //80--->80/10--->8--->B
        //70--->70/10--->7--->C
        //80--->80/10---->6--->D

        marks=marks/10;

        switch (marks){
            case 9:
                System.out.println("Your Grade is A");
                break;
            case 8:
                System.out.println("Your Grade is B");
                break;
            case 7:
                System.out.println("Your Grade is C");
                break;
            case 6:
                System.out.println("Your Grade D");
                break;
            default:
                System.out.println("None");


        }


        System.out.println("Congratulation for successfully Passed");
        Sc.close();
    }
}
