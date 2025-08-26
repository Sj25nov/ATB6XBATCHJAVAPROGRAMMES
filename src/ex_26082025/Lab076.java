package ex_26082025;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        System.out.println("Enter The Score");
        Scanner Sc=new Scanner(System.in);
       int score= Sc.nextInt();
        if(score>=75){
            System.out.println("Congratulations u Received Grade A");
        } else if (score<=74) {
            System.out.println("Congratultions u Received Grade B");
        }else
        {
            System.out.println("");
        }
    }
}
